package com.serviceDesk.common.domain;

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
 * TPdDevassetsinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdDevassetsinfo
 * @author MyEclipse Persistence Tools
 */

public class TPdDevassetsinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDevassetsinfoDAO.class);
	// property constants
	public static final String _FINSTALLOPERATOR = "FInstalloperator";
	public static final String _FSERVICELIFE = "FServicelife";
	public static final String _FDEPRELIFE = "FDeprelife";
	public static final String _FREMOVEOPERATOR = "FRemoveoperator";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDevassetsinfo transientInstance) {
		log.debug("saving TPdDevassetsinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDevassetsinfo persistentInstance) {
		log.debug("deleting TPdDevassetsinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDevassetsinfo findById(java.lang.String id) {
		log.debug("getting TPdDevassetsinfo instance with id: " + id);
		try {
			TPdDevassetsinfo instance = (TPdDevassetsinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDevassetsinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdDevassetsinfo instance) {
		log.debug("finding TPdDevassetsinfo instance by example");
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
		log.debug("finding TPdDevassetsinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDevassetsinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFInstalloperator(Object FInstalloperator) {
		return findByProperty(_FINSTALLOPERATOR, FInstalloperator);
	}

	public List findByFServicelife(Object FServicelife) {
		return findByProperty(_FSERVICELIFE, FServicelife);
	}

	public List findByFDeprelife(Object FDeprelife) {
		return findByProperty(_FDEPRELIFE, FDeprelife);
	}

	public List findByFRemoveoperator(Object FRemoveoperator) {
		return findByProperty(_FREMOVEOPERATOR, FRemoveoperator);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TPdDevassetsinfo instances");
		try {
			String queryString = "from TPdDevassetsinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDevassetsinfo merge(TPdDevassetsinfo detachedInstance) {
		log.debug("merging TPdDevassetsinfo instance");
		try {
			TPdDevassetsinfo result = (TPdDevassetsinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDevassetsinfo instance) {
		log.debug("attaching dirty TPdDevassetsinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDevassetsinfo instance) {
		log.debug("attaching clean TPdDevassetsinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDevassetsinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdDevassetsinfoDAO) ctx.getBean("TPdDevassetsinfoDAO");
	}
}