package com.serviceDesk.event.biz;

import java.util.List;

import com.serviceDesk.event.domain.TEventWorkOrder;
import com.serviceDesk.event.form.TEventWorkOrderForm;

public interface EventWorkOrderFacade {

	/**
	 * 保存或更新
	 * @param eventWorkOrderId
	 */
	public void saveOrUpdate(TEventWorkOrder eventWorkOrder) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TEventWorkOrder
	 */
	public TEventWorkOrder getById(Integer id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TEventWorkOrderForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 根据设备资产id，查询工单信息
	 * @param 
	 */
	public List<TEventWorkOrderForm> findByDevAssetsId(String devAssetsId) throws Exception;
	
	/**
	 * 根据事件请求id，查询工单信息
	 * @param 
	 */
	public List<TEventWorkOrder> findByEventRequestId(Integer eventRequestId) throws Exception;
		
}
