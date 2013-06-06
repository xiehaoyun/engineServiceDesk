package com.serviceDesk.config.biz;

import java.util.List;

import com.serviceDesk.config.domain.TPdDevexinfodict;
import com.serviceDesk.config.form.TPdDevexinfodictForm;

public interface PdDevexinfodictFacade {
	/**
	 * 保存或更新
	 * @param pdDeviceexinfoFormId
	 */
	public void saveOrUpdate(TPdDevexinfodict pdDeviceexinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdDevexinfodictForm
	 */
	public TPdDevexinfodict getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDevexinfodictForm> findList(int pageSize, int pageIndex) throws Exception;
	
}
