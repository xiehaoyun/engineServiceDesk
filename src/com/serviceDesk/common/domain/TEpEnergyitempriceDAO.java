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
 * TEpEnergyitemprice entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEpEnergyitemprice
 * @author MyEclipse Persistence Tools
 */

public class TEpEnergyitempriceDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEpEnergyitempriceDAO.class);
	// property constants
	public static final String _FPRICEVALUE = "FPricevalue";
	public static final String _FPRICENOTE = "FPricenote";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TEpEnergyitemprice transientInstance) {
		log.debug("saving TEpEnergyitemprice instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEpEnergyitemprice persistentInstance) {
		log.debug("deleting TEpEnergyitemprice instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEpEnergyitemprice findById(java.lang.String id) {
		log.debug("getting TEpEnergyitemprice instance with id: " + id);
		try {
			TEpEnergyitemprice instance = (TEpEnergyitemprice) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEpEnergyitemprice", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEpEnergyitemprice instance) {
		log.debug("finding TEpEnergyitemprice instance by example");
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
		log.debug("finding TEpEnergyitemprice instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEpEnergyitemprice as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFPricevalue(Object FPricevalue) {
		return findByProperty(_FPRICEVALUE, FPricevalue);
	}

	public List findByFPricenote(Object FPricenote) {
		return findByProperty(_FPRICENOTE, FPricenote);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TEpEnergyitemprice instances");
		try {
			String queryString = "from TEpEnergyitemprice";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEpEnergyitemprice merge(TEpEnergyitemprice detachedInstance) {
		log.debug("merging TEpEnergyitemprice instance");
		try {
			TEpEnergyitemprice result = (TEpEnergyitemprice) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEpEnergyitemprice instance) {
		log.debug("attaching dirty TEpEnergyitemprice instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEpEnergyitemprice instance) {
		log.debug("attaching clean TEpEnergyitemprice instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEpEnergyitempriceDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEpEnergyitempriceDAO) ctx.getBean("TEpEnergyitempriceDAO");
	}
}