package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TPdDevlocationinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdDevlocationinfo
 * @author MyEclipse Persistence Tools
 */

public class TPdDevlocationinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdDevlocationinfoDAO.class);
	// property constants
	public static final String _FDEVLOCATIONNAME = "FDevlocationname";
	public static final String _FDEVLOACTIONDESC = "FDevloactiondesc";
	public static final String _FINSTALLOPERATOR = "FInstalloperator";
	public static final String _FREMOVEOPERATOR = "FRemoveoperator";
	public static final String _FCREATEUSER = "FCreateuser";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdDevlocationinfo transientInstance) {
		log.debug("saving TPdDevlocationinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdDevlocationinfo persistentInstance) {
		log.debug("deleting TPdDevlocationinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdDevlocationinfo findById(java.lang.String id) {
		log.debug("getting TPdDevlocationinfo instance with id: " + id);
		try {
			TPdDevlocationinfo instance = (TPdDevlocationinfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdDevlocationinfo", id);
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

	public List findByExample(TPdDevlocationinfo instance) {
		log.debug("finding TPdDevlocationinfo instance by example");
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
		log.debug("finding TPdDevlocationinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdDevlocationinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFDevlocationname(Object FDevlocationname) {
		return findByProperty(_FDEVLOCATIONNAME, FDevlocationname);
	}

	public List findByFDevloactiondesc(Object FDevloactiondesc) {
		return findByProperty(_FDEVLOACTIONDESC, FDevloactiondesc);
	}

	public List findByFInstalloperator(Object FInstalloperator) {
		return findByProperty(_FINSTALLOPERATOR, FInstalloperator);
	}

	public List findByFRemoveoperator(Object FRemoveoperator) {
		return findByProperty(_FREMOVEOPERATOR, FRemoveoperator);
	}

	public List findByFCreateuser(Object FCreateuser) {
		return findByProperty(_FCREATEUSER, FCreateuser);
	}

	public List findAll() {
		log.debug("finding all TPdDevlocationinfo instances");
		try {
			String queryString = "from TPdDevlocationinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdDevlocationinfo merge(TPdDevlocationinfo detachedInstance) {
		log.debug("merging TPdDevlocationinfo instance");
		try {
			TPdDevlocationinfo result = (TPdDevlocationinfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdDevlocationinfo instance) {
		log.debug("attaching dirty TPdDevlocationinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdDevlocationinfo instance) {
		log.debug("attaching clean TPdDevlocationinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdDevlocationinfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdDevlocationinfoDAO) ctx.getBean("TPdDevlocationinfoDAO");
	}
}