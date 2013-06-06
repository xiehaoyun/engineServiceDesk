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
 * TDcDatacenterbaseinfo entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TDcDatacenterbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TDcDatacenterbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TDcDatacenterbaseinfoDAO.class);
	// property constants
	public static final String _FDATACENTERNAME = "FDatacentername";
	public static final String _FDATACENTERDESC = "FDatacenterdesc";
	public static final String _FDATACENTERCONTACT = "FDatacentercontact";
	public static final String _FDATACENTERTEL = "FDatacentertel";

	protected void initDao() {
		// do nothing
	}

	public void save(TDcDatacenterbaseinfo transientInstance) {
		log.debug("saving TDcDatacenterbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TDcDatacenterbaseinfo persistentInstance) {
		log.debug("deleting TDcDatacenterbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDcDatacenterbaseinfo findById(java.lang.String id) {
		log.debug("getting TDcDatacenterbaseinfo instance with id: " + id);
		try {
			TDcDatacenterbaseinfo instance = (TDcDatacenterbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TDcDatacenterbaseinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TDcDatacenterbaseinfo instance) {
		log.debug("finding TDcDatacenterbaseinfo instance by example");
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
		log.debug("finding TDcDatacenterbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TDcDatacenterbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDatacentername(Object FDatacentername) {
		return findByProperty(_FDATACENTERNAME, FDatacentername);
	}

	public List findByFDatacenterdesc(Object FDatacenterdesc) {
		return findByProperty(_FDATACENTERDESC, FDatacenterdesc);
	}

	public List findByFDatacentercontact(Object FDatacentercontact) {
		return findByProperty(_FDATACENTERCONTACT, FDatacentercontact);
	}

	public List findByFDatacentertel(Object FDatacentertel) {
		return findByProperty(_FDATACENTERTEL, FDatacentertel);
	}

	public List findAll() {
		log.debug("finding all TDcDatacenterbaseinfo instances");
		try {
			String queryString = "from TDcDatacenterbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TDcDatacenterbaseinfo merge(TDcDatacenterbaseinfo detachedInstance) {
		log.debug("merging TDcDatacenterbaseinfo instance");
		try {
			TDcDatacenterbaseinfo result = (TDcDatacenterbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TDcDatacenterbaseinfo instance) {
		log.debug("attaching dirty TDcDatacenterbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDcDatacenterbaseinfo instance) {
		log.debug("attaching clean TDcDatacenterbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TDcDatacenterbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TDcDatacenterbaseinfoDAO) ctx
				.getBean("TDcDatacenterbaseinfoDAO");
	}
}