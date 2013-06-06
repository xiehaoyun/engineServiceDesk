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
 * TEvEventworkorder entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TEvEventworkorder
 * @author MyEclipse Persistence Tools
 */

public class TEvEventworkorderDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TEvEventworkorderDAO.class);
	// property constants
	public static final String _FWORKORDERLEVEL = "FWorkorderlevel";
	public static final String _FCREATEUSER = "FCreateuser";
	public static final String _FCUSTOMERNAME = "FCustomername";
	public static final String _FCUSTOMERTEL = "FCustomertel";
	public static final String _FWORKORDERDESC = "FWorkorderdesc";
	public static final String _FSERVICERECORD = "FServicerecord";
	public static final String _FORGNAME = "FOrgname";
	public static final String _FDEPARTNAME = "FDepartname";
	public static final String _FBUILDNAME = "FBuildname";
	public static final String _FMONITORANAME = "FMonitoraname";

	protected void initDao() {
		// do nothing
	}

	public void save(TEvEventworkorder transientInstance) {
		log.debug("saving TEvEventworkorder instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TEvEventworkorder persistentInstance) {
		log.debug("deleting TEvEventworkorder instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TEvEventworkorder findById(java.math.BigDecimal id) {
		log.debug("getting TEvEventworkorder instance with id: " + id);
		try {
			TEvEventworkorder instance = (TEvEventworkorder) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TEvEventworkorder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TEvEventworkorder instance) {
		log.debug("finding TEvEventworkorder instance by example");
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
		log.debug("finding TEvEventworkorder instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TEvEventworkorder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFWorkorderlevel(Object FWorkorderlevel) {
		return findByProperty(_FWORKORDERLEVEL, FWorkorderlevel);
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

	public List findByFWorkorderdesc(Object FWorkorderdesc) {
		return findByProperty(_FWORKORDERDESC, FWorkorderdesc);
	}

	public List findByFServicerecord(Object FServicerecord) {
		return findByProperty(_FSERVICERECORD, FServicerecord);
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
		log.debug("finding all TEvEventworkorder instances");
		try {
			String queryString = "from TEvEventworkorder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TEvEventworkorder merge(TEvEventworkorder detachedInstance) {
		log.debug("merging TEvEventworkorder instance");
		try {
			TEvEventworkorder result = (TEvEventworkorder) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TEvEventworkorder instance) {
		log.debug("attaching dirty TEvEventworkorder instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TEvEventworkorder instance) {
		log.debug("attaching clean TEvEventworkorder instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TEvEventworkorderDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TEvEventworkorderDAO) ctx.getBean("TEvEventworkorderDAO");
	}
}