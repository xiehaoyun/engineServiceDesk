package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Origvalue entity. @author MyEclipse Persistence Tools
 */

public class Origvalue implements java.io.Serializable {

	// Fields

	private BigDecimal FOrigvalueid;
	private String FMeterparam;
	private String FMetername;
	private String FOrigvalue;
	private Timestamp FCollecttime;
	private Timestamp FReceivetime;
	private Timestamp FCollectdate;

	// Constructors

	/** default constructor */
	public Origvalue() {
	}

	/** full constructor */
	public Origvalue(String FMeterparam, String FMetername, String FOrigvalue,
			Timestamp FCollecttime, Timestamp FReceivetime,
			Timestamp FCollectdate) {
		this.FMeterparam = FMeterparam;
		this.FMetername = FMetername;
		this.FOrigvalue = FOrigvalue;
		this.FCollecttime = FCollecttime;
		this.FReceivetime = FReceivetime;
		this.FCollectdate = FCollectdate;
	}

	// Property accessors

	public BigDecimal getFOrigvalueid() {
		return this.FOrigvalueid;
	}

	public void setFOrigvalueid(BigDecimal FOrigvalueid) {
		this.FOrigvalueid = FOrigvalueid;
	}

	public String getFMeterparam() {
		return this.FMeterparam;
	}

	public void setFMeterparam(String FMeterparam) {
		this.FMeterparam = FMeterparam;
	}

	public String getFMetername() {
		return this.FMetername;
	}

	public void setFMetername(String FMetername) {
		this.FMetername = FMetername;
	}

	public String getFOrigvalue() {
		return this.FOrigvalue;
	}

	public void setFOrigvalue(String FOrigvalue) {
		this.FOrigvalue = FOrigvalue;
	}

	public Timestamp getFCollecttime() {
		return this.FCollecttime;
	}

	public void setFCollecttime(Timestamp FCollecttime) {
		this.FCollecttime = FCollecttime;
	}

	public Timestamp getFReceivetime() {
		return this.FReceivetime;
	}

	public void setFReceivetime(Timestamp FReceivetime) {
		this.FReceivetime = FReceivetime;
	}

	public Timestamp getFCollectdate() {
		return this.FCollectdate;
	}

	public void setFCollectdate(Timestamp FCollectdate) {
		this.FCollectdate = FCollectdate;
	}

}