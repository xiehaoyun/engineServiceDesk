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
 * TMoIndustrybaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoIndustrybaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoIndustrybaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoIndustrybaseinfoDAO.class);
	// property constants
	public static final String _FINDUSTRYNAME = "FIndustryname";
	public static final String _FINDUSTRYDESC = "FIndustrydesc";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoIndustrybaseinfo transientInstance) {
		log.debug("saving TMoIndustrybaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoIndustrybaseinfo persistentInstance) {
		log.debug("deleting TMoIndustrybaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoIndustrybaseinfo findById(java.lang.String id) {
		log.debug("getting TMoIndustrybaseinfo instance with id: " + id);
		try {
			TMoIndustrybaseinfo instance = (TMoIndustrybaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoIndustrybaseinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoIndustrybaseinfo instance) {
		log.debug("finding TMoIndustrybaseinfo instance by example");
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
		log.debug("finding TMoIndustrybaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoIndustrybaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFIndustryname(Object FIndustryname) {
		return findByProperty(_FINDUSTRYNAME, FIndustryname);
	}

	public List findByFIndustrydesc(Object FIndustrydesc) {
		return findByProperty(_FINDUSTRYDESC, FIndustrydesc);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoIndustrybaseinfo instances");
		try {
			String queryString = "from TMoIndustrybaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoIndustrybaseinfo merge(TMoIndustrybaseinfo detachedInstance) {
		log.debug("merging TMoIndustrybaseinfo instance");
		try {
			TMoIndustrybaseinfo result = (TMoIndustrybaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoIndustrybaseinfo instance) {
		log.debug("attaching dirty TMoIndustrybaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoIndustrybaseinfo instance) {
		log.debug("attaching clean TMoIndustrybaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoIndustrybaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoIndustrybaseinfoDAO) ctx.getBean("TMoIndustrybaseinfoDAO");
	}
}