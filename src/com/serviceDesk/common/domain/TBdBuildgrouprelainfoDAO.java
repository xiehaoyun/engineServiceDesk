package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TBdBuildgrouprelainfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildgrouprelainfo
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildgrouprelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildgrouprelainfoDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildgrouprelainfo transientInstance) {
		log.debug("saving TBdBuildgrouprelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildgrouprelainfo persistentInstance) {
		log.debug("deleting TBdBuildgrouprelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildgrouprelainfo findById(
			com.serviceDesk.common.domain.TBdBuildgrouprelainfoId id) {
		log.debug("getting TBdBuildgrouprelainfo instance with id: " + id);
		try {
			TBdBuildgrouprelainfo instance = (TBdBuildgrouprelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildgrouprelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBdBuildgrouprelainfo instance) {
		log.debug("finding TBdBuildgrouprelainfo instance by example");
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
		log.debug("finding TBdBuildgrouprelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildgrouprelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TBdBuildgrouprelainfo instances");
		try {
			String queryString = "from TBdBuildgrouprelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildgrouprelainfo merge(TBdBuildgrouprelainfo detachedInstance) {
		log.debug("merging TBdBuildgrouprelainfo instance");
		try {
			TBdBuildgrouprelainfo result = (TBdBuildgrouprelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildgrouprelainfo instance) {
		log.debug("attaching dirty TBdBuildgrouprelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildgrouprelainfo instance) {
		log.debug("attaching clean TBdBuildgrouprelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildgrouprelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildgrouprelainfoDAO) ctx
				.getBean("TBdBuildgrouprelainfoDAO");
	}
}