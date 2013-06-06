package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Origvalue entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.Origvalue
 * @author MyEclipse Persistence Tools
 */

public class OrigvalueDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrigvalueDAO.class);
	// property constants
	public static final String _FMETERPARAM = "FMeterparam";
	public static final String _FMETERNAME = "FMetername";
	public static final String _FORIGVALUE = "FOrigvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(Origvalue transientInstance) {
		log.debug("saving Origvalue instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Origvalue persistentInstance) {
		log.debug("deleting Origvalue instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Origvalue findById(java.math.BigDecimal id) {
		log.debug("getting Origvalue instance with id: " + id);
		try {
			Origvalue instance = (Origvalue) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.Origvalue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Origvalue instance) {
		log.debug("finding Origvalue instance by example");
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
		log.debug("finding Origvalue instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Origvalue as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMeterparam(Object FMeterparam) {
		return findByProperty(_FMETERPARAM, FMeterparam);
	}

	public List findByFMetername(Object FMetername) {
		return findByProperty(_FMETERNAME, FMetername);
	}

	public List findByFOrigvalue(Object FOrigvalue) {
		return findByProperty(_FORIGVALUE, FOrigvalue);
	}

	public List findAll() {
		log.debug("finding all Origvalue instances");
		try {
			String queryString = "from Origvalue";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Origvalue merge(Origvalue detachedInstance) {
		log.debug("merging Origvalue instance");
		try {
			Origvalue result = (Origvalue) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Origvalue instance) {
		log.debug("attaching dirty Origvalue instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Origvalue instance) {
		log.debug("attaching clean Origvalue instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrigvalueDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrigvalueDAO) ctx.getBean("OrigvalueDAO");
	}
}