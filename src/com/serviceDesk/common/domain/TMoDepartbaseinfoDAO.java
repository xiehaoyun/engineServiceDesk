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
 * TMoDepartbaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoDepartbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoDepartbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoDepartbaseinfoDAO.class);
	// property constants
	public static final String _FDEPARTNAME = "FDepartname";
	public static final String _FDEPARTLEVEL = "FDepartlevel";
	public static final String _FPARENTDEPARTID = "FParentdepartid";
	public static final String _FDEPARTFUNC = "FDepartfunc";
	public static final String _FDEPARTAREA = "FDepartarea";
	public static final String _FHEATAREA = "FHeatarea";
	public static final String _FCOLDAREA = "FColdarea";
	public static final String _FDEPARTCONTACT = "FDepartcontact";
	public static final String _FDEPARTTEL = "FDeparttel";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoDepartbaseinfo transientInstance) {
		log.debug("saving TMoDepartbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoDepartbaseinfo persistentInstance) {
		log.debug("deleting TMoDepartbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoDepartbaseinfo findById(java.lang.String id) {
		log.debug("getting TMoDepartbaseinfo instance with id: " + id);
		try {
			TMoDepartbaseinfo instance = (TMoDepartbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoDepartbaseinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoDepartbaseinfo instance) {
		log.debug("finding TMoDepartbaseinfo instance by example");
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
		log.debug("finding TMoDepartbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoDepartbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDepartname(Object FDepartname) {
		return findByProperty(_FDEPARTNAME, FDepartname);
	}

	public List findByFDepartlevel(Object FDepartlevel) {
		return findByProperty(_FDEPARTLEVEL, FDepartlevel);
	}

	public List findByFParentdepartid(Object FParentdepartid) {
		return findByProperty(_FPARENTDEPARTID, FParentdepartid);
	}

	public List findByFDepartfunc(Object FDepartfunc) {
		return findByProperty(_FDEPARTFUNC, FDepartfunc);
	}

	public List findByFDepartarea(Object FDepartarea) {
		return findByProperty(_FDEPARTAREA, FDepartarea);
	}

	public List findByFHeatarea(Object FHeatarea) {
		return findByProperty(_FHEATAREA, FHeatarea);
	}

	public List findByFColdarea(Object FColdarea) {
		return findByProperty(_FCOLDAREA, FColdarea);
	}

	public List findByFDepartcontact(Object FDepartcontact) {
		return findByProperty(_FDEPARTCONTACT, FDepartcontact);
	}

	public List findByFDeparttel(Object FDeparttel) {
		return findByProperty(_FDEPARTTEL, FDeparttel);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoDepartbaseinfo instances");
		try {
			String queryString = "from TMoDepartbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoDepartbaseinfo merge(TMoDepartbaseinfo detachedInstance) {
		log.debug("merging TMoDepartbaseinfo instance");
		try {
			TMoDepartbaseinfo result = (TMoDepartbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoDepartbaseinfo instance) {
		log.debug("attaching dirty TMoDepartbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoDepartbaseinfo instance) {
		log.debug("attaching clean TMoDepartbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoDepartbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoDepartbaseinfoDAO) ctx.getBean("TMoDepartbaseinfoDAO");
	}
}