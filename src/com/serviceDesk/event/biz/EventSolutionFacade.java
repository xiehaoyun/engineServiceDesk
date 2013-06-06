package com.serviceDesk.event.biz;

import java.util.List;

import com.serviceDesk.event.domain.TEventSolution;
import com.serviceDesk.event.form.TEventSolutionForm;

public interface EventSolutionFacade {
	/**
	 * 保存或更新
	 * @param eventSolution
	 */
	public void saveOrUpdate(TEventSolution eventSolution) throws Exception;

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Integer id) throws Exception;

	/**
	 * 通过ID获得实体对象
	 * @param id
	 * @return TEventSolution
	 */
	public TEventSolution getById(Integer id) throws Exception;
	
	/**
	 * 查询列表
	 * @param 
	 */
	public List<TEventSolutionForm> findList(int pageSize, int pageIndex) throws Exception;
	
	/**
	 * 通过关键字查询列表，关键字通过空格隔开
	 * @param 
	 */
	public  List<TEventSolutionForm> findByKeywords(String keywords) throws Exception;
	
	/**
	 * 获得好评，增加该事件解决方案的好评数
	 * @param 
	 */
	public Integer thumbsUp(Integer eventSolutionId) throws Exception;
	
	/**
	 * 获得差评，增加该事件解决方案的差评数
	 * @param 
	 */
	public Integer thumbsDown(Integer eventSolutionId) throws Exception;

}
