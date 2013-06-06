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
 * TEnEnvironitemresult entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEnEnvironitemresult
 * @author MyEclipse Persistence Tools
 */

public class TEnEnvironitemresultDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEnEnvironitemresultDAO.class);
	// property constants
	public static final String _FENVIRONVALUE = "FEnvironvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(TEnEnvironitemresult transientInstance) {
		log.debug("saving TEnEnvironitemresult instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEnEnvironitemresult persistentInstance) {
		log.debug("deleting TEnEnvironitemresult instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEnEnvironitemresult findById(java.lang.String id) {
		log.debug("getting TEnEnvironitemresult instance with id: " + id);
		try {
			TEnEnvironitemresult instance = (TEnEnvironitemresult) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEnEnvironitemresult",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEnEnvironitemresult instance) {
		log.debug("finding TEnEnvironitemresult instance by example");
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
		log.debug("finding TEnEnvironitemresult instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEnEnvironitemresult as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFEnvironvalue(Object FEnvironvalue) {
		return findByProperty(_FENVIRONVALUE, FEnvironvalue);
	}

	public List findAll() {
		log.debug("finding all TEnEnvironitemresult instances");
		try {
			String queryString = "from TEnEnvironitemresult";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEnEnvironitemresult merge(TEnEnvironitemresult detachedInstance) {
		log.debug("merging TEnEnvironitemresult instance");
		try {
			TEnEnvironitemresult result = (TEnEnvironitemresult) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEnEnvironitemresult instance) {
		log.debug("attaching dirty TEnEnvironitemresult instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEnEnvironitemresult instance) {
		log.debug("attaching clean TEnEnvironitemresult instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEnEnvironitemresultDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEnEnvironitemresultDAO) ctx.getBean("TEnEnvironitemresultDAO");
	}
}