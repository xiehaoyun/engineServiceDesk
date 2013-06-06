package com.serviceDesk.common.biz.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.biz.PdDevassetsinfoFacade;
import com.serviceDesk.common.domain.TPdDevassetsinfo;
import com.serviceDesk.common.domain.TPdDevassetsinfoDAO;
import com.serviceDesk.common.form.TPdDevassetsinfoForm;

public class PdDevassetsinfoFacadeImpl implements PdDevassetsinfoFacade {

	private static final Log log = LogFactory.getLog(PdDevassetsinfoFacadeImpl.class);
	private TPdDevassetsinfoDAO pdDevassetsinfoDao;

	public void saveOrUpdate(TPdDevassetsinfo pdDevassetsinfo) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdDevassetsinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return this.pdDevassetsinfoDao.findById(id);
	}

	public List<TPdDevassetsinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TPdDevassetsinfoDAO getPdDevassetsinfoDao() {
		return pdDevassetsinfoDao;
	}

	public void setPdDevassetsinfoDao(TPdDevassetsinfoDAO pdDevassetsinfoDao) {
		this.pdDevassetsinfoDao = pdDevassetsinfoDao;
	}

}
