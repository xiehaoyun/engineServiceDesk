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
 * TDtPowerqltyitemdict entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TDtPowerqltyitemdict
 * @author MyEclipse Persistence Tools
 */

public class TDtPowerqltyitemdictDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TDtPowerqltyitemdictDAO.class);
	// property constants
	public static final String _FPOWERQLTYITEMNAME = "FPowerqltyitemname";
	public static final String _FPARENTITEMCODE = "FParentitemcode";
	public static final String _FPOWERQLTYITEMTYPE = "FPowerqltyitemtype";
	public static final String _FPOWERQLTYITEMUNIT = "FPowerqltyitemunit";

	protected void initDao() {
		// do nothing
	}

	public void save(TDtPowerqltyitemdict transientInstance) {
		log.debug("saving TDtPowerqltyitemdict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDtPowerqltyitemdict persistentInstance) {
		log.debug("deleting TDtPowerqltyitemdict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDtPowerqltyitemdict findById(java.lang.String id) {
		log.debug("getting TDtPowerqltyitemdict instance with id: " + id);
		try {
			TDtPowerqltyitemdict instance = (TDtPowerqltyitemdict) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TDtPowerqltyitemdict",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDtPowerqltyitemdict instance) {
		log.debug("finding TDtPowerqltyitemdict instance by example");
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
		log.debug("finding TDtPowerqltyitemdict instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TDtPowerqltyitemdict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFPowerqltyitemname(Object FPowerqltyitemname) {
		return findByProperty(_FPOWERQLTYITEMNAME, FPowerqltyitemname);
	}

	public List findByFParentitemcode(Object FParentitemcode) {
		return findByProperty(_FPARENTITEMCODE, FParentitemcode);
	}

	public List findByFPowerqltyitemtype(Object FPowerqltyitemtype) {
		return findByProperty(_FPOWERQLTYITEMTYPE, FPowerqltyitemtype);
	}

	public List findByFPowerqltyitemunit(Object FPowerqltyitemunit) {
		return findByProperty(_FPOWERQLTYITEMUNIT, FPowerqltyitemunit);
	}

	public List findAll() {
		log.debug("finding all TDtPowerqltyitemdict instances");
		try {
			String queryString = "from TDtPowerqltyitemdict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDtPowerqltyitemdict merge(TDtPowerqltyitemdict detachedInstance) {
		log.debug("merging TDtPowerqltyitemdict instance");
		try {
			TDtPowerqltyitemdict result = (TDtPowerqltyitemdict) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDtPowerqltyitemdict instance) {
		log.debug("attaching dirty TDtPowerqltyitemdict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDtPowerqltyitemdict instance) {
		log.debug("attaching clean TDtPowerqltyitemdict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDtPowerqltyitemdictDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TDtPowerqltyitemdictDAO) ctx.getBean("TDtPowerqltyitemdictDAO");
	}
}