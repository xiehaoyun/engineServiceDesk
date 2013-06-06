package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOvMeterorigvalue entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TOvMeterorigvalue
 * @author MyEclipse Persistence Tools
 */

public class TOvMeterorigvalueDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TOvMeterorigvalueDAO.class);
	// property constants
	public static final String _FORIGVALUE = "FOrigvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(TOvMeterorigvalue transientInstance) {
		log.debug("saving TOvMeterorigvalue instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TOvMeterorigvalue persistentInstance) {
		log.debug("deleting TOvMeterorigvalue instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TOvMeterorigvalue findById(java.math.BigDecimal id) {
		log.debug("getting TOvMeterorigvalue instance with id: " + id);
		try {
			TOvMeterorigvalue instance = (TOvMeterorigvalue) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TOvMeterorigvalue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TOvMeterorigvalue instance) {
		log.debug("finding TOvMeterorigvalue instance by example");
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
		log.debug("finding TOvMeterorigvalue instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TOvMeterorigvalue as model where model."
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

	public List findAll() {
		log.debug("finding all TOvMeterorigvalue instances");
		try {
			String queryString = "from TOvMeterorigvalue";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TOvMeterorigvalue merge(TOvMeterorigvalue detachedInstance) {
		log.debug("merging TOvMeterorigvalue instance");
		try {
			TOvMeterorigvalue result = (TOvMeterorigvalue) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TOvMeterorigvalue instance) {
		log.debug("attaching dirty TOvMeterorigvalue instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TOvMeterorigvalue instance) {
		log.debug("attaching clean TOvMeterorigvalue instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TOvMeterorigvalueDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TOvMeterorigvalueDAO) ctx.getBean("TOvMeterorigvalueDAO");
	}
}