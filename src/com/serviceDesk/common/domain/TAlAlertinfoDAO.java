package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TAlAlertinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TAlAlertinfo
 * @author MyEclipse Persistence Tools
 */

public class TAlAlertinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TAlAlertinfoDAO.class);
	// property constants
	public static final String _FALERTVALUE = "FAlertvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(TAlAlertinfo transientInstance) {
		log.debug("saving TAlAlertinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TAlAlertinfo persistentInstance) {
		log.debug("deleting TAlAlertinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TAlAlertinfo findById(java.math.BigDecimal id) {
		log.debug("getting TAlAlertinfo instance with id: " + id);
		try {
			TAlAlertinfo instance = (TAlAlertinfo) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.TAlAlertinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TAlAlertinfo instance) {
		log.debug("finding TAlAlertinfo instance by example");
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
		log.debug("finding TAlAlertinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TAlAlertinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFAlertvalue(Object FAlertvalue) {
		return findByProperty(_FALERTVALUE, FAlertvalue);
	}

	public List findAll() {
		log.debug("finding all TAlAlertinfo instances");
		try {
			String queryString = "from TAlAlertinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TAlAlertinfo merge(TAlAlertinfo detachedInstance) {
		log.debug("merging TAlAlertinfo instance");
		try {
			TAlAlertinfo result = (TAlAlertinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TAlAlertinfo instance) {
		log.debug("attaching dirty TAlAlertinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TAlAlertinfo instance) {
		log.debug("attaching clean TAlAlertinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TAlAlertinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TAlAlertinfoDAO) ctx.getBean("TAlAlertinfoDAO");
	}
}