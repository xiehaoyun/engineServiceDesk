package com.serviceDesk.common.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.biz.PdDevlocationinfoFacade;
import com.serviceDesk.common.domain.TPdDevlocationinfo;
import com.serviceDesk.common.domain.TPdDevlocationinfoDAO;
import com.serviceDesk.common.form.TPdDevlocationinfoForm;
import com.serviceDesk.common.util.ClassCastUtil;

public class PdDevlocationinfoFacadeImpl implements PdDevlocationinfoFacade {

	private static final Log log = LogFactory.getLog(PdDevlocationinfoFacadeImpl.class);
	private TPdDevlocationinfoDAO pdDevlocationinfoDao;

	public void saveOrUpdate(TPdDevlocationinfo pdDevlocationinfo)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdDevlocationinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdDevlocationinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdDevlocationinfoForm> findByMaintAreaId(String maintAreaId)
			throws Exception {

		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//通过组织id查询建筑信息
		sql.append("SELECT DA.F_DevAssetsID, DL.F_DevLocationName, DL.F_DevLoactionDesc ");
		sql.append(" FROM T_PD_MaintAreaInfo MA, T_PD_MaintAPGRelaInfo MAPR, T_PD_PowerGridInfo GR");
		sql.append(" , T_PD_DevLocationInfo DL, T_PD_DevAssetsInfo DA");
		sql.append(" WHERE MA.F_MaintAreaID = MAPR.F_MaintAreaID AND MAPR.F_PowerGridID = GR.F_PowerGridID ");
		sql.append(" AND GR.F_PowerGridID = DL.F_PowerGridID AND DL.F_DevLocationID = DA.F_DevLocationID");

		//组织机构代码
		if(maintAreaId!=null && !"".equals(maintAreaId.trim())){
			sql.append(" AND MA.F_MaintAreaID = ?");
			args.add(maintAreaId);
		}else{
			return null;
		}

		List<Object[]> list = this.pdDevlocationinfoDao.findListBySql(sql.toString(), args);	
		List<TPdDevlocationinfoForm> tPdDevlocationinfoFormList = getNewList(list); 

		return tPdDevlocationinfoFormList;
	}

	private List<TPdDevlocationinfoForm> getNewList(List<Object[]> list) throws Exception{
		List<TPdDevlocationinfoForm> newList = new ArrayList<TPdDevlocationinfoForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TPdDevlocationinfoForm tPdDevlocationinfoForm = new TPdDevlocationinfoForm();
				
				tPdDevlocationinfoForm.setFDevAssetsId(ClassCastUtil.transString(obj[0]));
				tPdDevlocationinfoForm.setFDevlocationname(ClassCastUtil.transString(obj[1]));
				tPdDevlocationinfoForm.setFDevloactiondesc(ClassCastUtil.transString(obj[2]));

				newList.add(tPdDevlocationinfoForm);
			}
		}
		return newList;
	}

	public TPdDevlocationinfoDAO getPdDevlocationinfoDao() {
		return pdDevlocationinfoDao;
	}

	public void setPdDevlocationinfoDao(TPdDevlocationinfoDAO pdDevlocationinfoDao) {
		this.pdDevlocationinfoDao = pdDevlocationinfoDao;
	}

}
