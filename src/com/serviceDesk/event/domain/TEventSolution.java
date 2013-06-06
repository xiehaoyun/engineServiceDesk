package com.serviceDesk.event.domain;

import java.sql.Timestamp;

/**
 * TEventSolution entity. @author MyEclipse Persistence Tools
 */

public class TEventSolution implements java.io.Serializable {

	// Fields

	private Integer eventSolutionId;
	private Integer eventRequestId;
	private String eventType;
	private String description;
	private String solution;
	private Integer thumbsUp;
	private Integer thumbsDown;
	private Timestamp createTime;
	private Integer creatorId;
	private String creatorName;

	// Constructors

	/** default constructor */
	public TEventSolution() {
	}

	/** full constructor */
	public TEventSolution(String eventType, String description,
			String solution, Integer thumbsUp, Integer thumbsDown,
			Timestamp createTime, Integer creatorId, String creatorName) {
		this.eventType = eventType;
		this.description = description;
		this.solution = solution;
		this.thumbsUp = thumbsUp;
		this.thumbsDown = thumbsDown;
		this.createTime = createTime;
		this.creatorId = creatorId;
		this.creatorName = creatorName;
	}

	// Property accessors

	public Integer getEventSolutionId() {
		return this.eventSolutionId;
	}

	public void setEventSolutionId(Integer eventSolutionId) {
		this.eventSolutionId = eventSolutionId;
	}

	public Integer getEventRequestId() {
		return eventRequestId;
	}

	public void setEventRequestId(Integer eventRequestId) {
		this.eventRequestId = eventRequestId;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Integer getThumbsUp() {
		return this.thumbsUp;
	}

	public void setThumbsUp(Integer thumbsUp) {
		this.thumbsUp = thumbsUp;
	}

	public Integer getThumbsDown() {
		return this.thumbsDown;
	}

	public void setThumbsDown(Integer thumbsDown) {
		this.thumbsDown = thumbsDown;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
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

}