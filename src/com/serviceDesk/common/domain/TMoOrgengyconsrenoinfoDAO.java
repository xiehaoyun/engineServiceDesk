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
 * TMoOrgengyconsrenoinfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoOrgengyconsrenoinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoOrgengyconsrenoinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoOrgengyconsrenoinfoDAO.class);
	// property constants
	public static final String _FRENODEPT = "FRenodept";
	public static final String _FRENODESC = "FRenodesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoOrgengyconsrenoinfo transientInstance) {
		log.debug("saving TMoOrgengyconsrenoinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoOrgengyconsrenoinfo persistentInstance) {
		log.debug("deleting TMoOrgengyconsrenoinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoOrgengyconsrenoinfo findById(java.lang.String id) {
		log.debug("getting TMoOrgengyconsrenoinfo instance with id: " + id);
		try {
			TMoOrgengyconsrenoinfo instance = (TMoOrgengyconsrenoinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoOrgengyconsrenoinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoOrgengyconsrenoinfo instance) {
		log.debug("finding TMoOrgengyconsrenoinfo instance by example");
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
		log.debug("finding TMoOrgengyconsrenoinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoOrgengyconsrenoinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFRenodept(Object FRenodept) {
		return findByProperty(_FRENODEPT, FRenodept);
	}

	public List findByFRenodesc(Object FRenodesc) {
		return findByProperty(_FRENODESC, FRenodesc);
	}

	public List findAll() {
		log.debug("finding all TMoOrgengyconsrenoinfo instances");
		try {
			String queryString = "from TMoOrgengyconsrenoinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoOrgengyconsrenoinfo merge(TMoOrgengyconsrenoinfo detachedInstance) {
		log.debug("merging TMoOrgengyconsrenoinfo instance");
		try {
			TMoOrgengyconsrenoinfo result = (TMoOrgengyconsrenoinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoOrgengyconsrenoinfo instance) {
		log.debug("attaching dirty TMoOrgengyconsrenoinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoOrgengyconsrenoinfo instance) {
		log.debug("attaching clean TMoOrgengyconsrenoinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoOrgengyconsrenoinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoOrgengyconsrenoinfoDAO) ctx
				.getBean("TMoOrgengyconsrenoinfoDAO");
	}
}