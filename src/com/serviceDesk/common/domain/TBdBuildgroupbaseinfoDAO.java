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
 * TBdBuildgroupbaseinfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildgroupbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildgroupbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildgroupbaseinfoDAO.class);
	// property constants
	public static final String _FBUILDGROUPNAME = "FBuildgroupname";
	public static final String _FGROUPALIASNAME = "FGroupaliasname";
	public static final String _FGROUPDESC = "FGroupdesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildgroupbaseinfo transientInstance) {
		log.debug("saving TBdBuildgroupbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildgroupbaseinfo persistentInstance) {
		log.debug("deleting TBdBuildgroupbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildgroupbaseinfo findById(java.lang.String id) {
		log.debug("getting TBdBuildgroupbaseinfo instance with id: " + id);
		try {
			TBdBuildgroupbaseinfo instance = (TBdBuildgroupbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildgroupbaseinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBdBuildgroupbaseinfo instance) {
		log.debug("finding TBdBuildgroupbaseinfo instance by example");
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
		log.debug("finding TBdBuildgroupbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildgroupbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFBuildgroupname(Object FBuildgroupname) {
		return findByProperty(_FBUILDGROUPNAME, FBuildgroupname);
	}

	public List findByFGroupaliasname(Object FGroupaliasname) {
		return findByProperty(_FGROUPALIASNAME, FGroupaliasname);
	}

	public List findByFGroupdesc(Object FGroupdesc) {
		return findByProperty(_FGROUPDESC, FGroupdesc);
	}

	public List findAll() {
		log.debug("finding all TBdBuildgroupbaseinfo instances");
		try {
			String queryString = "from TBdBuildgroupbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildgroupbaseinfo merge(TBdBuildgroupbaseinfo detachedInstance) {
		log.debug("merging TBdBuildgroupbaseinfo instance");
		try {
			TBdBuildgroupbaseinfo result = (TBdBuildgroupbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildgroupbaseinfo instance) {
		log.debug("attaching dirty TBdBuildgroupbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildgroupbaseinfo instance) {
		log.debug("attaching clean TBdBuildgroupbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildgroupbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildgroupbaseinfoDAO) ctx
				.getBean("TBdBuildgroupbaseinfoDAO");
	}
}