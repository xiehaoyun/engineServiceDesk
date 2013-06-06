package com.serviceDesk.common.domain;

/**
 * Bonus entity. @author MyEclipse Persistence Tools
 */

public class Bonus implements java.io.Serializable {

	// Fields

	private BonusId id;

	// Constructors

	/** default constructor */
	public Bonus() {
	}

	/** full constructor */
	public Bonus(BonusId id) {
		this.id = id;
	}

	// Property accessors

	public BonusId getId() {
		return this.id;
	}

	public void setId(BonusId id) {
		this.id = id;
	}

}