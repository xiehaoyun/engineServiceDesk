package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TStMeteruseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TStMeteruseinfo
 * @author MyEclipse Persistence Tools
 */

public class TStMeteruseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TStMeteruseinfoDAO.class);
	// property constants
	public static final String _FMETERNAME = "FMetername";
	public static final String _FMETERADDR1 = "FMeteraddr1";
	public static final String _FMETERADDR2 = "FMeteraddr2";
	public static final String _FMETERADDR3 = "FMeteraddr3";
	public static final String _FMETERBOXID = "FMeterboxid";
	public static final String _FRATE = "FRate";

	protected void initDao() {
		// do nothing
	}

	public void save(TStMeteruseinfo transientInstance) {
		log.debug("saving TStMeteruseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TStMeteruseinfo persistentInstance) {
		log.debug("deleting TStMeteruseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TStMeteruseinfo findById(java.lang.String id) {
		log.debug("getting TStMeteruseinfo instance with id: " + id);
		try {
			TStMeteruseinfo instance = (TStMeteruseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TStMeteruseinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TStMeteruseinfo instance) {
		log.debug("finding TStMeteruseinfo instance by example");
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
		log.debug("finding TStMeteruseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TStMeteruseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMetername(Object FMetername) {
		return findByProperty(_FMETERNAME, FMetername);
	}

	public List findByFMeteraddr1(Object FMeteraddr1) {
		return findByProperty(_FMETERADDR1, FMeteraddr1);
	}

	public List findByFMeteraddr2(Object FMeteraddr2) {
		return findByProperty(_FMETERADDR2, FMeteraddr2);
	}

	public List findByFMeteraddr3(Object FMeteraddr3) {
		return findByProperty(_FMETERADDR3, FMeteraddr3);
	}

	public List findByFMeterboxid(Object FMeterboxid) {
		return findByProperty(_FMETERBOXID, FMeterboxid);
	}

	public List findByFRate(Object FRate) {
		return findByProperty(_FRATE, FRate);
	}

	public List findAll() {
		log.debug("finding all TStMeteruseinfo instances");
		try {
			String queryString = "from TStMeteruseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TStMeteruseinfo merge(TStMeteruseinfo detachedInstance) {
		log.debug("merging TStMeteruseinfo instance");
		try {
			TStMeteruseinfo result = (TStMeteruseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TStMeteruseinfo instance) {
		log.debug("attaching dirty TStMeteruseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TStMeteruseinfo instance) {
		log.debug("attaching clean TStMeteruseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TStMeteruseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TStMeteruseinfoDAO) ctx.getBean("TStMeteruseinfoDAO");
	}
}