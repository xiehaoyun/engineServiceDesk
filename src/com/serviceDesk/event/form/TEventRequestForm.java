package com.serviceDesk.event.form;

import java.sql.Timestamp;

/**
 * TEventRequest entity. @author MyEclipse Persistence Tools
 */

public class TEventRequestForm implements java.io.Serializable {

	// Fields

	private Integer eventRequestId;
	private String eventSource;
	private String eventType;
	private String eventLevel;
	private String eventStatus;
	private String description;
	private Timestamp requestTime;
	private Timestamp dealDeadline;
	private Timestamp solveTime;
	private String satisfaction;
	private Integer eventSolutionId;
	private String customerName;
	private String customerPhone;
	private Integer managerId;
	private String managerName;
	private String orgName;
	private String departName;
	private String buildName;
	private String monitorAreaName;
	private String maintAreaName;
	private String deviceLocationName;
	private String deviceAssetId;
	private Integer creatorId;
	private String creatorName;
	private String serviceRecord;
	
	private String keywords;

	// Constructors

	/** default constructor */
	public TEventRequestForm() {
	}
	// Property accessors

	public Integer getEventRequestId() {
		return this.eventRequestId;
	}

	public void setEventRequestId(Integer eventRequestId) {
		this.eventRequestId = eventRequestId;
	}

	public String getEventSource() {
		return this.eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventLevel() {
		return this.eventLevel;
	}

	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}

	public String getEventStatus() {
		return this.eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Timestamp requestTime) {
		this.requestTime = requestTime;
	}

	public Timestamp getDealDeadline() {
		return this.dealDeadline;
	}

	public void setDealDeadline(Timestamp dealDeadline) {
		this.dealDeadline = dealDeadline;
	}

	public Timestamp getSolveTime() {
		return this.solveTime;
	}

	public void setSolveTime(Timestamp solveTime) {
		this.solveTime = solveTime;
	}

	public String getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(String satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Integer getEventSolutionId() {
		return this.eventSolutionId;
	}

	public void setEventSolutionId(Integer eventSolutionId) {
		this.eventSolutionId = eventSolutionId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getBuildName() {
		return this.buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getMonitorAreaName() {
		return this.monitorAreaName;
	}

	public void setMonitorAreaName(String monitorAreaName) {
		this.monitorAreaName = monitorAreaName;
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
		return this.deviceAssetId;
	}

	public void setDeviceAssetId(String deviceAssetId) {
		this.deviceAssetId = deviceAssetId;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}