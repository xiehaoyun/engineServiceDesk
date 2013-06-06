package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdMaintapgrelainfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdMaintapgrelainfo
 * @author MyEclipse Persistence Tools
 */

public class TPdMaintapgrelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdMaintapgrelainfoDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(TPdMaintapgrelainfo transientInstance) {
		log.debug("saving TPdMaintapgrelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdMaintapgrelainfo persistentInstance) {
		log.debug("deleting TPdMaintapgrelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdMaintapgrelainfo findById(
			com.serviceDesk.common.domain.TPdMaintapgrelainfoId id) {
		log.debug("getting TPdMaintapgrelainfo instance with id: " + id);
		try {
			TPdMaintapgrelainfo instance = (TPdMaintapgrelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdMaintapgrelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdMaintapgrelainfo instance) {
		log.debug("finding TPdMaintapgrelainfo instance by example");
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
		log.debug("finding TPdMaintapgrelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdMaintapgrelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TPdMaintapgrelainfo instances");
		try {
			String queryString = "from TPdMaintapgrelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdMaintapgrelainfo merge(TPdMaintapgrelainfo detachedInstance) {
		log.debug("merging TPdMaintapgrelainfo instance");
		try {
			TPdMaintapgrelainfo result = (TPdMaintapgrelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdMaintapgrelainfo instance) {
		log.debug("attaching dirty TPdMaintapgrelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdMaintapgrelainfo instance) {
		log.debug("attaching clean TPdMaintapgrelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdMaintapgrelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdMaintapgrelainfoDAO) ctx.getBean("TPdMaintapgrelainfoDAO");
	}
}