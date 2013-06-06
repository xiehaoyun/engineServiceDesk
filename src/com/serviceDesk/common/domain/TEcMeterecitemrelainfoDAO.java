package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TEcMeterecitemrelainfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEcMeterecitemrelainfo
 * @author MyEclipse Persistence Tools
 */

public class TEcMeterecitemrelainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEcMeterecitemrelainfoDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(TEcMeterecitemrelainfo transientInstance) {
		log.debug("saving TEcMeterecitemrelainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEcMeterecitemrelainfo persistentInstance) {
		log.debug("deleting TEcMeterecitemrelainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEcMeterecitemrelainfo findById(
			com.serviceDesk.common.domain.TEcMeterecitemrelainfoId id) {
		log.debug("getting TEcMeterecitemrelainfo instance with id: " + id);
		try {
			TEcMeterecitemrelainfo instance = (TEcMeterecitemrelainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEcMeterecitemrelainfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEcMeterecitemrelainfo instance) {
		log.debug("finding TEcMeterecitemrelainfo instance by example");
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
		log.debug("finding TEcMeterecitemrelainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEcMeterecitemrelainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TEcMeterecitemrelainfo instances");
		try {
			String queryString = "from TEcMeterecitemrelainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEcMeterecitemrelainfo merge(TEcMeterecitemrelainfo detachedInstance) {
		log.debug("merging TEcMeterecitemrelainfo instance");
		try {
			TEcMeterecitemrelainfo result = (TEcMeterecitemrelainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEcMeterecitemrelainfo instance) {
		log.debug("attaching dirty TEcMeterecitemrelainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEcMeterecitemrelainfo instance) {
		log.debug("attaching clean TEcMeterecitemrelainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEcMeterecitemrelainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEcMeterecitemrelainfoDAO) ctx
				.getBean("TEcMeterecitemrelainfoDAO");
	}
}