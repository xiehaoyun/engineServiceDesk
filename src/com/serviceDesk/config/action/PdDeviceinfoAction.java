package com.serviceDesk.config.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.serviceDesk.config.biz.PdDeviceinfoFacade;
import com.serviceDesk.config.form.TPdDeviceinfoForm;
import com.serviceDesk.event.form.TEventSolutionForm;

public class PdDeviceinfoAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(PdDeviceinfoAction.class);
	private PdDeviceinfoFacade pdDeviceinfoFacade;
	
	//设备信息
	private TPdDeviceinfoForm deviceinfoForm = new TPdDeviceinfoForm();
	
	
	//将会被Struts2序列化为JSON字符串的对象
	private Map<String, Object> dataMap =  new HashMap<String, Object>();
	
	//该action对应modifyDeviceInfo.jsp
	public String modifyDeviceinfo(){
		if(log.isInfoEnabled()) log.info("查询设备/部件信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			List<TPdDeviceinfoForm> deviceinfoFormList = this.pdDeviceinfoFacade.findByCompanyAreaFDevname
			(deviceinfoForm.getCompanyName(), deviceinfoForm.getAreaName(), deviceinfoForm.getFDevname());
			
			dataMap.put("deviceinfoFormList", deviceinfoFormList);
			// 放入一个是否操作成功的标识
			dataMap.put("success", true);
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error("查询设备/部件信息异常!",e);
			}
		}
		// 返回结果
		return SUCCESS;
	}
	
	public String demo(){
		if(log.isInfoEnabled()) log.info("查询组织信息！");
		try {
			// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
			dataMap.clear();
			
			System.out.print("go");
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

	public PdDeviceinfoFacade getPdDeviceinfoFacade() {
		return pdDeviceinfoFacade;
	}

	public void setPdDeviceinfoFacade(PdDeviceinfoFacade pdDeviceinfoFacade) {
		this.pdDeviceinfoFacade = pdDeviceinfoFacade;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public TPdDeviceinfoForm getDeviceinfoForm() {
		return deviceinfoForm;
	}

	public void setDeviceinfoForm(TPdDeviceinfoForm deviceinfoForm) {
		this.deviceinfoForm = deviceinfoForm;
	}
}
