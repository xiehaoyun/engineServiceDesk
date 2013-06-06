package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TBdBuildaddfile entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildaddfile
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildaddfileDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildaddfileDAO.class);
	// property constants
	public static final String _FFILEFUNCTYPE = "FFilefunctype";
	public static final String _FFILEFORMATTYPE = "FFileformattype";
	public static final String _FFILEDESC = "FFiledesc";
	public static final String _FFILEPATH = "FFilepath";

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildaddfile transientInstance) {
		log.debug("saving TBdBuildaddfile instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildaddfile persistentInstance) {
		log.debug("deleting TBdBuildaddfile instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildaddfile findById(java.lang.String id) {
		log.debug("getting TBdBuildaddfile instance with id: " + id);
		try {
			TBdBuildaddfile instance = (TBdBuildaddfile) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildaddfile", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBdBuildaddfile instance) {
		log.debug("finding TBdBuildaddfile instance by example");
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
		log.debug("finding TBdBuildaddfile instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildaddfile as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFFilefunctype(Object FFilefunctype) {
		return findByProperty(_FFILEFUNCTYPE, FFilefunctype);
	}

	public List findByFFileformattype(Object FFileformattype) {
		return findByProperty(_FFILEFORMATTYPE, FFileformattype);
	}

	public List findByFFiledesc(Object FFiledesc) {
		return findByProperty(_FFILEDESC, FFiledesc);
	}

	public List findByFFilepath(Object FFilepath) {
		return findByProperty(_FFILEPATH, FFilepath);
	}

	public List findAll() {
		log.debug("finding all TBdBuildaddfile instances");
		try {
			String queryString = "from TBdBuildaddfile";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildaddfile merge(TBdBuildaddfile detachedInstance) {
		log.debug("merging TBdBuildaddfile instance");
		try {
			TBdBuildaddfile result = (TBdBuildaddfile) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildaddfile instance) {
		log.debug("attaching dirty TBdBuildaddfile instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildaddfile instance) {
		log.debug("attaching clean TBdBuildaddfile instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildaddfileDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildaddfileDAO) ctx.getBean("TBdBuildaddfileDAO");
	}
}