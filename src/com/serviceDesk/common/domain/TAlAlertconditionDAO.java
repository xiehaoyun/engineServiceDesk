package com.serviceDesk.common.domain;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TAlAlertcondition entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TAlAlertcondition
 * @author MyEclipse Persistence Tools
 */

public class TAlAlertconditionDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TAlAlertconditionDAO.class);
	// property constants
	public static final String _FALERTTHRESHOLD = "FAlertthreshold";
	public static final String _FALERTRULE = "FAlertrule";
	public static final String _FALERTTHRESHOLDINTERVAL = "FAlertthresholdinterval";
	public static final String _FALERTTHRESHOLDINTEVALUNIT = "FAlertthresholdintevalunit";

	protected void initDao() {
		// do nothing
	}

	public void save(TAlAlertcondition transientInstance) {
		log.debug("saving TAlAlertcondition instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TAlAlertcondition persistentInstance) {
		log.debug("deleting TAlAlertcondition instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TAlAlertcondition findById(java.math.BigDecimal id) {
		log.debug("getting TAlAlertcondition instance with id: " + id);
		try {
			TAlAlertcondition instance = (TAlAlertcondition) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TAlAlertcondition", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TAlAlertcondition instance) {
		log.debug("finding TAlAlertcondition instance by example");
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
		log.debug("finding TAlAlertcondition instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TAlAlertcondition as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFAlertthreshold(Object FAlertthreshold) {
		return findByProperty(_FALERTTHRESHOLD, FAlertthreshold);
	}

	public List findByFAlertrule(Object FAlertrule) {
		return findByProperty(_FALERTRULE, FAlertrule);
	}

	public List findByFAlertthresholdinterval(Object FAlertthresholdinterval) {
		return findByProperty(_FALERTTHRESHOLDINTERVAL, FAlertthresholdinterval);
	}

	public List findByFAlertthresholdintevalunit(
			Object FAlertthresholdintevalunit) {
		return findByProperty(_FALERTTHRESHOLDINTEVALUNIT,
				FAlertthresholdintevalunit);
	}

	public List findAll() {
		log.debug("finding all TAlAlertcondition instances");
		try {
			String queryString = "from TAlAlertcondition";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TAlAlertcondition merge(TAlAlertcondition detachedInstance) {
		log.debug("merging TAlAlertcondition instance");
		try {
			TAlAlertcondition result = (TAlAlertcondition) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TAlAlertcondition instance) {
		log.debug("attaching dirty TAlAlertcondition instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TAlAlertcondition instance) {
		log.debug("attaching clean TAlAlertcondition instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TAlAlertconditionDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TAlAlertconditionDAO) ctx.getBean("TAlAlertconditionDAO");
	}
}