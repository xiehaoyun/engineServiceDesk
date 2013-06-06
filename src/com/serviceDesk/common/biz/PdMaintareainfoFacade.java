package com.serviceDesk.common.biz;

import java.util.List;

import com.serviceDesk.common.domain.TPdMaintareainfo;
import com.serviceDesk.common.form.TPdMaintareainfoForm;

public interface PdMaintareainfoFacade {

	/**
	 * 保存或更新
	 * @param pdMaintareainfoFormId
	 */
	public void saveOrUpdate(TPdMaintareainfo pdMaintareainfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdMaintareainfoForm
	 */
	public TPdMaintareainfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdMaintareainfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 根据组织代码查询建筑信息
	 * @param 
	 */
	public List<TPdMaintareainfoForm> findByBuildId(String buildId) throws Exception;

}
