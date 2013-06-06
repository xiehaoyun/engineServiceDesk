package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMoMonitorpinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoMonitorpinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoMonitorpinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoMonitorpinfoDAO.class);
	// property constants
	public static final String _FMONITORPNAME = "FMonitorpname";
	public static final String _FMONITORPLEVEL = "FMonitorplevel";
	public static final String _FPARENTMONITORPID = "FParentmonitorpid";
	public static final String _FMONITORPSITUA = "FMonitorpsitua";
	public static final String _FMONITORPCONTENT = "FMonitorpcontent";
	public static final String _FMONITORPDESC = "FMonitorpdesc";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoMonitorpinfo transientInstance) {
		log.debug("saving TMoMonitorpinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoMonitorpinfo persistentInstance) {
		log.debug("deleting TMoMonitorpinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoMonitorpinfo findById(java.lang.String id) {
		log.debug("getting TMoMonitorpinfo instance with id: " + id);
		try {
			TMoMonitorpinfo instance = (TMoMonitorpinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoMonitorpinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoMonitorpinfo instance) {
		log.debug("finding TMoMonitorpinfo instance by example");
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
		log.debug("finding TMoMonitorpinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoMonitorpinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMonitorpname(Object FMonitorpname) {
		return findByProperty(_FMONITORPNAME, FMonitorpname);
	}

	public List findByFMonitorplevel(Object FMonitorplevel) {
		return findByProperty(_FMONITORPLEVEL, FMonitorplevel);
	}

	public List findByFParentmonitorpid(Object FParentmonitorpid) {
		return findByProperty(_FPARENTMONITORPID, FParentmonitorpid);
	}

	public List findByFMonitorpsitua(Object FMonitorpsitua) {
		return findByProperty(_FMONITORPSITUA, FMonitorpsitua);
	}

	public List findByFMonitorpcontent(Object FMonitorpcontent) {
		return findByProperty(_FMONITORPCONTENT, FMonitorpcontent);
	}

	public List findByFMonitorpdesc(Object FMonitorpdesc) {
		return findByProperty(_FMONITORPDESC, FMonitorpdesc);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoMonitorpinfo instances");
		try {
			String queryString = "from TMoMonitorpinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoMonitorpinfo merge(TMoMonitorpinfo detachedInstance) {
		log.debug("merging TMoMonitorpinfo instance");
		try {
			TMoMonitorpinfo result = (TMoMonitorpinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoMonitorpinfo instance) {
		log.debug("attaching dirty TMoMonitorpinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoMonitorpinfo instance) {
		log.debug("attaching clean TMoMonitorpinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoMonitorpinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoMonitorpinfoDAO) ctx.getBean("TMoMonitorpinfoDAO");
	}
}