package com.serviceDesk.config.biz.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.common.form.TMoOrgbaseinfoForm;
import com.serviceDesk.common.util.ClassCastUtil;
import com.serviceDesk.common.util.DateFilter;
import com.serviceDesk.config.biz.PdDeviceinfoFacade;
import com.serviceDesk.config.dao.impl.TPdDeviceinfoDAO;
import com.serviceDesk.config.domain.TPdDeviceinfo;
import com.serviceDesk.config.form.TPdDeviceinfoForm;

public class PdDeviceinfoFacadeImpl implements PdDeviceinfoFacade {

	private static final Log log = LogFactory.getLog(PdDeviceinfoFacadeImpl.class);
	private TPdDeviceinfoDAO pdDeviceinfoDAO;
	private BaseDAO baseDao;

	public void saveOrUpdate(TPdDeviceinfo pdDeviceinfo) throws Exception {
		// TODO Auto-generated method stub
		this.pdDeviceinfoDAO.getHibernateTemplate().saveOrUpdate(pdDeviceinfo);
	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	//这里id的数据类型做过改动，原先为String类型
	public TPdDeviceinfo getById(BigDecimal id) throws Exception {
		// TODO Auto-generated method stub
		return this.pdDeviceinfoDAO.findById(id);
	}

	public List<TPdDeviceinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public TPdDeviceinfoDAO getPdDeviceinfoDAO() {
		return pdDeviceinfoDAO;
	}

	public void setPdDeviceinfoDAO(TPdDeviceinfoDAO pdDeviceinfoDAO) {
		this.pdDeviceinfoDAO = pdDeviceinfoDAO;
	}

	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

	//自己写的
	public List<TPdDeviceinfoForm> findByCompanyAreaFDevname(String company, String area, String dev) throws Exception {
		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//查询组织机构信息，对应的服务级别，及对应的客户经理
		//sql.append("SELECT ORG.F_ORGCODE, ORG.F_ORGNAME, MOR.F_STARTTIME, MOR.F_ENDTIME, MOR.F_State, MOR.F_Description ");
		//sql.append(" , STAFF.F_STAFFID, STAFF.F_STAFFNAME, STAFF.F_StaffTel");
		//sql.append(" FROM T_MO_ORGBASEINFO ORG, T_EV_MANAGERORGRELAINFO MOR, T_EV_STAFFINFO STAFF ");
		//sql.append(" WHERE ORG.F_ORGCODE = MOR.F_ORGCODE AND MOR.F_STAFFID = STAFF.F_STAFFID ");
		
		//查询设备的基本信息
		sql.append("SELECT T7.F_DevAssetsID, T1.F_ORGNAME, T3.F_MAINTAREANAME, T8.F_DEVNAME, T8.F_DEVBRAND, T8.F_DEVMODEL, T8.F_DEVPRODUCER, T10.F_DEVICESTATENAME ");
		sql.append("FROM T_MO_ORGBASEINFO T1, T_PD_DEPARTMAINTARELAINFO T2, T_PD_MAINTAREAINFO T3, ");
		sql.append("T_PD_MAINTAPGRELAINFO T4, T_PD_POWERGRIDINFO T5, T_PD_DEVLOCATIONINFO T6, T_PD_DEVASSETSINFO T7, ");
		sql.append("T_PD_DEVICEINFO T8, T_PD_DEVSTATERESULT T9, T_PD_DEVICESTATE T10 WHERE ");
		sql.append("T1.F_ORGCODE = T2.F_ORGCODE AND T2.F_MAINTAREAID = T3.F_MAINTAREAID AND T3.F_MAINTAREAID = T4.F_MAINTAREAID ");
		sql.append("T4.F_POWERGRIDID = T5.F_POWERGRIDID AND T5.F_POWERGRIDID = T6.F_POWERGRIDID AND ");
		sql.append("T6.F_DEVLOCATIONID = T7.F_DEVLOCATIONID AND T7.F_DEVID = T8.F_DEVID AND ");
		sql.append("T7.F_DEVASSETSID = T9.F_DEVASSETSID AND T9.DEVICESTATEID = T10.DEVICESTATEID");
		
		//公司名称
		if(company != null && !"".equals(company.trim())){
			sql.append(" AND T1.F_ORGNAME like ? ");
			args.add("%"+company+"%");
		}
		//区域名称
		if(area != null && !"".equals(area.trim())){
			sql.append(" AND t3.F_MaintAreaName like ? ");
			args.add("%"+area+"%");
		}
		//设备类型
		if(dev != null){
			sql.append("AND t8.F_DevName like ? ");
			args.add("%"+dev+"%");
		}

		List<Object[]> list = this.pdDeviceinfoDAO.findByCompanyAreaFDevname(sql.toString(), args);	
		//List<TMoOrgbaseinfoForm> tMoOrgbaseinfoFormList = getNewList(list); 
		List<TPdDeviceinfoForm> tpddeviceinfoFormList = getNewList(list);
		return tpddeviceinfoFormList;
	}
	
	private List<TPdDeviceinfoForm> getNewList(List<Object[]> list) throws Exception{
		List<TPdDeviceinfoForm> newList = new ArrayList<TPdDeviceinfoForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);			
				TPdDeviceinfoForm tPdDeviceinfoForm = new TPdDeviceinfoForm();
				//凡是整数转换的都需要以下面的形式来存储
				if(ClassCastUtil.transString(obj[0])!=null && !"".equals(ClassCastUtil.transString(obj[0]))){
					tPdDeviceinfoForm.setFDevid(Integer.valueOf(obj[0].toString()));
				}				
				tPdDeviceinfoForm.setOrgName(ClassCastUtil.transString(obj[1]));
				tPdDeviceinfoForm.setAreaName(ClassCastUtil.transString(obj[2]));
				tPdDeviceinfoForm.setFDevname(ClassCastUtil.transString(obj[3]));
				tPdDeviceinfoForm.setFDevbrand(ClassCastUtil.transString(obj[4]));
				tPdDeviceinfoForm.setFDevmodel(ClassCastUtil.transString(obj[5]));
				tPdDeviceinfoForm.setFDevproducer(ClassCastUtil.transString(obj[6]));

				newList.add(tPdDeviceinfoForm);
			}
		}
		return newList;
	}

	public TPdDeviceinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}

