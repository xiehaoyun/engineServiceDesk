package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdDepartmaintarelainfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdDepartmaintarelainfo
 * @author MyEclipse Persistence Tools
 */

public class TPdDepartmaintarelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDepartmaintarelainfoDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDepartmaintarelainfo transientInstance) {
		log.debug("saving TPdDepartmaintarelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDepartmaintarelainfo persistentInstance) {
		log.debug("deleting TPdDepartmaintarelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDepartmaintarelainfo findById(
			com.serviceDesk.common.domain.TPdDepartmaintarelainfoId id) {
		log.debug("getting TPdDepartmaintarelainfo instance with id: " + id);
		try {
			TPdDepartmaintarelainfo instance = (TPdDepartmaintarelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDepartmaintarelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdDepartmaintarelainfo instance) {
		log.debug("finding TPdDepartmaintarelainfo instance by example");
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
		log.debug("finding TPdDepartmaintarelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDepartmaintarelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TPdDepartmaintarelainfo instances");
		try {
			String queryString = "from TPdDepartmaintarelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDepartmaintarelainfo merge(
			TPdDepartmaintarelainfo detachedInstance) {
		log.debug("merging TPdDepartmaintarelainfo instance");
		try {
			TPdDepartmaintarelainfo result = (TPdDepartmaintarelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDepartmaintarelainfo instance) {
		log.debug("attaching dirty TPdDepartmaintarelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDepartmaintarelainfo instance) {
		log.debug("attaching clean TPdDepartmaintarelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDepartmaintarelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdDepartmaintarelainfoDAO) ctx
				.getBean("TPdDepartmaintarelainfoDAO");
	}
}