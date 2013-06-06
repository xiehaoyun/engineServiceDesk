package com.serviceDesk.common.domain;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TBdBuildbaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TBdBuildbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TBdBuildbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TBdBuildbaseinfoDAO.class);
	// property constants
	public static final String _FBUILDNAME = "FBuildname";
	public static final String _FALIASNAME = "FAliasname";
	public static final String _FBUILDOWNER = "FBuildowner";
	public static final String _FBUILDADDR = "FBuildaddr";
	public static final String _FBUILDLONG = "FBuildlong";
	public static final String _FBUILDLAT = "FBuildlat";
	public static final String _FBUILDYEAR = "FBuildyear";
	public static final String _FBUILDFUNC = "FBuildfunc";
	public static final String _FTOTALAREA = "FTotalarea";
	public static final String _FAIRAREA = "FAirarea";
	public static final String _FHEATAREA = "FHeatarea";
	public static final String _FAIRTYPE = "FAirtype";
	public static final String _FHEATTYPE = "FHeattype";
	public static final String _FBODYCOEF = "FBodycoef";
	public static final String _FSTRUTYPE = "FStrutype";
	public static final String _FWALLMATTYPE = "FWallmattype";
	public static final String _FWALLWARMTYPE = "FWallwarmtype";
	public static final String _FWALLWINTYPE = "FWallwintype";
	public static final String _FGLASSTYPE = "FGlasstype";
	public static final String _FWINFRAMETYPE = "FWinframetype";
	public static final String _FDESIGNDEPT = "FDesigndept";
	public static final String _FWORKDEPT = "FWorkdept";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TBdBuildbaseinfo transientInstance) {
		log.debug("saving TBdBuildbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TBdBuildbaseinfo persistentInstance) {
		log.debug("deleting TBdBuildbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBdBuildbaseinfo findById(java.lang.String id) {
		log.debug("getting TBdBuildbaseinfo instance with id: " + id);
		try {
			TBdBuildbaseinfo instance = (TBdBuildbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TBdBuildbaseinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Object[]> findListBySql(String sql, List<Object> args){

		SQLQuery query = this.getSession().createSQLQuery(sql);
		if ((args != null) && (args.size() > 0)) {
			Object[] values = args.toArray();
			for (int i = 0; i < values.length; ++i) {
				query.setParameter(i, values[i]);
			}
		}

		List<Object[]> list = query.list();
		return list;
	}

	public List findByExample(TBdBuildbaseinfo instance) {
		log.debug("finding TBdBuildbaseinfo instance by example");
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
		log.debug("finding TBdBuildbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TBdBuildbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFBuildname(Object FBuildname) {
		return findByProperty(_FBUILDNAME, FBuildname);
	}

	public List findByFAliasname(Object FAliasname) {
		return findByProperty(_FALIASNAME, FAliasname);
	}

	public List findByFBuildowner(Object FBuildowner) {
		return findByProperty(_FBUILDOWNER, FBuildowner);
	}

	public List findByFBuildaddr(Object FBuildaddr) {
		return findByProperty(_FBUILDADDR, FBuildaddr);
	}

	public List findByFBuildlong(Object FBuildlong) {
		return findByProperty(_FBUILDLONG, FBuildlong);
	}

	public List findByFBuildlat(Object FBuildlat) {
		return findByProperty(_FBUILDLAT, FBuildlat);
	}

	public List findByFBuildyear(Object FBuildyear) {
		return findByProperty(_FBUILDYEAR, FBuildyear);
	}

	public List findByFBuildfunc(Object FBuildfunc) {
		return findByProperty(_FBUILDFUNC, FBuildfunc);
	}

	public List findByFTotalarea(Object FTotalarea) {
		return findByProperty(_FTOTALAREA, FTotalarea);
	}

	public List findByFAirarea(Object FAirarea) {
		return findByProperty(_FAIRAREA, FAirarea);
	}

	public List findByFHeatarea(Object FHeatarea) {
		return findByProperty(_FHEATAREA, FHeatarea);
	}

	public List findByFAirtype(Object FAirtype) {
		return findByProperty(_FAIRTYPE, FAirtype);
	}

	public List findByFHeattype(Object FHeattype) {
		return findByProperty(_FHEATTYPE, FHeattype);
	}

	public List findByFBodycoef(Object FBodycoef) {
		return findByProperty(_FBODYCOEF, FBodycoef);
	}

	public List findByFStrutype(Object FStrutype) {
		return findByProperty(_FSTRUTYPE, FStrutype);
	}

	public List findByFWallmattype(Object FWallmattype) {
		return findByProperty(_FWALLMATTYPE, FWallmattype);
	}

	public List findByFWallwarmtype(Object FWallwarmtype) {
		return findByProperty(_FWALLWARMTYPE, FWallwarmtype);
	}

	public List findByFWallwintype(Object FWallwintype) {
		return findByProperty(_FWALLWINTYPE, FWallwintype);
	}

	public List findByFGlasstype(Object FGlasstype) {
		return findByProperty(_FGLASSTYPE, FGlasstype);
	}

	public List findByFWinframetype(Object FWinframetype) {
		return findByProperty(_FWINFRAMETYPE, FWinframetype);
	}

	public List findByFDesigndept(Object FDesigndept) {
		return findByProperty(_FDESIGNDEPT, FDesigndept);
	}

	public List findByFWorkdept(Object FWorkdept) {
		return findByProperty(_FWORKDEPT, FWorkdept);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TBdBuildbaseinfo instances");
		try {
			String queryString = "from TBdBuildbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TBdBuildbaseinfo merge(TBdBuildbaseinfo detachedInstance) {
		log.debug("merging TBdBuildbaseinfo instance");
		try {
			TBdBuildbaseinfo result = (TBdBuildbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TBdBuildbaseinfo instance) {
		log.debug("attaching dirty TBdBuildbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBdBuildbaseinfo instance) {
		log.debug("attaching clean TBdBuildbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TBdBuildbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TBdBuildbaseinfoDAO) ctx.getBean("TBdBuildbaseinfoDAO");
	}
}