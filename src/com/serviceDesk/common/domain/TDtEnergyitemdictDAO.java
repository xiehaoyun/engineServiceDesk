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
 * TDtEnergyitemdict entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TDtEnergyitemdict
 * @author MyEclipse Persistence Tools
 */

public class TDtEnergyitemdictDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TDtEnergyitemdictDAO.class);
	// property constants
	public static final String _FENERGYITEMNAME = "FEnergyitemname";
	public static final String _FPARENTITEMCODE = "FParentitemcode";
	public static final String _FENERGYITEMTYPE = "FEnergyitemtype";
	public static final String _FENERGYITEMUNIT = "FEnergyitemunit";
	public static final String _FENERGYITEMFML = "FEnergyitemfml";

	protected void initDao() {
		// do nothing
	}

	public void save(TDtEnergyitemdict transientInstance) {
		log.debug("saving TDtEnergyitemdict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDtEnergyitemdict persistentInstance) {
		log.debug("deleting TDtEnergyitemdict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDtEnergyitemdict findById(java.lang.String id) {
		log.debug("getting TDtEnergyitemdict instance with id: " + id);
		try {
			TDtEnergyitemdict instance = (TDtEnergyitemdict) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TDtEnergyitemdict", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDtEnergyitemdict instance) {
		log.debug("finding TDtEnergyitemdict instance by example");
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
		log.debug("finding TDtEnergyitemdict instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TDtEnergyitemdict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFEnergyitemname(Object FEnergyitemname) {
		return findByProperty(_FENERGYITEMNAME, FEnergyitemname);
	}

	public List findByFParentitemcode(Object FParentitemcode) {
		return findByProperty(_FPARENTITEMCODE, FParentitemcode);
	}

	public List findByFEnergyitemtype(Object FEnergyitemtype) {
		return findByProperty(_FENERGYITEMTYPE, FEnergyitemtype);
	}

	public List findByFEnergyitemunit(Object FEnergyitemunit) {
		return findByProperty(_FENERGYITEMUNIT, FEnergyitemunit);
	}

	public List findByFEnergyitemfml(Object FEnergyitemfml) {
		return findByProperty(_FENERGYITEMFML, FEnergyitemfml);
	}

	public List findAll() {
		log.debug("finding all TDtEnergyitemdict instances");
		try {
			String queryString = "from TDtEnergyitemdict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDtEnergyitemdict merge(TDtEnergyitemdict detachedInstance) {
		log.debug("merging TDtEnergyitemdict instance");
		try {
			TDtEnergyitemdict result = (TDtEnergyitemdict) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDtEnergyitemdict instance) {
		log.debug("attaching dirty TDtEnergyitemdict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDtEnergyitemdict instance) {
		log.debug("attaching clean TDtEnergyitemdict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDtEnergyitemdictDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TDtEnergyitemdictDAO) ctx.getBean("TDtEnergyitemdictDAO");
	}
}