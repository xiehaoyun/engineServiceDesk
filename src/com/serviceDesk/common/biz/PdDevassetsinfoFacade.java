package com.serviceDesk.common.biz;

import java.util.List;

import com.serviceDesk.common.domain.TPdDevassetsinfo;
import com.serviceDesk.common.form.TPdDevassetsinfoForm;

public interface PdDevassetsinfoFacade {

	/**
	 * 保存或更新
	 * @param bdBuildbaseinfoFormId
	 */
	public void saveOrUpdate(TPdDevassetsinfo pdDevassetsinfo) throws Exception;

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
	public TPdDevassetsinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDevassetsinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	

}
