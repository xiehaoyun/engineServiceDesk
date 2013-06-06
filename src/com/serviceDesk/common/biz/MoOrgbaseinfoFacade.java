package com.serviceDesk.common.biz;

import java.util.List;

import com.serviceDesk.common.domain.TMoOrgbaseinfo;
import com.serviceDesk.common.form.TMoOrgbaseinfoForm;

public interface MoOrgbaseinfoFacade {

	/**
	 * 保存或更新
	 * @param moOrgbaseinfoForm
	 */
	public void saveOrUpdate(TMoOrgbaseinfo moOrgbaseinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TMoOrgbaseinfoForm
	 */
	public TMoOrgbaseinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TMoOrgbaseinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 按照组织机构代码或者组织机构名称查询列表
	 * @param 
	 */
	public List<TMoOrgbaseinfoForm> findByOrgCodeOrName(String orgCode, String orgName) throws Exception;

}
