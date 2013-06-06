package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdPowergridlevelrelainfo entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.serviceDesk.common.domain.TPdPowergridlevelrelainfo
 * @author MyEclipse Persistence Tools
 */

public class TPdPowergridlevelrelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdPowergridlevelrelainfoDAO.class);
	// property constants
	public static final String _FPOWERGRIDLEVELDESC = "FPowergridleveldesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdPowergridlevelrelainfo transientInstance) {
		log.debug("saving TPdPowergridlevelrelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdPowergridlevelrelainfo persistentInstance) {
		log.debug("deleting TPdPowergridlevelrelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdPowergridlevelrelainfo findById(
			com.serviceDesk.common.domain.TPdPowergridlevelrelainfoId id) {
		log.debug("getting TPdPowergridlevelrelainfo instance with id: " + id);
		try {
			TPdPowergridlevelrelainfo instance = (TPdPowergridlevelrelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdPowergridlevelrelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdPowergridlevelrelainfo instance) {
		log.debug("finding TPdPowergridlevelrelainfo instance by example");
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
		log.debug("finding TPdPowergridlevelrelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdPowergridlevelrelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFPowergridleveldesc(Object FPowergridleveldesc) {
		return findByProperty(_FPOWERGRIDLEVELDESC, FPowergridleveldesc);
	}

	public List findAll() {
		log.debug("finding all TPdPowergridlevelrelainfo instances");
		try {
			String queryString = "from TPdPowergridlevelrelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdPowergridlevelrelainfo merge(
			TPdPowergridlevelrelainfo detachedInstance) {
		log.debug("merging TPdPowergridlevelrelainfo instance");
		try {
			TPdPowergridlevelrelainfo result = (TPdPowergridlevelrelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdPowergridlevelrelainfo instance) {
		log.debug("attaching dirty TPdPowergridlevelrelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdPowergridlevelrelainfo instance) {
		log.debug("attaching clean TPdPowergridlevelrelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdPowergridlevelrelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdPowergridlevelrelainfoDAO) ctx
				.getBean("TPdPowergridlevelrelainfoDAO");
	}
}