package com.serviceDesk.common.domain;

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
 * TEvEventinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEvEventinfo
 * @author MyEclipse Persistence Tools
 */

public class TEvEventinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEvEventinfoDAO.class);
	// property constants
	public static final String _FEVENTSOURCE = "FEventsource";
	public static final String _FEVENTTYPE = "FEventtype";
	public static final String _FEVENTSTATE = "FEventstate";
	public static final String _FCREATEUSER = "FCreateuser";
	public static final String _FCUSTOMERNAME = "FCustomername";
	public static final String _FCUSTOMERTEL = "FCustomertel";
	public static final String _FACCMANAGER = "FAccmanager";
	public static final String _FEVENTDESC = "FEventdesc";
	public static final String _FSEVICERECORD = "FSevicerecord";
	public static final String _FSOLUTION = "FSolution";
	public static final String _FORGNAME = "FOrgname";
	public static final String _FDEPARTNAME = "FDepartname";
	public static final String _FBUILDNAME = "FBuildname";
	public static final String _FMONITORANAME = "FMonitoraname";

	protected void initDao() {
		// do nothing
	}

	public void save(TEvEventinfo transientInstance) {
		log.debug("saving TEvEventinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEvEventinfo persistentInstance) {
		log.debug("deleting TEvEventinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEvEventinfo findById(java.math.BigDecimal id) {
		log.debug("getting TEvEventinfo instance with id: " + id);
		try {
			TEvEventinfo instance = (TEvEventinfo) getHibernateTemplate().get(
					"com.serviceDesk.common.domain.TEvEventinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEvEventinfo instance) {
		log.debug("finding TEvEventinfo instance by example");
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
		log.debug("finding TEvEventinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEvEventinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFEventsource(Object FEventsource) {
		return findByProperty(_FEVENTSOURCE, FEventsource);
	}

	public List findByFEventtype(Object FEventtype) {
		return findByProperty(_FEVENTTYPE, FEventtype);
	}

	public List findByFEventstate(Object FEventstate) {
		return findByProperty(_FEVENTSTATE, FEventstate);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findByFCustomername(Object FCustomername) {
		return findByProperty(_FCUSTOMERNAME, FCustomername);
	}

	public List findByFCustomertel(Object FCustomertel) {
		return findByProperty(_FCUSTOMERTEL, FCustomertel);
	}

	public List findByFAccmanager(Object FAccmanager) {
		return findByProperty(_FACCMANAGER, FAccmanager);
	}

	public List findByFEventdesc(Object FEventdesc) {
		return findByProperty(_FEVENTDESC, FEventdesc);
	}

	public List findByFSevicerecord(Object FSevicerecord) {
		return findByProperty(_FSEVICERECORD, FSevicerecord);
	}

	public List findByFSolution(Object FSolution) {
		return findByProperty(_FSOLUTION, FSolution);
	}

	public List findByFOrgname(Object FOrgname) {
		return findByProperty(_FORGNAME, FOrgname);
	}

	public List findByFDepartname(Object FDepartname) {
		return findByProperty(_FDEPARTNAME, FDepartname);
	}

	public List findByFBuildname(Object FBuildname) {
		return findByProperty(_FBUILDNAME, FBuildname);
	}

	public List findByFMonitoraname(Object FMonitoraname) {
		return findByProperty(_FMONITORANAME, FMonitoraname);
	}

	public List findAll() {
		log.debug("finding all TEvEventinfo instances");
		try {
			String queryString = "from TEvEventinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEvEventinfo merge(TEvEventinfo detachedInstance) {
		log.debug("merging TEvEventinfo instance");
		try {
			TEvEventinfo result = (TEvEventinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEvEventinfo instance) {
		log.debug("attaching dirty TEvEventinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEvEventinfo instance) {
		log.debug("attaching clean TEvEventinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEvEventinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEvEventinfoDAO) ctx.getBean("TEvEventinfoDAO");
	}
}