package com.serviceDesk.config.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.serviceDesk.config.domain.TPdDeviceinfo;
import com.serviceDesk.config.form.TPdDeviceinfoForm;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdDeviceinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.config.domain.TPdDeviceinfo
 * @author MyEclipse Persistence Tools
 */

public class TPdDeviceinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDeviceinfoDAO.class);
	// property constants
	public static final String _FDEVNAME = "FDevname";
	public static final String _FDEVBRAND = "FDevbrand";
	public static final String _FDEVMODEL = "FDevmodel";
	public static final String _FDEVPRODUCER = "FDevproducer";
	public static final String _FDEVDESC = "FDevdesc";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDeviceinfo transientInstance) {
		log.debug("saving TPdDeviceinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDeviceinfo persistentInstance) {
		log.debug("deleting TPdDeviceinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDeviceinfo findById(java.math.BigDecimal id) {
		log.debug("getting TPdDeviceinfo instance with id: " + id);
		try {
			TPdDeviceinfo instance = (TPdDeviceinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDeviceinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TPdDeviceinfo instance) {
		log.debug("finding TPdDeviceinfo instance by example");
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
		log.debug("finding TPdDeviceinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDeviceinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDevname(Object FDevname) {
		return findByProperty(_FDEVNAME, FDevname);
	}

	public List findByFDevbrand(Object FDevbrand) {
		return findByProperty(_FDEVBRAND, FDevbrand);
	}

	public List findByFDevmodel(Object FDevmodel) {
		return findByProperty(_FDEVMODEL, FDevmodel);
	}

	public List findByFDevproducer(Object FDevproducer) {
		return findByProperty(_FDEVPRODUCER, FDevproducer);
	}

	public List findByFDevdesc(Object FDevdesc) {
		return findByProperty(_FDEVDESC, FDevdesc);
	}

	public List findAll() {
		log.debug("finding all TPdDeviceinfo instances");
		try {
			String queryString = "from TPdDeviceinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDeviceinfo merge(TPdDeviceinfo detachedInstance) {
		log.debug("merging TPdDeviceinfo instance");
		try {
			TPdDeviceinfo result = (TPdDeviceinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDeviceinfo instance) {
		log.debug("attaching dirty TPdDeviceinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDeviceinfo instance) {
		log.debug("attaching clean TPdDeviceinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDeviceinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TPdDeviceinfoDAO) ctx.getBean("TPdDeviceinfoDAO");
	}
	
	public List<Object[]> findByCompanyAreaFDevname(String sql, List<Object> args){
		SQLQuery query = this.getSession().createSQLQuery(sql);
		if ((args != null) && (args.size() > 0)) {
			Object[] values = args.toArray();
			for (int i = 0; i < values.length; ++i) {
				query.setParameter(i, values[i]);
			}
		}
		List list = query.list();
		return list;
	}
}