package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdPowergridinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdPowergridinfo
 * @author MyEclipse Persistence Tools
 */

public class TPdPowergridinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdPowergridinfoDAO.class);
	// property constants
	public static final String _FGRIDDIAGRAMPATH = "FGriddiagrampath";
	public static final String _FMAXLOADPOWER = "FMaxloadpower";
	public static final String _FMAXLOADVOLTAGE = "FMaxloadvoltage";
	public static final String _FMAXLOADEC = "FMaxloadec";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdPowergridinfo transientInstance) {
		log.debug("saving TPdPowergridinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdPowergridinfo persistentInstance) {
		log.debug("deleting TPdPowergridinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdPowergridinfo findById(java.lang.String id) {
		log.debug("getting TPdPowergridinfo instance with id: " + id);
		try {
			TPdPowergridinfo instance = (TPdPowergridinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdPowergridinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdPowergridinfo instance) {
		log.debug("finding TPdPowergridinfo instance by example");
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
		log.debug("finding TPdPowergridinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdPowergridinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFGriddiagrampath(Object FGriddiagrampath) {
		return findByProperty(_FGRIDDIAGRAMPATH, FGriddiagrampath);
	}

	public List findByFMaxloadpower(Object FMaxloadpower) {
		return findByProperty(_FMAXLOADPOWER, FMaxloadpower);
	}

	public List findByFMaxloadvoltage(Object FMaxloadvoltage) {
		return findByProperty(_FMAXLOADVOLTAGE, FMaxloadvoltage);
	}

	public List findByFMaxloadec(Object FMaxloadec) {
		return findByProperty(_FMAXLOADEC, FMaxloadec);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TPdPowergridinfo instances");
		try {
			String queryString = "from TPdPowergridinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdPowergridinfo merge(TPdPowergridinfo detachedInstance) {
		log.debug("merging TPdPowergridinfo instance");
		try {
			TPdPowergridinfo result = (TPdPowergridinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdPowergridinfo instance) {
		log.debug("attaching dirty TPdPowergridinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdPowergridinfo instance) {
		log.debug("attaching clean TPdPowergridinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdPowergridinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdPowergridinfoDAO) ctx.getBean("TPdPowergridinfoDAO");
	}
}