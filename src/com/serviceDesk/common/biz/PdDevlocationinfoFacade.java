package com.serviceDesk.common.biz;

import java.util.List;

import com.serviceDesk.common.domain.TPdDevlocationinfo;
import com.serviceDesk.common.form.TPdDevlocationinfoForm;

public interface PdDevlocationinfoFacade {

	/**
	 * 保存或更新
	 * @param pdDevlocationinfoFormId
	 */
	public void saveOrUpdate(TPdDevlocationinfo pdDevlocationinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdDevlocationinfoForm
	 */
	public TPdDevlocationinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDevlocationinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 根据组织代码查询建筑信息
	 * @param 
	 */
	public List<TPdDevlocationinfoForm> findByMaintAreaId(String maintAreaId) throws Exception;

}
