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
 * TPqPowerqltyresult entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPqPowerqltyresult
 * @author MyEclipse Persistence Tools
 */

public class TPqPowerqltyresultDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPqPowerqltyresultDAO.class);
	// property constants
	public static final String _FPOWERQLTYVALUE = "FPowerqltyvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(TPqPowerqltyresult transientInstance) {
		log.debug("saving TPqPowerqltyresult instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPqPowerqltyresult persistentInstance) {
		log.debug("deleting TPqPowerqltyresult instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPqPowerqltyresult findById(java.lang.String id) {
		log.debug("getting TPqPowerqltyresult instance with id: " + id);
		try {
			TPqPowerqltyresult instance = (TPqPowerqltyresult) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPqPowerqltyresult", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPqPowerqltyresult instance) {
		log.debug("finding TPqPowerqltyresult instance by example");
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
		log.debug("finding TPqPowerqltyresult instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPqPowerqltyresult as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFPowerqltyvalue(Object FPowerqltyvalue) {
		return findByProperty(_FPOWERQLTYVALUE, FPowerqltyvalue);
	}

	public List findAll() {
		log.debug("finding all TPqPowerqltyresult instances");
		try {
			String queryString = "from TPqPowerqltyresult";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPqPowerqltyresult merge(TPqPowerqltyresult detachedInstance) {
		log.debug("merging TPqPowerqltyresult instance");
		try {
			TPqPowerqltyresult result = (TPqPowerqltyresult) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPqPowerqltyresult instance) {
		log.debug("attaching dirty TPqPowerqltyresult instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPqPowerqltyresult instance) {
		log.debug("attaching clean TPqPowerqltyresult instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPqPowerqltyresultDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPqPowerqltyresultDAO) ctx.getBean("TPqPowerqltyresultDAO");
	}
}