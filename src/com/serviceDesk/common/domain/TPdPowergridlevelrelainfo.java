package com.serviceDesk.common.domain;

/**
 * TPdPowergridlevelrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdPowergridlevelrelainfo implements java.io.Serializable {

	// Fields

	private TPdPowergridlevelrelainfoId id;
	private String FPowergridleveldesc;

	// Constructors

	/** default constructor */
	public TPdPowergridlevelrelainfo() {
	}

	/** minimal constructor */
	public TPdPowergridlevelrelainfo(TPdPowergridlevelrelainfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPdPowergridlevelrelainfo(TPdPowergridlevelrelainfoId id,
			String FPowergridleveldesc) {
		this.id = id;
		this.FPowergridleveldesc = FPowergridleveldesc;
	}

	// Property accessors

	public TPdPowergridlevelrelainfoId getId() {
		return this.id;
	}

	public void setId(TPdPowergridlevelrelainfoId id) {
		this.id = id;
	}

	public String getFPowergridleveldesc() {
		return this.FPowergridleveldesc;
	}

	public void setFPowergridleveldesc(String FPowergridleveldesc) {
		this.FPowergridleveldesc = FPowergridleveldesc;
	}

}