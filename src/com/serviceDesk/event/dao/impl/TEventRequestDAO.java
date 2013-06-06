package com.serviceDesk.event.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.serviceDesk.event.domain.TEventRequest;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEventRequest entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.event.domain.TEventRequest
 * @author MyEclipse Persistence Tools
 */

public class TEventRequestDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEventRequestDAO.class);
	// property constants
	public static final String EVENT_SOURCE = "eventSource";
	public static final String EVENT_LEVEL = "eventLevel";
	public static final String EVENT_STATUS = "eventStatus";
	public static final String DESCRIPTION = "description";
	public static final String SATISFACTION = "satisfaction";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_PHONE = "customerPhone";
	public static final String MANAGER_NAME = "managerName";
	public static final String ORG_NAME = "orgName";
	public static final String DEPART_NAME = "departName";
	public static final String BUILD_NAME = "buildName";
	public static final String MONITOR_AREA_NAME = "monitorAreaName";
	public static final String CREATOR_NAME = "creatorName";
	public static final String SERVICE_RECORD = "serviceRecord";

	protected void initDao() {
		// do nothing
	}

	public void save(TEventRequest transientInstance) {
		log.debug("saving TEventRequest instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEventRequest persistentInstance) {
		log.debug("deleting TEventRequest instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEventRequest findById(java.lang.Integer id) {
		log.debug("getting TEventRequest instance with id: " + id);
		try {
			TEventRequest instance = (TEventRequest) getHibernateTemplate()
					.get("com.serviceDesk.event.domain.TEventRequest", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEventRequest instance) {
		log.debug("finding TEventRequest instance by example");
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
		log.debug("finding TEventRequest instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEventRequest as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEventSource(Object eventSource) {
		return findByProperty(EVENT_SOURCE, eventSource);
	}

	public List findByEventLevel(Object eventLevel) {
		return findByProperty(EVENT_LEVEL, eventLevel);
	}

	public List findByEventStatus(Object eventStatus) {
		return findByProperty(EVENT_STATUS, eventStatus);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findBySatisfaction(Object satisfaction) {
		return findByProperty(SATISFACTION, satisfaction);
	}

	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	public List findByCustomerPhone(Object customerPhone) {
		return findByProperty(CUSTOMER_PHONE, customerPhone);
	}

	public List findByManagerName(Object managerName) {
		return findByProperty(MANAGER_NAME, managerName);
	}

	public List findByOrgName(Object orgName) {
		return findByProperty(ORG_NAME, orgName);
	}

	public List findByDepartName(Object departName) {
		return findByProperty(DEPART_NAME, departName);
	}

	public List findByBuildName(Object buildName) {
		return findByProperty(BUILD_NAME, buildName);
	}

	public List findByMonitorAreaName(Object monitorAreaName) {
		return findByProperty(MONITOR_AREA_NAME, monitorAreaName);
	}

	public List findByCreatorName(Object creatorName) {
		return findByProperty(CREATOR_NAME, creatorName);
	}

	public List findByServiceRecord(Object serviceRecord) {
		return findByProperty(SERVICE_RECORD, serviceRecord);
	}

	public List findAll() {
		log.debug("finding all TEventRequest instances");
		try {
			String queryString = "from TEventRequest";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEventRequest merge(TEventRequest detachedInstance) {
		log.debug("merging TEventRequest instance");
		try {
			TEventRequest result = (TEventRequest) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEventRequest instance) {
		log.debug("attaching dirty TEventRequest instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEventRequest instance) {
		log.debug("attaching clean TEventRequest instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEventRequestDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEventRequestDAO) ctx.getBean("TEventRequestDAO");
	}
}