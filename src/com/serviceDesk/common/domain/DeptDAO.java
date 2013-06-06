package com.serviceDesk.common.domain;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Dept
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.serviceDesk.common.domain.Dept
 * @author MyEclipse Persistence Tools
 */

public class DeptDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DeptDAO.class);
	// property constants
	public static final String DNAME = "dname";
	public static final String LOC = "loc";

	protected void initDao() {
		// do nothing
	}

	public void save(Dept transientInstance) {
		log.debug("saving Dept instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dept persistentInstance) {
		log.debug("deleting Dept instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dept findById(java.lang.Byte id) {
		log.debug("getting Dept instance with id: " + id);
		try {
			Dept instance = (Dept) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.Dept", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dept instance) {
		log.debug("finding Dept instance by example");
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
		log.debug("finding Dept instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dept as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDname(Object dname) {
		return findByProperty(DNAME, dname);
	}

	public List findByLoc(Object loc) {
		return findByProperty(LOC, loc);
	}

	public List findAll() {
		log.debug("finding all Dept instances");
		try {
			String queryString = "from Dept";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dept merge(Dept detachedInstance) {
		log.debug("merging Dept instance");
		try {
			Dept result = (Dept) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dept instance) {
		log.debug("attaching dirty Dept instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dept instance) {
		log.debug("attaching clean Dept instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DeptDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DeptDAO) ctx.getBean("DeptDAO");
	}
}