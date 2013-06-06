package com.serviceDesk.event.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.serviceDesk.event.biz.EventSolutionFacade;
import com.serviceDesk.event.domain.TEventSolution;
import com.serviceDesk.event.form.TEventSolutionForm;

public class EventSolutionAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(EventSolutionAction.class);
	
	//事件解决方案
	private String eventSolutionId;
	private TEventSolution eventSolution = new TEventSolution();
	private TEventSolutionForm eventSolutionForm = new TEventSolutionForm();
	private EventSolutionFacade eventSolutionFacade;
	
	//JSON字符串的对象
	private Map<String, Object> dataMap = new HashMap<String, Object>();;
	
	public String searchEventSolution(){
		if(log.isInfoEnabled()) log.info("查询时间解决方案！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TEventSolutionForm> eventSolutionFormList = this.eventSolutionFacade.findByKeywords(eventSolutionForm.getKeywords());
			dataMap.put("eventSolutionFormList", eventSolutionFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询组织信息出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String eventSolutionThumbsUp(){
		if(log.isInfoEnabled()) log.info("事件解决方案获得好评！");
		try {
			dataMap.clear();
			Integer thumbsUp = this.eventSolutionFacade.thumbsUp(eventSolutionForm.getEventSolutionId());
			dataMap.put("thumbsUp", thumbsUp);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("事件解决方案获得好评出现异常!",e);
			}
		}
		return SUCCESS;
	}
	
	public String eventSolutionThumbsDown(){
		if(log.isInfoEnabled()) log.info("事件解决方案获得好评！");
		try {
			dataMap.clear();
			Integer thumbsDown = this.eventSolutionFacade.thumbsDown(eventSolutionForm.getEventSolutionId());
			dataMap.put("thumbsDown", thumbsDown);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("事件解决方案获得好评出现异常!",e);
			}
		}
		return SUCCESS;
	}
	
	public String getEventSolutionId() {
		return eventSolutionId;
	}
	public void setEventSolutionId(String eventSolutionId) {
		this.eventSolutionId = eventSolutionId;
	}
	public TEventSolution getEventSolution() {
		return eventSolution;
	}
	public void setEventSolution(TEventSolution eventSolution) {
		this.eventSolution = eventSolution;
	}
	public TEventSolutionForm getEventSolutionForm() {
		return eventSolutionForm;
	}
	public void setEventSolutionForm(TEventSolutionForm eventSolutionForm) {
		this.eventSolutionForm = eventSolutionForm;
	}
	public EventSolutionFacade getEventSolutionFacade() {
		return eventSolutionFacade;
	}
	public void setEventSolutionFacade(EventSolutionFacade eventSolutionFacade) {
		this.eventSolutionFacade = eventSolutionFacade;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}


	
}
