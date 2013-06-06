package com.serviceDesk.event.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.serviceDesk.event.domain.TEventSolution;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEventSolution entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.event.domain.TEventSolution
 * @author MyEclipse Persistence Tools
 */

public class TEventSolutionDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEventSolutionDAO.class);
	// property constants
	public static final String DESCRIPTION = "description";
	public static final String SOLUTION = "solution";
	public static final String CREATOR_NAME = "creatorName";

	protected void initDao() {
		// do nothing
	}

	public void save(TEventSolution transientInstance) {
		log.debug("saving TEventSolution instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEventSolution persistentInstance) {
		log.debug("deleting TEventSolution instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEventSolution findById(java.lang.Integer id) {
		log.debug("getting TEventSolution instance with id: " + id);
		try {
			TEventSolution instance = (TEventSolution) getHibernateTemplate()
					.get("com.serviceDesk.event.domain.TEventSolution", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEventSolution instance) {
		log.debug("finding TEventSolution instance by example");
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
		log.debug("finding TEventSolution instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEventSolution as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findBySolution(Object solution) {
		return findByProperty(SOLUTION, solution);
	}

	public List findByCreatorName(Object creatorName) {
		return findByProperty(CREATOR_NAME, creatorName);
	}

	public List findAll() {
		log.debug("finding all TEventSolution instances");
		try {
			String queryString = "from TEventSolution";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEventSolution merge(TEventSolution detachedInstance) {
		log.debug("merging TEventSolution instance");
		try {
			TEventSolution result = (TEventSolution) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEventSolution instance) {
		log.debug("attaching dirty TEventSolution instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEventSolution instance) {
		log.debug("attaching clean TEventSolution instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEventSolutionDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEventSolutionDAO) ctx.getBean("TEventSolutionDAO");
	}
}