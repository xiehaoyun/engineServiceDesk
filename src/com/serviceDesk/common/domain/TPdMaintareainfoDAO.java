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
 * TPdMaintareainfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.serviceDesk.common.domain.TPdMaintareainfo
 * @author MyEclipse Persistence Tools
 */

public class TPdMaintareainfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(TPdMaintareainfoDAO.class);
	// property constants
	public static final String _FMAINTAREANAME = "FMaintareaname";

	protected void initDao() {
		// do nothing
	}

	public void save(TPdMaintareainfo transientInstance) {
		log.debug("saving TPdMaintareainfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TPdMaintareainfo persistentInstance) {
		log.debug("deleting TPdMaintareainfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TPdMaintareainfo findById(java.lang.String id) {
		log.debug("getting TPdMaintareainfo instance with id: " + id);
		try {
			TPdMaintareainfo instance = (TPdMaintareainfo) getHibernateTemplate()
					.get("com.serviceDesk.common.domain.TPdMaintareainfo", id);
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

	public List findByExample(TPdMaintareainfo instance) {
		log.debug("finding TPdMaintareainfo instance by example");
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
		log.debug("finding TPdMaintareainfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TPdMaintareainfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFMaintareaname(Object FMaintareaname) {
		return findByProperty(_FMAINTAREANAME, FMaintareaname);
	}

	public List findAll() {
		log.debug("finding all TPdMaintareainfo instances");
		try {
			String queryString = "from TPdMaintareainfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TPdMaintareainfo merge(TPdMaintareainfo detachedInstance) {
		log.debug("merging TPdMaintareainfo instance");
		try {
			TPdMaintareainfo result = (TPdMaintareainfo) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TPdMaintareainfo instance) {
		log.debug("attaching dirty TPdMaintareainfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TPdMaintareainfo instance) {
		log.debug("attaching clean TPdMaintareainfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TPdMaintareainfoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TPdMaintareainfoDAO) ctx.getBean("TPdMaintareainfoDAO");
	}
}