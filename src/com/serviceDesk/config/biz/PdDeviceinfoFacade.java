package com.serviceDesk.config.biz;

import java.util.List;

import com.serviceDesk.common.form.TMoOrgbaseinfoForm;
import com.serviceDesk.config.domain.TPdDeviceinfo;
import com.serviceDesk.config.form.TPdDeviceinfoForm;

public interface PdDeviceinfoFacade {

	/**
	 * 保存或更新
	 * @param pdDeviceinfoFormId
	 */
	public void saveOrUpdate(TPdDeviceinfo pdDeviceinfo) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TPdDeviceinfoForm
	 */
	public TPdDeviceinfo getById(String id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TPdDeviceinfoForm> findList(int pageSize, int pageIndex) throws Exception;
	
	public List<TPdDeviceinfoForm> findByCompanyAreaFDevname(String company, String area, String dev) throws Exception;

}
