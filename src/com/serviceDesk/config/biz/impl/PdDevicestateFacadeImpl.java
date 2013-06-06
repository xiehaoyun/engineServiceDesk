package com.serviceDesk.config.biz.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.config.biz.PdDevicestateFacade;
import com.serviceDesk.config.dao.impl.TPdDevicestateDAO;
import com.serviceDesk.config.domain.TPdDevicestate;
import com.serviceDesk.config.form.TPdDevicestateForm;

public class PdDevicestateFacadeImpl implements PdDevicestateFacade {

	private static final Log log = LogFactory.getLog(PdDevicestateFacadeImpl.class);
	private TPdDevicestateDAO pdDevicestateDAO;
	private BaseDAO baseDao;

	public void saveOrUpdate(TPdDevicestate pdDevicestate) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdDevicestate getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdDevicestateForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public TPdDevicestateDAO getPdDevicestateDAO() {
		return pdDevicestateDAO;
	}

	public void setPdDevicestateDAO(TPdDevicestateDAO pdDevicestateDAO) {
		this.pdDevicestateDAO = pdDevicestateDAO;
	}

	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

}
