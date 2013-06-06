package com.serviceDesk.common.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.biz.PdMaintareainfoFacade;
import com.serviceDesk.common.domain.TPdMaintareainfo;
import com.serviceDesk.common.domain.TPdMaintareainfoDAO;
import com.serviceDesk.common.form.TBdBuildbaseinfoForm;
import com.serviceDesk.common.form.TPdMaintareainfoForm;
import com.serviceDesk.common.util.ClassCastUtil;

public class PdMaintareainfoFacadeImpl implements PdMaintareainfoFacade {

	private static final Log log = LogFactory.getLog(MoOrgbaseinfoFacadeImpl.class);
	private TPdMaintareainfoDAO pdMaintareainfoDao;
	
	public void saveOrUpdate(TPdMaintareainfo pdMaintareainfo) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TPdMaintareainfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdMaintareainfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TPdMaintareainfoForm> findByBuildId(String buildId)
			throws Exception {
		
		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//通过组织id查询建筑信息
		sql.append("SELECT MA.F_MaintAreaID, MA.F_MaintAreaName, MA.F_FloorNum ");
		sql.append(" FROM T_PD_MaintAreaInfo MA, T_BD_BUILDBASEINFO BULID ");
		sql.append(" WHERE MA.F_BUILDID = BULID.F_BUILDID ");
		
		//组织机构代码
		if(buildId!=null && !"".equals(buildId.trim())){
			sql.append(" AND MA.F_BUILDID = ? ");
			args.add(buildId);
		}else{
			return null;
		}
		
		List<Object[]> list = this.pdMaintareainfoDao.findListBySql(sql.toString(), args);	
		List<TPdMaintareainfoForm> tPdMaintareainfoFormList = getNewList(list); 

		return tPdMaintareainfoFormList;
	}
	
	private List<TPdMaintareainfoForm> getNewList(List<Object[]> list) throws Exception{
		List<TPdMaintareainfoForm> newList = new ArrayList<TPdMaintareainfoForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TPdMaintareainfoForm tPdMaintareainfoForm = new TPdMaintareainfoForm();

				tPdMaintareainfoForm.setFMaintareaid(ClassCastUtil.transString(obj[0]));
				tPdMaintareainfoForm.setFMaintareaname(ClassCastUtil.transString(obj[1]));
				if(ClassCastUtil.transString(obj[2])!=null && !"".equals(ClassCastUtil.transString(obj[2]))){
					tPdMaintareainfoForm.setFFloornum(ClassCastUtil.transInteger(obj[2]));
				}
				
				newList.add(tPdMaintareainfoForm);
			}
		}
		return newList;
	}

	public TPdMaintareainfoDAO getPdMaintareainfoDao() {
		return pdMaintareainfoDao;
	}

	public void setPdMaintareainfoDao(TPdMaintareainfoDAO pdMaintareainfoDao) {
		this.pdMaintareainfoDao = pdMaintareainfoDao;
	}

}
