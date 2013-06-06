package com.serviceDesk.common.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.biz.MoOrgbaseinfoFacade;
import com.serviceDesk.common.domain.TMoOrgbaseinfo;
import com.serviceDesk.common.domain.TMoOrgbaseinfoDAO;
import com.serviceDesk.common.form.TMoOrgbaseinfoForm;
import com.serviceDesk.common.util.ClassCastUtil;
import com.serviceDesk.common.util.DateFilter;

public class MoOrgbaseinfoFacadeImpl implements MoOrgbaseinfoFacade {

	private static final Log log = LogFactory.getLog(MoOrgbaseinfoFacadeImpl.class);
	private TMoOrgbaseinfoDAO moOrgbaseinfoDao;

	public void saveOrUpdate(TMoOrgbaseinfo moOrgbaseinfo)
			throws Exception {
		if(moOrgbaseinfo!=null){
			this.moOrgbaseinfoDao.save(moOrgbaseinfo);
		}else{
			if(log.isErrorEnabled())
				log.error("组织机构对象为空");
		}
	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
	}

	public TMoOrgbaseinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return this.moOrgbaseinfoDao.findById(id);
	}

	public List<TMoOrgbaseinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TMoOrgbaseinfoForm> findByOrgCodeOrName(String orgCode, String orgName)
			throws Exception {

		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//查询组织机构信息，对应的服务级别，及对应的客户经理
		sql.append("SELECT ORG.F_ORGCODE, ORG.F_ORGNAME, MOR.F_STARTTIME, MOR.F_ENDTIME, MOR.F_State, MOR.F_Description ");
		sql.append(" , STAFF.F_STAFFID, STAFF.F_STAFFNAME, STAFF.F_StaffTel");
		sql.append(" FROM T_MO_ORGBASEINFO ORG, T_EV_MANAGERORGRELAINFO MOR, T_EV_STAFFINFO STAFF ");
		sql.append(" WHERE ORG.F_ORGCODE = MOR.F_ORGCODE AND MOR.F_STAFFID = STAFF.F_STAFFID ");

		//组织机构代码
		if(orgCode!=null && !"".equals(orgCode.trim())){
			sql.append(" AND ORG.F_ORGCODE like ? ");
			args.add("%"+orgCode+"%");
		}
		//组织名称
		if(orgName!=null && !"".equals(orgName.trim())){
			sql.append(" AND ORG.F_ORGNAME like ? ");
			args.add("%"+orgName+"%");
		}

		List<Object[]> list = this.moOrgbaseinfoDao.findByOrgCodeOrName(sql.toString(), args);	
		List<TMoOrgbaseinfoForm> tMoOrgbaseinfoFormList = getNewList(list); 

		return tMoOrgbaseinfoFormList;
	}

	private List<TMoOrgbaseinfoForm> getNewList(List<Object[]> list) throws Exception{
		List<TMoOrgbaseinfoForm> newList = new ArrayList<TMoOrgbaseinfoForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TMoOrgbaseinfoForm tMoOrgbaseinfoForm = new TMoOrgbaseinfoForm();

				tMoOrgbaseinfoForm.setFOrgcode(ClassCastUtil.transString(obj[0]));
				tMoOrgbaseinfoForm.setFOrgname(ClassCastUtil.transString(obj[1]));
				tMoOrgbaseinfoForm.setFStartTime(DateFilter.str2SQLDateTime(ClassCastUtil.transString(obj[2])));
				tMoOrgbaseinfoForm.setFEndTime(DateFilter.str2SQLDateTime(ClassCastUtil.transString(obj[3])));
				if(ClassCastUtil.transString(obj[4])!=null && !"".equals(ClassCastUtil.transString(obj[4]))){
					tMoOrgbaseinfoForm.setFState(Integer.valueOf(obj[4].toString()));
				}
				tMoOrgbaseinfoForm.setFDescription(ClassCastUtil.transString(obj[5]));
				if(ClassCastUtil.transString(obj[6])!=null && !"".equals(ClassCastUtil.transString(obj[6]))){
					tMoOrgbaseinfoForm.setFStaffId(Integer.valueOf(obj[6].toString()));
				}
				tMoOrgbaseinfoForm.setFStaffName(ClassCastUtil.transString(obj[7]));
				tMoOrgbaseinfoForm.setFStaffTel(ClassCastUtil.transString(obj[8]));

				newList.add(tMoOrgbaseinfoForm);
			}
		}
		return newList;
	}

	public TMoOrgbaseinfoDAO getMoOrgbaseinfoDao() {
		return moOrgbaseinfoDao;
	}

	public void setMoOrgbaseinfoDao(TMoOrgbaseinfoDAO moOrgbaseinfoDao) {
		this.moOrgbaseinfoDao = moOrgbaseinfoDao;
	}

}
