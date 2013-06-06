package com.serviceDesk.config.biz;

import java.util.List;

import com.serviceDesk.config.domain.TPdDevicestate;
import com.serviceDesk.config.form.TPdDevicestateForm;

public interface PdDevicestateFacade {
	/**
	 * 保存或更新
	 * @param pdDevicestateFormId
	 */
	public void saveOrUpdate(TPdDevicestate pdDevicestate) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdDevicestateForm
	 */
	public TPdDevicestate getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDevicestateForm> findList(int pageSize, int pageIndex) throws Exception;
	
}
