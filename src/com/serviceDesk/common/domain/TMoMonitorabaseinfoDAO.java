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
 * TMoMonitorabaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoMonitorabaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoMonitorabaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoMonitorabaseinfoDAO.class);
	// property constants
	public static final String _FMONITORANAME = "FMonitoraname";
	public static final String _FMONITORALEVEL = "FMonitoralevel";
	public static final String _FPARENTMONITORAID = "FParentmonitoraid";
	public static final String _FMONITORAFUNC = "FMonitorafunc";
	public static final String _FMONITORAAREA = "FMonitoraarea";
	public static final String _FHEATAREA = "FHeatarea";
	public static final String _FCOLDAREA = "FColdarea";
	public static final String _FMONITORACONTACT = "FMonitoracontact";
	public static final String _FMONITORATEL = "FMonitoratel";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoMonitorabaseinfo transientInstance) {
		log.debug("saving TMoMonitorabaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoMonitorabaseinfo persistentInstance) {
		log.debug("deleting TMoMonitorabaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoMonitorabaseinfo findById(java.lang.String id) {
		log.debug("getting TMoMonitorabaseinfo instance with id: " + id);
		try {
			TMoMonitorabaseinfo instance = (TMoMonitorabaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoMonitorabaseinfo",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TMoMonitorabaseinfo instance) {
		log.debug("finding TMoMonitorabaseinfo instance by example");
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
		log.debug("finding TMoMonitorabaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoMonitorabaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMonitoraname(Object FMonitoraname) {
		return findByProperty(_FMONITORANAME, FMonitoraname);
	}

	public List findByFMonitoralevel(Object FMonitoralevel) {
		return findByProperty(_FMONITORALEVEL, FMonitoralevel);
	}

	public List findByFParentmonitoraid(Object FParentmonitoraid) {
		return findByProperty(_FPARENTMONITORAID, FParentmonitoraid);
	}

	public List findByFMonitorafunc(Object FMonitorafunc) {
		return findByProperty(_FMONITORAFUNC, FMonitorafunc);
	}

	public List findByFMonitoraarea(Object FMonitoraarea) {
		return findByProperty(_FMONITORAAREA, FMonitoraarea);
	}

	public List findByFHeatarea(Object FHeatarea) {
		return findByProperty(_FHEATAREA, FHeatarea);
	}

	public List findByFColdarea(Object FColdarea) {
		return findByProperty(_FCOLDAREA, FColdarea);
	}

	public List findByFMonitoracontact(Object FMonitoracontact) {
		return findByProperty(_FMONITORACONTACT, FMonitoracontact);
	}

	public List findByFMonitoratel(Object FMonitoratel) {
		return findByProperty(_FMONITORATEL, FMonitoratel);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoMonitorabaseinfo instances");
		try {
			String queryString = "from TMoMonitorabaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoMonitorabaseinfo merge(TMoMonitorabaseinfo detachedInstance) {
		log.debug("merging TMoMonitorabaseinfo instance");
		try {
			TMoMonitorabaseinfo result = (TMoMonitorabaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoMonitorabaseinfo instance) {
		log.debug("attaching dirty TMoMonitorabaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoMonitorabaseinfo instance) {
		log.debug("attaching clean TMoMonitorabaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoMonitorabaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoMonitorabaseinfoDAO) ctx.getBean("TMoMonitorabaseinfoDAO");
	}
}