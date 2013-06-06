package com.serviceDesk.event.form;

import java.sql.Timestamp;

/**
 * TEventWorkOrder entity. @author MyEclipse Persistence Tools
 */

public class TEventWorkOrderForm implements java.io.Serializable {

	// Fields

	private Integer eventWorkOrderId;
	private Integer eventRequestId;
	private Integer creatorId;
	private String creatorName;
	private String serviceRecord;
	
	private String eventType; //事件类型
	private String eventLevel; //事件等级
	private String eventStatus; //事件状态
	private String description; //事件描述
	private Timestamp requestTime; //创建时间
	private Timestamp solveTime; //真正解决时间
	private String customerName; //客户名称
	private String customerPhone; //客户电话
	private String orgName; //机构名称
	private String buildName; //建筑名称
	private String maintAreaName; //运维区域名称
	private String deviceLocationName; //设备位置信息
	private String deviceAssetId; //设备资产 id
	private String sourceServiceRecord; //登记时服务记录

	// Constructors

	/** default constructor */
	public TEventWorkOrderForm() {
	}

	/** full constructor */
	public TEventWorkOrderForm(Integer eventRequestId, Integer creatorId,
			String creatorName, String serviceRecord) {
		this.eventRequestId = eventRequestId;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
		this.serviceRecord = serviceRecord;
	}

	// Property accessors

	public Integer getEventWorkOrderId() {
		return this.eventWorkOrderId;
	}

	public void setEventWorkOrderId(Integer eventWorkOrderId) {
		this.eventWorkOrderId = eventWorkOrderId;
	}

	public Integer getEventRequestId() {
		return this.eventRequestId;
	}

	public void setEventRequestId(Integer eventRequestId) {
		this.eventRequestId = eventRequestId;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getServiceRecord() {
		return this.serviceRecord;
	}

	public void setServiceRecord(String serviceRecord) {
		this.serviceRecord = serviceRecord;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventLevel() {
		return eventLevel;
	}

	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	public Timestamp getSolveTime() {
		return solveTime;
	}

	public void setSolveTime(Timestamp solveTime) {
		this.solveTime = solveTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getMaintAreaName() {
		return maintAreaName;
	}

	public void setMaintAreaName(String maintAreaName) {
		this.maintAreaName = maintAreaName;
	}

	public String getDeviceLocationName() {
		return deviceLocationName;
	}

	public void setDeviceLocationName(String deviceLocationName) {
		this.deviceLocationName = deviceLocationName;
	}

	public String getDeviceAssetId() {
		return deviceAssetId;
	}

	public void setDeviceAssetId(String deviceAssetId) {
		this.deviceAssetId = deviceAssetId;
	}

	public String getSourceServiceRecord() {
		return sourceServiceRecord;
	}

	public void setSourceServiceRecord(String sourceServiceRecord) {
		this.sourceServiceRecord = sourceServiceRecord;
	}

}