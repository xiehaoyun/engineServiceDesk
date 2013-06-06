package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDtEnvironitemdict entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TDtEnvironitemdict
 * @author MyEclipse Persistence Tools
 */

public class TDtEnvironitemdictDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TDtEnvironitemdictDAO.class);
	// property constants
	public static final String _FENVIRONITEMNAME = "FEnvironitemname";
	public static final String _FPARENTITEMCODE = "FParentitemcode";
	public static final String _FENVIRONITEMTYPE = "FEnvironitemtype";
	public static final String _FENVIRONITEMUNIT = "FEnvironitemunit";

	protected void initDao() {
		// do nothing
	}

	public void save(TDtEnvironitemdict transientInstance) {
		log.debug("saving TDtEnvironitemdict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDtEnvironitemdict persistentInstance) {
		log.debug("deleting TDtEnvironitemdict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDtEnvironitemdict findById(java.lang.String id) {
		log.debug("getting TDtEnvironitemdict instance with id: " + id);
		try {
			TDtEnvironitemdict instance = (TDtEnvironitemdict) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TDtEnvironitemdict", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDtEnvironitemdict instance) {
		log.debug("finding TDtEnvironitemdict instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TDtEnvironitemdict instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TDtEnvironitemdict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFEnvironitemname(Object FEnvironitemname) {
		return findByProperty(_FENVIRONITEMNAME, FEnvironitemname);
	}

	public List findByFParentitemcode(Object FParentitemcode) {
		return findByProperty(_FPARENTITEMCODE, FParentitemcode);
	}

	public List findByFEnvironitemtype(Object FEnvironitemtype) {
		return findByProperty(_FENVIRONITEMTYPE, FEnvironitemtype);
	}

	public List findByFEnvironitemunit(Object FEnvironitemunit) {
		return findByProperty(_FENVIRONITEMUNIT, FEnvironitemunit);
	}

	public List findAll() {
		log.debug("finding all TDtEnvironitemdict instances");
		try {
			String queryString = "from TDtEnvironitemdict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDtEnvironitemdict merge(TDtEnvironitemdict detachedInstance) {
		log.debug("merging TDtEnvironitemdict instance");
		try {
			TDtEnvironitemdict result = (TDtEnvironitemdict) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDtEnvironitemdict instance) {
		log.debug("attaching dirty TDtEnvironitemdict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDtEnvironitemdict instance) {
		log.debug("attaching clean TDtEnvironitemdict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDtEnvironitemdictDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TDtEnvironitemdictDAO) ctx.getBean("TDtEnvironitemdictDAO");
	}
}