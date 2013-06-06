package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Myuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.Myuser
 * @author MyEclipse Persistence Tools
 */

public class MyuserDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(MyuserDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";

	protected void initDao() {
		// do nothing
	}

	public void save(Myuser transientInstance) {
		log.debug("saving Myuser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Myuser persistentInstance) {
		log.debug("deleting Myuser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Myuser findById(java.lang.String id) {
		log.debug("getting Myuser instance with id: " + id);
		try {
			Myuser instance = (Myuser) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.Myuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Myuser instance) {
		log.debug("finding Myuser instance by example");
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
		log.debug("finding Myuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Myuser as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findAll() {
		log.debug("finding all Myuser instances");
		try {
			String queryString = "from Myuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Myuser merge(Myuser detachedInstance) {
		log.debug("merging Myuser instance");
		try {
			Myuser result = (Myuser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Myuser instance) {
		log.debug("attaching dirty Myuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Myuser instance) {
		log.debug("attaching clean Myuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MyuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MyuserDAO) ctx.getBean("MyuserDAO");
	}
}