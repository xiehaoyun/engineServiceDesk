package com.serviceDesk.common.biz;

import java.util.List;

import com.serviceDesk.common.domain.TBdBuildbaseinfo;
import com.serviceDesk.common.form.TBdBuildbaseinfoForm;

public interface BdBuildbaseinfoFacade {

	/**
	 * 保存或更新
	 * @param bdBuildbaseinfoFormId
	 */
	public void saveOrUpdate(TBdBuildbaseinfo bdBuildbaseinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TBdBuildbaseinfoForm
	 */
	public TBdBuildbaseinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TBdBuildbaseinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 根据组织代码查询建筑信息
	 * @param 
	 */
	public List<TBdBuildbaseinfoForm> findByOrgCode(String orgCode) throws Exception;

}
