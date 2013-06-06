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
 * TEcEnergyitemresult entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEcEnergyitemresult
 * @author MyEclipse Persistence Tools
 */

public class TEcEnergyitemresultDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEcEnergyitemresultDAO.class);
	// property constants
	public static final String _FENERGYRESULTLEVEL = "FEnergyresultlevel";
	public static final String _FENERGYVALUE = "FEnergyvalue";
	public static final String _FENERGYEQUVALUE = "FEnergyequvalue";

	protected void initDao() {
		// do nothing
	}

	public void save(TEcEnergyitemresult transientInstance) {
		log.debug("saving TEcEnergyitemresult instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEcEnergyitemresult persistentInstance) {
		log.debug("deleting TEcEnergyitemresult instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEcEnergyitemresult findById(java.math.BigDecimal id) {
		log.debug("getting TEcEnergyitemresult instance with id: " + id);
		try {
			TEcEnergyitemresult instance = (TEcEnergyitemresult) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEcEnergyitemresult",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEcEnergyitemresult instance) {
		log.debug("finding TEcEnergyitemresult instance by example");
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
		log.debug("finding TEcEnergyitemresult instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEcEnergyitemresult as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFEnergyresultlevel(Object FEnergyresultlevel) {
		return findByProperty(_FENERGYRESULTLEVEL, FEnergyresultlevel);
	}

	public List findByFEnergyvalue(Object FEnergyvalue) {
		return findByProperty(_FENERGYVALUE, FEnergyvalue);
	}

	public List findByFEnergyequvalue(Object FEnergyequvalue) {
		return findByProperty(_FENERGYEQUVALUE, FEnergyequvalue);
	}

	public List findAll() {
		log.debug("finding all TEcEnergyitemresult instances");
		try {
			String queryString = "from TEcEnergyitemresult";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEcEnergyitemresult merge(TEcEnergyitemresult detachedInstance) {
		log.debug("merging TEcEnergyitemresult instance");
		try {
			TEcEnergyitemresult result = (TEcEnergyitemresult) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEcEnergyitemresult instance) {
		log.debug("attaching dirty TEcEnergyitemresult instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEcEnergyitemresult instance) {
		log.debug("attaching clean TEcEnergyitemresult instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEcEnergyitemresultDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEcEnergyitemresultDAO) ctx.getBean("TEcEnergyitemresultDAO");
	}
}