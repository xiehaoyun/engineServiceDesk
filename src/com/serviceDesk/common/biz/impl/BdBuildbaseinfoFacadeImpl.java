package com.serviceDesk.common.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.biz.BdBuildbaseinfoFacade;
import com.serviceDesk.common.domain.TBdBuildbaseinfo;
import com.serviceDesk.common.domain.TBdBuildbaseinfoDAO;
import com.serviceDesk.common.form.TBdBuildbaseinfoForm;
import com.serviceDesk.common.form.TMoOrgbaseinfoForm;
import com.serviceDesk.common.util.ClassCastUtil;
import com.serviceDesk.common.util.DateFilter;

public class BdBuildbaseinfoFacadeImpl implements BdBuildbaseinfoFacade {

	private static final Log log = LogFactory.getLog(BdBuildbaseinfoFacadeImpl.class);
	private TBdBuildbaseinfoDAO bdBuildbaseinfoDao;

	public void saveOrUpdate(TBdBuildbaseinfo bdBuildbaseinfo) throws Exception {
		// TODO Auto-generated method stub
		if(bdBuildbaseinfo!=null){
			this.bdBuildbaseinfoDao.save(bdBuildbaseinfo);
		}else{
			if(log.isErrorEnabled())
				log.error("建筑对象为空");
		}
	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TBdBuildbaseinfo getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return this.bdBuildbaseinfoDao.findById(id);
	}

	public List<TBdBuildbaseinfoForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<TBdBuildbaseinfoForm> findByOrgCode(String orgCode)
			throws Exception {
		
		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//通过组织id查询建筑信息
		sql.append("SELECT BULID.F_BUILDID, BULID.F_BUILDNAME ");
		sql.append(" FROM T_BD_BUILDBASEINFO BULID, T_BD_OrgBuildRelaInfo OBR, T_MO_ORGBASEINFO ORG ");
		sql.append(" WHERE BULID.F_BUILDID = OBR.F_BUILDID AND OBR.F_ORGCODE = ORG.F_ORGCODE ");

		//组织机构代码
		if(orgCode!=null && !"".equals(orgCode.trim())){
			sql.append(" AND ORG.F_ORGCODE = ? ");
			args.add(orgCode);
		}else{
			return null;
		}
		
		List<Object[]> list = this.bdBuildbaseinfoDao.findListBySql(sql.toString(), args);	
		List<TBdBuildbaseinfoForm> tBdBuildbaseinfoFormList = getNewList(list); 

		return tBdBuildbaseinfoFormList;
	}

	private List<TBdBuildbaseinfoForm> getNewList(List<Object[]> list) throws Exception{
		List<TBdBuildbaseinfoForm> newList = new ArrayList<TBdBuildbaseinfoForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TBdBuildbaseinfoForm tBdBuildbaseinfoForm = new TBdBuildbaseinfoForm();

				tBdBuildbaseinfoForm.setFBuildid(ClassCastUtil.transString(obj[0]));
				tBdBuildbaseinfoForm.setFBuildname(ClassCastUtil.transString(obj[1]));

				newList.add(tBdBuildbaseinfoForm);
			}
		}
		return newList;
	}

	public TBdBuildbaseinfoDAO getBdBuildbaseinfoDao() {
		return bdBuildbaseinfoDao;
	}

	public void setBdBuildbaseinfoDao(TBdBuildbaseinfoDAO bdBuildbaseinfoDao) {
		this.bdBuildbaseinfoDao = bdBuildbaseinfoDao;
	}
}
