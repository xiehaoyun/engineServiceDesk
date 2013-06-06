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
 * TStMeterparaminfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TStMeterparaminfo
 * @author MyEclipse Persistence Tools
 */

public class TStMeterparaminfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TStMeterparaminfoDAO.class);
	// property constants
	public static final String _FMETERPARAMNAME = "FMeterparamname";
	public static final String _FCHANGERATE = "FChangerate";
	public static final String _FVALUETYPE = "FValuetype";

	protected void initDao() {
		// do nothing
	}

	public void save(TStMeterparaminfo transientInstance) {
		log.debug("saving TStMeterparaminfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TStMeterparaminfo persistentInstance) {
		log.debug("deleting TStMeterparaminfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TStMeterparaminfo findById(java.lang.String id) {
		log.debug("getting TStMeterparaminfo instance with id: " + id);
		try {
			TStMeterparaminfo instance = (TStMeterparaminfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TStMeterparaminfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TStMeterparaminfo instance) {
		log.debug("finding TStMeterparaminfo instance by example");
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
		log.debug("finding TStMeterparaminfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TStMeterparaminfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMeterparamname(Object FMeterparamname) {
		return findByProperty(_FMETERPARAMNAME, FMeterparamname);
	}

	public List findByFChangerate(Object FChangerate) {
		return findByProperty(_FCHANGERATE, FChangerate);
	}

	public List findByFValuetype(Object FValuetype) {
		return findByProperty(_FVALUETYPE, FValuetype);
	}

	public List findAll() {
		log.debug("finding all TStMeterparaminfo instances");
		try {
			String queryString = "from TStMeterparaminfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TStMeterparaminfo merge(TStMeterparaminfo detachedInstance) {
		log.debug("merging TStMeterparaminfo instance");
		try {
			TStMeterparaminfo result = (TStMeterparaminfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TStMeterparaminfo instance) {
		log.debug("attaching dirty TStMeterparaminfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TStMeterparaminfo instance) {
		log.debug("attaching clean TStMeterparaminfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TStMeterparaminfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TStMeterparaminfoDAO) ctx.getBean("TStMeterparaminfoDAO");
	}
}