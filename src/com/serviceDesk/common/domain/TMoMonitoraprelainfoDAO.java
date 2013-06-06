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
 * TMoMonitoraprelainfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoMonitoraprelainfo
 * @author MyEclipse Persistence Tools
 */

public class TMoMonitoraprelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoMonitoraprelainfoDAO.class);
	// property constants
	public static final String _FMAPRATE = "FMaprate";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoMonitoraprelainfo transientInstance) {
		log.debug("saving TMoMonitoraprelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoMonitoraprelainfo persistentInstance) {
		log.debug("deleting TMoMonitoraprelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoMonitoraprelainfo findById(
			com.serviceDesk.common.domain.TMoMonitoraprelainfoId id) {
		log.debug("getting TMoMonitoraprelainfo instance with id: " + id);
		try {
			TMoMonitoraprelainfo instance = (TMoMonitoraprelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoMonitoraprelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoMonitoraprelainfo instance) {
		log.debug("finding TMoMonitoraprelainfo instance by example");
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
		log.debug("finding TMoMonitoraprelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoMonitoraprelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMaprate(Object FMaprate) {
		return findByProperty(_FMAPRATE, FMaprate);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoMonitoraprelainfo instances");
		try {
			String queryString = "from TMoMonitoraprelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoMonitoraprelainfo merge(TMoMonitoraprelainfo detachedInstance) {
		log.debug("merging TMoMonitoraprelainfo instance");
		try {
			TMoMonitoraprelainfo result = (TMoMonitoraprelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoMonitoraprelainfo instance) {
		log.debug("attaching dirty TMoMonitoraprelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoMonitoraprelainfo instance) {
		log.debug("attaching clean TMoMonitoraprelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoMonitoraprelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoMonitoraprelainfoDAO) ctx.getBean("TMoMonitoraprelainfoDAO");
	}
}