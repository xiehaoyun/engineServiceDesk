package com.serviceDesk.config.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.serviceDesk.config.biz.PdDevicestateFacade;

public class PdDevicestateAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(PdDevicestateAction.class);
	private PdDevicestateFacade pdDevicestateFacade;
	
	//将会被Struts2序列化为JSON字符串的对象
	private Map<String, Object> dataMap =  new HashMap<String, Object>();;

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

	public PdDevicestateFacade getPdDevicestateFacade() {
		return pdDevicestateFacade;
	}

	public void setPdDevicestateFacade(PdDevicestateFacade pdDevicestateFacade) {
		this.pdDevicestateFacade = pdDevicestateFacade;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
