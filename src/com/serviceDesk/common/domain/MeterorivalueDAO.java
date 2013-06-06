package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Meterorivalue entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.Meterorivalue
 * @author MyEclipse Persistence Tools
 */

public class MeterorivalueDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(MeterorivalueDAO.class);
	// property constants
	public static final String _FORIGVALUE = "FOrigvalue";
	public static final String _FLASTVALUE = "FLastvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(Meterorivalue transientInstance) {
		log.debug("saving Meterorivalue instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Meterorivalue persistentInstance) {
		log.debug("deleting Meterorivalue instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Meterorivalue findById(java.math.BigDecimal id) {
		log.debug("getting Meterorivalue instance with id: " + id);
		try {
			Meterorivalue instance = (Meterorivalue) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.Meterorivalue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Meterorivalue instance) {
		log.debug("finding Meterorivalue instance by example");
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
		log.debug("finding Meterorivalue instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Meterorivalue as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFOrigvalue(Object FOrigvalue) {
		return findByProperty(_FORIGVALUE, FOrigvalue);
	}

	public List findByFLastvalue(Object FLastvalue) {
		return findByProperty(_FLASTVALUE, FLastvalue);
	}

	public List findAll() {
		log.debug("finding all Meterorivalue instances");
		try {
			String queryString = "from Meterorivalue";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Meterorivalue merge(Meterorivalue detachedInstance) {
		log.debug("merging Meterorivalue instance");
		try {
			Meterorivalue result = (Meterorivalue) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Meterorivalue instance) {
		log.debug("attaching dirty Meterorivalue instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Meterorivalue instance) {
		log.debug("attaching clean Meterorivalue instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MeterorivalueDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (MeterorivalueDAO) ctx.getBean("MeterorivalueDAO");
	}
}