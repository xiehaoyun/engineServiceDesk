package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEvChangeworkorder entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEvChangeworkorder
 * @author MyEclipse Persistence Tools
 */

public class TEvChangeworkorderDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEvChangeworkorderDAO.class);
	// property constants
	public static final String _FFAULTDESC = "FFaultdesc";
	public static final String _FFAULTREASON = "FFaultreason";
	public static final String _FPREASSETSID = "FPreassetsid";
	public static final String _FAFTERASSETSID = "FAfterassetsid";

	protected void initDao() {
		// do nothing
	}

	public void save(TEvChangeworkorder transientInstance) {
		log.debug("saving TEvChangeworkorder instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEvChangeworkorder persistentInstance) {
		log.debug("deleting TEvChangeworkorder instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEvChangeworkorder findById(java.math.BigDecimal id) {
		log.debug("getting TEvChangeworkorder instance with id: " + id);
		try {
			TEvChangeworkorder instance = (TEvChangeworkorder) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEvChangeworkorder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEvChangeworkorder instance) {
		log.debug("finding TEvChangeworkorder instance by example");
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
		log.debug("finding TEvChangeworkorder instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEvChangeworkorder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFFaultdesc(Object FFaultdesc) {
		return findByProperty(_FFAULTDESC, FFaultdesc);
	}

	public List findByFFaultreason(Object FFaultreason) {
		return findByProperty(_FFAULTREASON, FFaultreason);
	}

	public List findByFPreassetsid(Object FPreassetsid) {
		return findByProperty(_FPREASSETSID, FPreassetsid);
	}

	public List findByFAfterassetsid(Object FAfterassetsid) {
		return findByProperty(_FAFTERASSETSID, FAfterassetsid);
	}

	public List findAll() {
		log.debug("finding all TEvChangeworkorder instances");
		try {
			String queryString = "from TEvChangeworkorder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEvChangeworkorder merge(TEvChangeworkorder detachedInstance) {
		log.debug("merging TEvChangeworkorder instance");
		try {
			TEvChangeworkorder result = (TEvChangeworkorder) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEvChangeworkorder instance) {
		log.debug("attaching dirty TEvChangeworkorder instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEvChangeworkorder instance) {
		log.debug("attaching clean TEvChangeworkorder instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEvChangeworkorderDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEvChangeworkorderDAO) ctx.getBean("TEvChangeworkorderDAO");
	}
}