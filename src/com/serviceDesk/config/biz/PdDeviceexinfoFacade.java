package com.serviceDesk.config.biz;

import java.util.List;

import com.serviceDesk.config.domain.TPdDeviceexinfo;
import com.serviceDesk.config.form.TPdDeviceexinfoForm;

public interface PdDeviceexinfoFacade {
	/**
	 * 保存或更新
	 * @param pdDeviceexinfoFormId
	 */
	public void saveOrUpdate(TPdDeviceexinfo pdDeviceexinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdDeviceexinfoForm
	 */
	public TPdDeviceexinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDeviceexinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
}
