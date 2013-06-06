package com.serviceDesk.event.biz;

import java.util.List;
import java.util.Map;

import com.serviceDesk.event.domain.TEventRequest;
import com.serviceDesk.event.form.TEventRequestForm;

public interface EventRequestFacade {

	/**
	 * 保存或更新
	 * @param eventRequestId
	 */
	public void saveOrUpdate(TEventRequest eventRequest) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TEventRequest
	 */
	public TEventRequest getById(Integer id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TEventRequestForm> findList(int pageSize, int pageIndex) throws Exception;
		
}
