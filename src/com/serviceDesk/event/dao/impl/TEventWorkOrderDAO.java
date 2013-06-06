package com.serviceDesk.event.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.serviceDesk.event.domain.TEventWorkOrder;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEventWorkOrder entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.event.domain.TEventWorkOrder
 * @author MyEclipse Persistence Tools
 */

public class TEventWorkOrderDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEventWorkOrderDAO.class);
	// property constants
	public static final String CREATOR_NAME = "creatorName";
	public static final String SERVICE_RECORD = "serviceRecord";

	protected void initDao() {
		// do nothing
	}

	public void save(TEventWorkOrder transientInstance) {
		log.debug("saving TEventWorkOrder instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEventWorkOrder persistentInstance) {
		log.debug("deleting TEventWorkOrder instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEventWorkOrder findById(java.lang.Integer id) {
		log.debug("getting TEventWorkOrder instance with id: " + id);
		try {
			TEventWorkOrder instance = (TEventWorkOrder) getHibernateTemplate()
					.get("com.serviceDesk.event.domain.TEventWorkOrder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEventWorkOrder instance) {
		log.debug("finding TEventWorkOrder instance by example");
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
		log.debug("finding TEventWorkOrder instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEventWorkOrder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCreatorName(Object creatorName) {
		return findByProperty(CREATOR_NAME, creatorName);
	}

	public List findByServiceRecord(Object serviceRecord) {
		return findByProperty(SERVICE_RECORD, serviceRecord);
	}

	public List findAll() {
		log.debug("finding all TEventWorkOrder instances");
		try {
			String queryString = "from TEventWorkOrder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEventWorkOrder merge(TEventWorkOrder detachedInstance) {
		log.debug("merging TEventWorkOrder instance");
		try {
			TEventWorkOrder result = (TEventWorkOrder) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEventWorkOrder instance) {
		log.debug("attaching dirty TEventWorkOrder instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEventWorkOrder instance) {
		log.debug("attaching clean TEventWorkOrder instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEventWorkOrderDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEventWorkOrderDAO) ctx.getBean("TEventWorkOrderDAO");
	}
}