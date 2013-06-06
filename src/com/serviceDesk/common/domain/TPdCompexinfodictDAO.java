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
 * TPdCompexinfodict entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdCompexinfodict
 * @author MyEclipse Persistence Tools
 */

public class TPdCompexinfodictDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdCompexinfodictDAO.class);
	// property constants
	public static final String _FCOMPEXINFONAME = "FCompexinfoname";
	public static final String _FCOMPEXINFODATATYPE = "FCompexinfodatatype";
	public static final String _FCOMPEXINFODESC = "FCompexinfodesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdCompexinfodict transientInstance) {
		log.debug("saving TPdCompexinfodict instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdCompexinfodict persistentInstance) {
		log.debug("deleting TPdCompexinfodict instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdCompexinfodict findById(java.math.BigDecimal id) {
		log.debug("getting TPdCompexinfodict instance with id: " + id);
		try {
			TPdCompexinfodict instance = (TPdCompexinfodict) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdCompexinfodict", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdCompexinfodict instance) {
		log.debug("finding TPdCompexinfodict instance by example");
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
		log.debug("finding TPdCompexinfodict instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdCompexinfodict as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFCompexinfoname(Object FCompexinfoname) {
		return findByProperty(_FCOMPEXINFONAME, FCompexinfoname);
	}

	public List findByFCompexinfodatatype(Object FCompexinfodatatype) {
		return findByProperty(_FCOMPEXINFODATATYPE, FCompexinfodatatype);
	}

	public List findByFCompexinfodesc(Object FCompexinfodesc) {
		return findByProperty(_FCOMPEXINFODESC, FCompexinfodesc);
	}

	public List findAll() {
		log.debug("finding all TPdCompexinfodict instances");
		try {
			String queryString = "from TPdCompexinfodict";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdCompexinfodict merge(TPdCompexinfodict detachedInstance) {
		log.debug("merging TPdCompexinfodict instance");
		try {
			TPdCompexinfodict result = (TPdCompexinfodict) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdCompexinfodict instance) {
		log.debug("attaching dirty TPdCompexinfodict instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdCompexinfodict instance) {
		log.debug("attaching clean TPdCompexinfodict instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdCompexinfodictDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdCompexinfodictDAO) ctx.getBean("TPdCompexinfodictDAO");
	}
}