package com.serviceDesk.config.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.serviceDesk.config.domain.TPdDevexinfodict;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdDevexinfodict entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.config.domain.TPdDevexinfodict
 * @author MyEclipse Persistence Tools
 */

public class TPdDevexinfodictDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDevexinfodictDAO.class);
	// property constants
	public static final String _FDEVEXINFONAME = "FDevexinfoname";
	public static final String _FDEVEXINFODATATYPE = "FDevexinfodatatype";
	public static final String _FDEVEXINFODESC = "FDevexinfodesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDevexinfodict transientInstance) {
		log.debug("saving TPdDevexinfodict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDevexinfodict persistentInstance) {
		log.debug("deleting TPdDevexinfodict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDevexinfodict findById(java.math.BigDecimal id) {
		log.debug("getting TPdDevexinfodict instance with id: " + id);
		try {
			TPdDevexinfodict instance = (TPdDevexinfodict) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDevexinfodict", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdDevexinfodict instance) {
		log.debug("finding TPdDevexinfodict instance by example");
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
		log.debug("finding TPdDevexinfodict instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDevexinfodict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDevexinfoname(Object FDevexinfoname) {
		return findByProperty(_FDEVEXINFONAME, FDevexinfoname);
	}

	public List findByFDevexinfodatatype(Object FDevexinfodatatype) {
		return findByProperty(_FDEVEXINFODATATYPE, FDevexinfodatatype);
	}

	public List findByFDevexinfodesc(Object FDevexinfodesc) {
		return findByProperty(_FDEVEXINFODESC, FDevexinfodesc);
	}

	public List findAll() {
		log.debug("finding all TPdDevexinfodict instances");
		try {
			String queryString = "from TPdDevexinfodict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDevexinfodict merge(TPdDevexinfodict detachedInstance) {
		log.debug("merging TPdDevexinfodict instance");
		try {
			TPdDevexinfodict result = (TPdDevexinfodict) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDevexinfodict instance) {
		log.debug("attaching dirty TPdDevexinfodict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDevexinfodict instance) {
		log.debug("attaching clean TPdDevexinfodict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDevexinfodictDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdDevexinfodictDAO) ctx.getBean("TPdDevexinfodictDAO");
	}
}