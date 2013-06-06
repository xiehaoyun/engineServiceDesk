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
 * TPdComponentinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdComponentinfo
 * @author MyEclipse Persistence Tools
 */

public class TPdComponentinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdComponentinfoDAO.class);
	// property constants
	public static final String _FCOMPNAME = "FCompname";
	public static final String _FCOMPBRAND = "FCompbrand";
	public static final String _FCOMPMODEL = "FCompmodel";
	public static final String _FCOMPPRODUCER = "FCompproducer";
	public static final String _FCOMPDESC = "FCompdesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdComponentinfo transientInstance) {
		log.debug("saving TPdComponentinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdComponentinfo persistentInstance) {
		log.debug("deleting TPdComponentinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdComponentinfo findById(java.math.BigDecimal id) {
		log.debug("getting TPdComponentinfo instance with id: " + id);
		try {
			TPdComponentinfo instance = (TPdComponentinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdComponentinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdComponentinfo instance) {
		log.debug("finding TPdComponentinfo instance by example");
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
		log.debug("finding TPdComponentinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdComponentinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFCompname(Object FCompname) {
		return findByProperty(_FCOMPNAME, FCompname);
	}

	public List findByFCompbrand(Object FCompbrand) {
		return findByProperty(_FCOMPBRAND, FCompbrand);
	}

	public List findByFCompmodel(Object FCompmodel) {
		return findByProperty(_FCOMPMODEL, FCompmodel);
	}

	public List findByFCompproducer(Object FCompproducer) {
		return findByProperty(_FCOMPPRODUCER, FCompproducer);
	}

	public List findByFCompdesc(Object FCompdesc) {
		return findByProperty(_FCOMPDESC, FCompdesc);
	}

	public List findAll() {
		log.debug("finding all TPdComponentinfo instances");
		try {
			String queryString = "from TPdComponentinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdComponentinfo merge(TPdComponentinfo detachedInstance) {
		log.debug("merging TPdComponentinfo instance");
		try {
			TPdComponentinfo result = (TPdComponentinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdComponentinfo instance) {
		log.debug("attaching dirty TPdComponentinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdComponentinfo instance) {
		log.debug("attaching clean TPdComponentinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdComponentinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdComponentinfoDAO) ctx.getBean("TPdComponentinfoDAO");
	}
}