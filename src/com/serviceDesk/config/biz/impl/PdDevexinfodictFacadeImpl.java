package com.serviceDesk.config.biz.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.config.biz.PdDevexinfodictFacade;
import com.serviceDesk.config.dao.impl.TPdDevexinfodictDAO;
import com.serviceDesk.config.domain.TPdDevexinfodict;
import com.serviceDesk.config.form.TPdDevexinfodictForm;

public class PdDevexinfodictFacadeImpl implements PdDevexinfodictFacade {

	private static final Log log = LogFactory.getLog(PdDevexinfodictFacadeImpl.class);
	public TPdDevexinfodictDAO getPdDevexinfodictDAO() {
		return pdDevexinfodictDAO;
	}

	public void setPdDevexinfodictDAO(TPdDevexinfodictDAO pdDevexinfodictDAO) {
		this.pdDevexinfodictDAO = pdDevexinfodictDAO;
	}

	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

	private TPdDevexinfodictDAO pdDevexinfodictDAO;
	private BaseDAO baseDao;
	
	public void saveOrUpdate(TPdDevexinfodict pdDeviceexinfo) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdDevexinfodict getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdDevexinfodictForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
