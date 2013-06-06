package com.serviceDesk.common.domain;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Bonus
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.serviceDesk.common.domain.Bonus
 * @author MyEclipse Persistence Tools
 */

public class BonusDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(BonusDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Bonus transientInstance) {
		log.debug("saving Bonus instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bonus persistentInstance) {
		log.debug("deleting Bonus instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bonus findById(com.serviceDesk.common.domain.BonusId id) {
		log.debug("getting Bonus instance with id: " + id);
		try {
			Bonus instance = (Bonus) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.Bonus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bonus instance) {
		log.debug("finding Bonus instance by example");
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
		log.debug("finding Bonus instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bonus as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Bonus instances");
		try {
			String queryString = "from Bonus";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bonus merge(Bonus detachedInstance) {
		log.debug("merging Bonus instance");
		try {
			Bonus result = (Bonus) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bonus instance) {
		log.debug("attaching dirty Bonus instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bonus instance) {
		log.debug("attaching clean Bonus instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BonusDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BonusDAO) ctx.getBean("BonusDAO");
	}
}