package com.serviceDesk.common.domain;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMoOrgbaseinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TMoOrgbaseinfo
 * @author MyEclipse Persistence Tools
 */

public class TMoOrgbaseinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TMoOrgbaseinfoDAO.class);
	// property constants
	public static final String _FORGNAME = "FOrgname";
	public static final String _FORGTYPE = "FOrgtype";
	public static final String _FREGCAPITAL = "FRegcapital";
	public static final String _FCORPORATE = "FCorporate";
	public static final String _FCORPORATETEL = "FCorporatetel";
	public static final String _FENERGYLEADER = "FEnergyleader";
	public static final String _FENERGYLEADERTEL = "FEnergyleadertel";
	public static final String _FORGADDR1 = "FOrgaddr1";
	public static final String _FORGADDR2 = "FOrgaddr2";
	public static final String _FORGADDR3 = "FOrgaddr3";
	public static final String _FORGADDR4 = "FOrgaddr4";
	public static final String _FORGADDR5 = "FOrgaddr5";
	public static final String _FORGADDR6 = "FOrgaddr6";
	public static final String _FORGTEL = "FOrgtel";
	public static final String _FORGFAXNUM = "FOrgfaxnum";
	public static final String _FORGEMAIL = "FOrgemail";
	public static final String _FORGBUILDAREA = "FOrgbuildarea";
	public static final String _FHEATAREA = "FHeatarea";
	public static final String _FCOLDAREA = "FColdarea";
	public static final String _FORGDESC = "FOrgdesc";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TMoOrgbaseinfo transientInstance) {
		log.debug("saving TMoOrgbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TMoOrgbaseinfo persistentInstance) {
		log.debug("deleting TMoOrgbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TMoOrgbaseinfo findById(java.lang.String id) {
		log.debug("getting TMoOrgbaseinfo instance with id: " + id);
		try {
			TMoOrgbaseinfo instance = (TMoOrgbaseinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TMoOrgbaseinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Object[]> findByOrgCodeOrName(String sql, List<Object> args){

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

	public List findByExample(TMoOrgbaseinfo instance) {
		log.debug("finding TMoOrgbaseinfo instance by example");
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
		log.debug("finding TMoOrgbaseinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TMoOrgbaseinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFOrgname(Object FOrgname) {
		return findByProperty(_FORGNAME, FOrgname);
	}

	public List findByFOrgtype(Object FOrgtype) {
		return findByProperty(_FORGTYPE, FOrgtype);
	}

	public List findByFRegcapital(Object FRegcapital) {
		return findByProperty(_FREGCAPITAL, FRegcapital);
	}

	public List findByFCorporate(Object FCorporate) {
		return findByProperty(_FCORPORATE, FCorporate);
	}

	public List findByFCorporatetel(Object FCorporatetel) {
		return findByProperty(_FCORPORATETEL, FCorporatetel);
	}

	public List findByFEnergyleader(Object FEnergyleader) {
		return findByProperty(_FENERGYLEADER, FEnergyleader);
	}

	public List findByFEnergyleadertel(Object FEnergyleadertel) {
		return findByProperty(_FENERGYLEADERTEL, FEnergyleadertel);
	}

	public List findByFOrgaddr1(Object FOrgaddr1) {
		return findByProperty(_FORGADDR1, FOrgaddr1);
	}

	public List findByFOrgaddr2(Object FOrgaddr2) {
		return findByProperty(_FORGADDR2, FOrgaddr2);
	}

	public List findByFOrgaddr3(Object FOrgaddr3) {
		return findByProperty(_FORGADDR3, FOrgaddr3);
	}

	public List findByFOrgaddr4(Object FOrgaddr4) {
		return findByProperty(_FORGADDR4, FOrgaddr4);
	}

	public List findByFOrgaddr5(Object FOrgaddr5) {
		return findByProperty(_FORGADDR5, FOrgaddr5);
	}

	public List findByFOrgaddr6(Object FOrgaddr6) {
		return findByProperty(_FORGADDR6, FOrgaddr6);
	}

	public List findByFOrgtel(Object FOrgtel) {
		return findByProperty(_FORGTEL, FOrgtel);
	}

	public List findByFOrgfaxnum(Object FOrgfaxnum) {
		return findByProperty(_FORGFAXNUM, FOrgfaxnum);
	}

	public List findByFOrgemail(Object FOrgemail) {
		return findByProperty(_FORGEMAIL, FOrgemail);
	}

	public List findByFOrgbuildarea(Object FOrgbuildarea) {
		return findByProperty(_FORGBUILDAREA, FOrgbuildarea);
	}

	public List findByFHeatarea(Object FHeatarea) {
		return findByProperty(_FHEATAREA, FHeatarea);
	}

	public List findByFColdarea(Object FColdarea) {
		return findByProperty(_FCOLDAREA, FColdarea);
	}

	public List findByFOrgdesc(Object FOrgdesc) {
		return findByProperty(_FORGDESC, FOrgdesc);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TMoOrgbaseinfo instances");
		try {
			String queryString = "from TMoOrgbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TMoOrgbaseinfo merge(TMoOrgbaseinfo detachedInstance) {
		log.debug("merging TMoOrgbaseinfo instance");
		try {
			TMoOrgbaseinfo result = (TMoOrgbaseinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TMoOrgbaseinfo instance) {
		log.debug("attaching dirty TMoOrgbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TMoOrgbaseinfo instance) {
		log.debug("attaching clean TMoOrgbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TMoOrgbaseinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TMoOrgbaseinfoDAO) ctx.getBean("TMoOrgbaseinfoDAO");
	}
}