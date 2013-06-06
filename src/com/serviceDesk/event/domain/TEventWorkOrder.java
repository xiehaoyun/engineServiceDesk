package com.serviceDesk.event.domain;

/**
 * TEventWorkOrder entity. @author MyEclipse Persistence Tools
 */

public class TEventWorkOrder implements java.io.Serializable {

	// Fields

	private Integer eventWorkOrderId;
	private Integer eventRequestId;
	private Integer creatorId;
	private String creatorName;
	private String serviceRecord;

	// Constructors

	/** default constructor */
	public TEventWorkOrder() {
	}

	/** full constructor */
	public TEventWorkOrder(Integer eventRequestId, Integer creatorId,
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

}