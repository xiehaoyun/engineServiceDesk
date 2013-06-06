package com.serviceDesk.common.domain;

import java.math.BigDecimal;
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
 * TMoDistrictbaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoDistrictbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoDistrictbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoDistrictbaseinfoDAO.class);
	// property constants
	public static final String _FDISTRICTNAME = "FDistrictname";
	public static final String _FDISTRICTPOSTCODE = "FDistrictpostcode";
	public static final String _FDISTRICTAREA = "FDistrictarea";
	public static final String _FDISTRICTDESC = "FDistrictdesc";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoDistrictbaseinfo transientInstance) {
		log.debug("saving TMoDistrictbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoDistrictbaseinfo persistentInstance) {
		log.debug("deleting TMoDistrictbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoDistrictbaseinfo findById(java.lang.String id) {
		log.debug("getting TMoDistrictbaseinfo instance with id: " + id);
		try {
			TMoDistrictbaseinfo instance = (TMoDistrictbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoDistrictbaseinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoDistrictbaseinfo instance) {
		log.debug("finding TMoDistrictbaseinfo instance by example");
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
		log.debug("finding TMoDistrictbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoDistrictbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDistrictname(Object FDistrictname) {
		return findByProperty(_FDISTRICTNAME, FDistrictname);
	}

	public List findByFDistrictpostcode(Object FDistrictpostcode) {
		return findByProperty(_FDISTRICTPOSTCODE, FDistrictpostcode);
	}

	public List findByFDistrictarea(Object FDistrictarea) {
		return findByProperty(_FDISTRICTAREA, FDistrictarea);
	}

	public List findByFDistrictdesc(Object FDistrictdesc) {
		return findByProperty(_FDISTRICTDESC, FDistrictdesc);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoDistrictbaseinfo instances");
		try {
			String queryString = "from TMoDistrictbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoDistrictbaseinfo merge(TMoDistrictbaseinfo detachedInstance) {
		log.debug("merging TMoDistrictbaseinfo instance");
		try {
			TMoDistrictbaseinfo result = (TMoDistrictbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoDistrictbaseinfo instance) {
		log.debug("attaching dirty TMoDistrictbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoDistrictbaseinfo instance) {
		log.debug("attaching clean TMoDistrictbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoDistrictbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoDistrictbaseinfoDAO) ctx.getBean("TMoDistrictbaseinfoDAO");
	}
}