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
 * TPdDevstateresult entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdDevstateresult
 * @author MyEclipse Persistence Tools
 */

public class TPdDevstateresultDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDevstateresultDAO.class);
	// property constants
	public static final String _FDEVSTATEVALUE = "FDevstatevalue";
	public static final String _FDEVSTATEDESC = "FDevstatedesc";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDevstateresult transientInstance) {
		log.debug("saving TPdDevstateresult instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDevstateresult persistentInstance) {
		log.debug("deleting TPdDevstateresult instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDevstateresult findById(java.math.BigDecimal id) {
		log.debug("getting TPdDevstateresult instance with id: " + id);
		try {
			TPdDevstateresult instance = (TPdDevstateresult) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDevstateresult", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdDevstateresult instance) {
		log.debug("finding TPdDevstateresult instance by example");
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
		log.debug("finding TPdDevstateresult instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDevstateresult as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDevstatevalue(Object FDevstatevalue) {
		return findByProperty(_FDEVSTATEVALUE, FDevstatevalue);
	}

	public List findByFDevstatedesc(Object FDevstatedesc) {
		return findByProperty(_FDEVSTATEDESC, FDevstatedesc);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TPdDevstateresult instances");
		try {
			String queryString = "from TPdDevstateresult";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDevstateresult merge(TPdDevstateresult detachedInstance) {
		log.debug("merging TPdDevstateresult instance");
		try {
			TPdDevstateresult result = (TPdDevstateresult) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDevstateresult instance) {
		log.debug("attaching dirty TPdDevstateresult instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDevstateresult instance) {
		log.debug("attaching clean TPdDevstateresult instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDevstateresultDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdDevstateresultDAO) ctx.getBean("TPdDevstateresultDAO");
	}
}