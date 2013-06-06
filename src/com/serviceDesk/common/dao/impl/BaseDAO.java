package com.serviceDesk.common.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class BaseDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(BaseDAO.class);
	protected void initDao() {
		// do nothing
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

}