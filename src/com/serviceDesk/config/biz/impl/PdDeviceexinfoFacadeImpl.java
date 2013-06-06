package com.serviceDesk.config.biz.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.config.biz.PdDeviceexinfoFacade;
import com.serviceDesk.config.dao.impl.TPdDeviceexinfoDAO;
import com.serviceDesk.config.domain.TPdDeviceexinfo;
import com.serviceDesk.config.form.TPdDeviceexinfoForm;

public class PdDeviceexinfoFacadeImpl implements PdDeviceexinfoFacade {

	private static final Log log = LogFactory.getLog(PdDeviceexinfoFacadeImpl.class);
	private TPdDeviceexinfoDAO pdDeviceexinfoDAO;
	private BaseDAO baseDao;
	
	public void saveOrUpdate(TPdDeviceexinfo pdDeviceexinfo) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdDeviceexinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdDeviceexinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TPdDeviceexinfoDAO getPdDeviceexinfoDAO() {
		return pdDeviceexinfoDAO;
	}

	public void setPdDeviceexinfoDAO(TPdDeviceexinfoDAO pdDeviceexinfoDAO) {
		this.pdDeviceexinfoDAO = pdDeviceexinfoDAO;
	}

	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

}
