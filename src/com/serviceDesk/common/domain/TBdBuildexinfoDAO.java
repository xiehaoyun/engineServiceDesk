package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TBdBuildexinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildexinfo
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildexinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildexinfoDAO.class);
	// property constants
	public static final String _FSERVICELEVEL = "FServicelevel";
	public static final String _FHOSPITALSTANDARD = "FHospitalstandard";
	public static final String _FHOSPITALTYPE = "FHospitaltype";
	public static final String _FGROUPFUNC = "FGroupfunc";
	public static final String _FEXTENDFUNC = "FExtendfunc";
	public static final String _FELECTRIPRICE = "FElectriprice";
	public static final String _FWATERPRICE = "FWaterprice";
	public static final String _FGASPRICE = "FGasprice";
	public static final String _FHEATPRICE = "FHeatprice";
	public static final String _FOTHERPRICE = "FOtherprice";

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildexinfo transientInstance) {
		log.debug("saving TBdBuildexinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildexinfo persistentInstance) {
		log.debug("deleting TBdBuildexinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildexinfo findById(java.lang.String id) {
		log.debug("getting TBdBuildexinfo instance with id: " + id);
		try {
			TBdBuildexinfo instance = (TBdBuildexinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildexinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TBdBuildexinfo instance) {
		log.debug("finding TBdBuildexinfo instance by example");
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
		log.debug("finding TBdBuildexinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildexinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFServicelevel(Object FServicelevel) {
		return findByProperty(_FSERVICELEVEL, FServicelevel);
	}

	public List findByFHospitalstandard(Object FHospitalstandard) {
		return findByProperty(_FHOSPITALSTANDARD, FHospitalstandard);
	}

	public List findByFHospitaltype(Object FHospitaltype) {
		return findByProperty(_FHOSPITALTYPE, FHospitaltype);
	}

	public List findByFGroupfunc(Object FGroupfunc) {
		return findByProperty(_FGROUPFUNC, FGroupfunc);
	}

	public List findByFExtendfunc(Object FExtendfunc) {
		return findByProperty(_FEXTENDFUNC, FExtendfunc);
	}

	public List findByFElectriprice(Object FElectriprice) {
		return findByProperty(_FELECTRIPRICE, FElectriprice);
	}

	public List findByFWaterprice(Object FWaterprice) {
		return findByProperty(_FWATERPRICE, FWaterprice);
	}

	public List findByFGasprice(Object FGasprice) {
		return findByProperty(_FGASPRICE, FGasprice);
	}

	public List findByFHeatprice(Object FHeatprice) {
		return findByProperty(_FHEATPRICE, FHeatprice);
	}

	public List findByFOtherprice(Object FOtherprice) {
		return findByProperty(_FOTHERPRICE, FOtherprice);
	}

	public List findAll() {
		log.debug("finding all TBdBuildexinfo instances");
		try {
			String queryString = "from TBdBuildexinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildexinfo merge(TBdBuildexinfo detachedInstance) {
		log.debug("merging TBdBuildexinfo instance");
		try {
			TBdBuildexinfo result = (TBdBuildexinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildexinfo instance) {
		log.debug("attaching dirty TBdBuildexinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildexinfo instance) {
		log.debug("attaching clean TBdBuildexinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildexinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildexinfoDAO) ctx.getBean("TBdBuildexinfoDAO");
	}
}