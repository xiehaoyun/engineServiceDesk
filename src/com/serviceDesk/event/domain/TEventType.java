package com.serviceDesk.event.domain;


/**
 * TEventType entity. @author MyEclipse Persistence Tools
 */

public class TEventType implements java.io.Serializable {

	// Fields

	private Integer eventTypeId;
	private String typeName;
	private String description;

	// Constructors

	/** default constructor */
	public TEventType() {
	}

	/** full constructor */
	public TEventType(String typeName, String description) {
		this.typeName = typeName;
		this.description = description;
	}

	// Property accessors

	public Integer getEventTypeId() {
		return this.eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}