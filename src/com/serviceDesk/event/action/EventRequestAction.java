package com.serviceDesk.event.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.serviceDesk.common.biz.BdBuildbaseinfoFacade;
import com.serviceDesk.common.biz.MoOrgbaseinfoFacade;
import com.serviceDesk.common.biz.PdDevlocationinfoFacade;
import com.serviceDesk.common.biz.PdMaintareainfoFacade;
import com.serviceDesk.common.domain.TBdBuildbaseinfo;
import com.serviceDesk.common.domain.TPdDevassetsinfo;
import com.serviceDesk.common.domain.TPdDevlocationinfo;
import com.serviceDesk.common.domain.TPdMaintareainfo;
import com.serviceDesk.common.form.TBdBuildbaseinfoForm;
import com.serviceDesk.common.form.TMoOrgbaseinfoForm;
import com.serviceDesk.common.form.TPdDevlocationinfoForm;
import com.serviceDesk.common.form.TPdMaintareainfoForm;
import com.serviceDesk.event.biz.EventRequestFacade;
import com.serviceDesk.event.biz.EventWorkOrderFacade;
import com.serviceDesk.event.domain.TEventRequest;
import com.serviceDesk.event.domain.TEventWorkOrder;
import com.serviceDesk.event.form.TEventRequestForm;
import com.serviceDesk.event.form.TEventWorkOrderForm;

public class EventRequestAction  extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(EventRequestAction.class);

	//事件请求
	private String eventRequestId;
	private TEventRequest eventRequest = new TEventRequest();
	private TEventRequestForm eventRequestForm = new TEventRequestForm();
	private EventRequestFacade eventRequestFacade;
	
	//事件工单
	private TEventWorkOrder eventWorkOrder = new TEventWorkOrder();
	private EventWorkOrderFacade eventWorkOrderFacade;

	//组织机构信息
	private TMoOrgbaseinfoForm moOrgbaseinfoForm = new TMoOrgbaseinfoForm();
	private MoOrgbaseinfoFacade moOrgbaseinfoFacade;
	
	//建筑信息
	private TBdBuildbaseinfo bdBuildbaseinfo = new TBdBuildbaseinfo();
	private BdBuildbaseinfoFacade bdBuildbaseinfoFacade;
	
	//运维区域信息
	private TPdMaintareainfo pdMaintareainfo = new TPdMaintareainfo();
	private PdMaintareainfoFacade pdMaintareainfoFacade;
	
	//设备位置信息
	private TPdDevlocationinfo pdDevlocationinfo = new TPdDevlocationinfo();
	private PdDevlocationinfoFacade pdDevlocationinfoFacade;
	
	//设备资产信息
	private TPdDevassetsinfo pdDevassetsinfo = new TPdDevassetsinfo();

	//将会被Struts2序列化为JSON字符串的对象
	private Map<String, Object> dataMap;

	public EventRequestAction (){
		//初始化Map对象
		dataMap = new HashMap<String, Object>();
	}

	public String searchOrgInfo(){
		if(log.isInfoEnabled()) log.info("查询组织信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TMoOrgbaseinfoForm> moOrgbaseinfoFormList = this.moOrgbaseinfoFacade.findByOrgCodeOrName(moOrgbaseinfoForm.getFOrgcode(), moOrgbaseinfoForm.getFOrgname());
			dataMap.put("moOrgbaseinfoFormList", moOrgbaseinfoFormList);
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
	
	public String searchBuildInfo(){
		if(log.isInfoEnabled()) log.info("查询建筑信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TBdBuildbaseinfoForm> bdBuildbaseinfoFormList = this.bdBuildbaseinfoFacade.findByOrgCode(moOrgbaseinfoForm.getFOrgcode());
			dataMap.put("bdBuildbaseinfoFormList", bdBuildbaseinfoFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询建筑信息出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String searchMaintAreaInfo(){
		if(log.isInfoEnabled()) log.info("查询运维区域信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TPdMaintareainfoForm> pdMaintareainfoFormList = this.pdMaintareainfoFacade.findByBuildId(bdBuildbaseinfo.getFBuildid());
			dataMap.put("pdMaintareainfoFormList", pdMaintareainfoFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询运维区域出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String searchDevLocationInfo(){
		if(log.isInfoEnabled()) log.info("查询设备位置信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TPdDevlocationinfoForm> pdDevlocationinfoFormList = this.pdDevlocationinfoFacade.findByMaintAreaId(pdMaintareainfo.getFMaintareaid());
			dataMap.put("pdDevlocationinfoFormList", pdDevlocationinfoFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询设备位置信息出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String searchHistoryMaintenanceRecord(){
		if(log.isInfoEnabled()) log.info("查询运维区域信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TEventWorkOrderForm> eventWorkOrderFormList = this.eventWorkOrderFacade.findByDevAssetsId(pdDevassetsinfo.getFDevassetsid());
			dataMap.put("eventWorkOrderFormList", eventWorkOrderFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询运维区域出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String viewEventSolutionInfo(){
		if(log.isInfoEnabled()) log.info("查询事件解决方案详细信息（事件解决方案的eventRequestId对应一个已经发生的事件）！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			if(this.eventRequestId!=null && !"".equals(this.eventRequestId.trim())){
				Integer eventRequestId = Integer.parseInt(this.eventRequestId);
				//查询时间信息
				eventRequest = this.eventRequestFacade.getById(eventRequestId);
				dataMap.put("eventRequest", eventRequest);
				//查询工单信息
				List<TEventWorkOrder> eventWorkOrderList = this.eventWorkOrderFacade.findByEventRequestId(eventRequestId); 
				dataMap.put("eventWorkOrderList", eventWorkOrderList);
				// 放入一个是否操作成功的标识
				dataMap.put("success", true);
			} else{
				dataMap.put("success", false);
			}
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询事件解决方案详细信息出现异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String searchEventRequest(){
		return SUCCESS;
	}

	public String getEventRequestId() {
		return eventRequestId;
	}

	public void setEventRequestId(String eventRequestId) {
		this.eventRequestId = eventRequestId;
	}

	public TEventRequest getEventRequest() {
		return eventRequest;
	}

	public void setEventRequest(TEventRequest eventRequest) {
		this.eventRequest = eventRequest;
	}

	public TEventRequestForm getEventRequestForm() {
		return eventRequestForm;
	}

	public void setEventRequestForm(TEventRequestForm eventRequestForm) {
		this.eventRequestForm = eventRequestForm;
	}

	public EventRequestFacade getEventRequestFacade() {
		return eventRequestFacade;
	}

	public void setEventRequestFacade(EventRequestFacade eventRequestFacade) {
		this.eventRequestFacade = eventRequestFacade;
	}

	public TMoOrgbaseinfoForm getMoOrgbaseinfoForm() {
		return moOrgbaseinfoForm;
	}

	public void setMoOrgbaseinfoForm(TMoOrgbaseinfoForm moOrgbaseinfoForm) {
		this.moOrgbaseinfoForm = moOrgbaseinfoForm;
	}

	public MoOrgbaseinfoFacade getMoOrgbaseinfoFacade() {
		return moOrgbaseinfoFacade;
	}

	public void setMoOrgbaseinfoFacade(MoOrgbaseinfoFacade moOrgbaseinfoFacade) {
		this.moOrgbaseinfoFacade = moOrgbaseinfoFacade;
	}

	public BdBuildbaseinfoFacade getBdBuildbaseinfoFacade() {
		return bdBuildbaseinfoFacade;
	}

	public void setBdBuildbaseinfoFacade(BdBuildbaseinfoFacade bdBuildbaseinfoFacade) {
		this.bdBuildbaseinfoFacade = bdBuildbaseinfoFacade;
	}

	public TBdBuildbaseinfo getBdBuildbaseinfo() {
		return bdBuildbaseinfo;
	}

	public void setBdBuildbaseinfo(TBdBuildbaseinfo bdBuildbaseinfo) {
		this.bdBuildbaseinfo = bdBuildbaseinfo;
	}

	public TPdMaintareainfo getPdMaintareainfo() {
		return pdMaintareainfo;
	}

	public void setPdMaintareainfo(TPdMaintareainfo pdMaintareainfo) {
		this.pdMaintareainfo = pdMaintareainfo;
	}

	public PdMaintareainfoFacade getPdMaintareainfoFacade() {
		return pdMaintareainfoFacade;
	}

	public void setPdMaintareainfoFacade(PdMaintareainfoFacade pdMaintareainfoFacade) {
		this.pdMaintareainfoFacade = pdMaintareainfoFacade;
	}

	public TPdDevlocationinfo getPdDevlocationinfo() {
		return pdDevlocationinfo;
	}

	public void setPdDevlocationinfo(TPdDevlocationinfo pdDevlocationinfo) {
		this.pdDevlocationinfo = pdDevlocationinfo;
	}

	public PdDevlocationinfoFacade getPdDevlocationinfoFacade() {
		return pdDevlocationinfoFacade;
	}

	public void setPdDevlocationinfoFacade(
			PdDevlocationinfoFacade pdDevlocationinfoFacade) {
		this.pdDevlocationinfoFacade = pdDevlocationinfoFacade;
	}

	public TEventWorkOrder getEventWorkOrder() {
		return eventWorkOrder;
	}

	public void setEventWorkOrder(TEventWorkOrder eventWorkOrder) {
		this.eventWorkOrder = eventWorkOrder;
	}

	public EventWorkOrderFacade getEventWorkOrderFacade() {
		return eventWorkOrderFacade;
	}

	public void setEventWorkOrderFacade(EventWorkOrderFacade eventWorkOrderFacade) {
		this.eventWorkOrderFacade = eventWorkOrderFacade;
	}

	public TPdDevassetsinfo getPdDevassetsinfo() {
		return pdDevassetsinfo;
	}

	public void setPdDevassetsinfo(TPdDevassetsinfo pdDevassetsinfo) {
		this.pdDevassetsinfo = pdDevassetsinfo;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
