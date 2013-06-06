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
 * TBdBuildengyconsrenoinfo entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildengyconsrenoinfo
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildengyconsrenoinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildengyconsrenoinfoDAO.class);
	// property constants
	public static final String _FRENODEPT = "FRenodept";
	public static final String _FRENODESC = "FRenodesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildengyconsrenoinfo transientInstance) {
		log.debug("saving TBdBuildengyconsrenoinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildengyconsrenoinfo persistentInstance) {
		log.debug("deleting TBdBuildengyconsrenoinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildengyconsrenoinfo findById(java.lang.String id) {
		log.debug("getting TBdBuildengyconsrenoinfo instance with id: " + id);
		try {
			TBdBuildengyconsrenoinfo instance = (TBdBuildengyconsrenoinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildengyconsrenoinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBdBuildengyconsrenoinfo instance) {
		log.debug("finding TBdBuildengyconsrenoinfo instance by example");
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
		log.debug("finding TBdBuildengyconsrenoinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildengyconsrenoinfo as model where model."
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
		log.debug("finding all TBdBuildengyconsrenoinfo instances");
		try {
			String queryString = "from TBdBuildengyconsrenoinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildengyconsrenoinfo merge(
			TBdBuildengyconsrenoinfo detachedInstance) {
		log.debug("merging TBdBuildengyconsrenoinfo instance");
		try {
			TBdBuildengyconsrenoinfo result = (TBdBuildengyconsrenoinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildengyconsrenoinfo instance) {
		log.debug("attaching dirty TBdBuildengyconsrenoinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildengyconsrenoinfo instance) {
		log.debug("attaching clean TBdBuildengyconsrenoinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildengyconsrenoinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildengyconsrenoinfoDAO) ctx
				.getBean("TBdBuildengyconsrenoinfoDAO");
	}
}