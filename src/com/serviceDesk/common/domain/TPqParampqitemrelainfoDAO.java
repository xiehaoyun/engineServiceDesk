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
 * TPqParampqitemrelainfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPqParampqitemrelainfo
 * @author MyEclipse Persistence Tools
 */

public class TPqParampqitemrelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPqParampqitemrelainfoDAO.class);
	// property constants
	public static final String _FUNITRATE = "FUnitrate";

	protected void initDao() {
		// do nothing
	}

	public void save(TPqParampqitemrelainfo transientInstance) {
		log.debug("saving TPqParampqitemrelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPqParampqitemrelainfo persistentInstance) {
		log.debug("deleting TPqParampqitemrelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPqParampqitemrelainfo findById(
			com.serviceDesk.common.domain.TPqParampqitemrelainfoId id) {
		log.debug("getting TPqParampqitemrelainfo instance with id: " + id);
		try {
			TPqParampqitemrelainfo instance = (TPqParampqitemrelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPqParampqitemrelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPqParampqitemrelainfo instance) {
		log.debug("finding TPqParampqitemrelainfo instance by example");
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
		log.debug("finding TPqParampqitemrelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPqParampqitemrelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFUnitrate(Object FUnitrate) {
		return findByProperty(_FUNITRATE, FUnitrate);
	}

	public List findAll() {
		log.debug("finding all TPqParampqitemrelainfo instances");
		try {
			String queryString = "from TPqParampqitemrelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPqParampqitemrelainfo merge(TPqParampqitemrelainfo detachedInstance) {
		log.debug("merging TPqParampqitemrelainfo instance");
		try {
			TPqParampqitemrelainfo result = (TPqParampqitemrelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPqParampqitemrelainfo instance) {
		log.debug("attaching dirty TPqParampqitemrelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPqParampqitemrelainfo instance) {
		log.debug("attaching clean TPqParampqitemrelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPqParampqitemrelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPqParampqitemrelainfoDAO) ctx
				.getBean("TPqParampqitemrelainfoDAO");
	}
}