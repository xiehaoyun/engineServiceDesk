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
 * TEvStaffinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEvStaffinfo
 * @author MyEclipse Persistence Tools
 */

public class TEvStaffinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEvStaffinfoDAO.class);
	// property constants
	public static final String _FSTAFFNAME = "FStaffname";
	public static final String _FSTAFFSEX = "FStaffsex";
	public static final String _FSTAFFTEL = "FStafftel";
	public static final String _FSTAFFEMAIL = "FStaffemail";
	public static final String _FSTAFFPOST = "FStaffpost";
	public static final String _FSTAFFLEVEL = "FStafflevel";

	protected void initDao() {
		// do nothing
	}

	public void save(TEvStaffinfo transientInstance) {
		log.debug("saving TEvStaffinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEvStaffinfo persistentInstance) {
		log.debug("deleting TEvStaffinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEvStaffinfo findById(java.math.BigDecimal id) {
		log.debug("getting TEvStaffinfo instance with id: " + id);
		try {
			TEvStaffinfo instance = (TEvStaffinfo) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.TEvStaffinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEvStaffinfo instance) {
		log.debug("finding TEvStaffinfo instance by example");
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
		log.debug("finding TEvStaffinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEvStaffinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFStaffname(Object FStaffname) {
		return findByProperty(_FSTAFFNAME, FStaffname);
	}

	public List findByFStaffsex(Object FStaffsex) {
		return findByProperty(_FSTAFFSEX, FStaffsex);
	}

	public List findByFStafftel(Object FStafftel) {
		return findByProperty(_FSTAFFTEL, FStafftel);
	}

	public List findByFStaffemail(Object FStaffemail) {
		return findByProperty(_FSTAFFEMAIL, FStaffemail);
	}

	public List findByFStaffpost(Object FStaffpost) {
		return findByProperty(_FSTAFFPOST, FStaffpost);
	}

	public List findByFStafflevel(Object FStafflevel) {
		return findByProperty(_FSTAFFLEVEL, FStafflevel);
	}

	public List findAll() {
		log.debug("finding all TEvStaffinfo instances");
		try {
			String queryString = "from TEvStaffinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEvStaffinfo merge(TEvStaffinfo detachedInstance) {
		log.debug("merging TEvStaffinfo instance");
		try {
			TEvStaffinfo result = (TEvStaffinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEvStaffinfo instance) {
		log.debug("attaching dirty TEvStaffinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEvStaffinfo instance) {
		log.debug("attaching clean TEvStaffinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEvStaffinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEvStaffinfoDAO) ctx.getBean("TEvStaffinfoDAO");
	}
}