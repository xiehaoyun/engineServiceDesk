package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TAlAlertcondition entity. @author MyEclipse Persistence Tools
 */

public class TAlAlertcondition implements java.io.Serializable {

	// Fields

	private BigDecimal FAlertconditionid;
	private Double FAlertthreshold;
	private String FAlertrule;
	private Double FAlertthresholdinterval;
	private String FAlertthresholdintevalunit;
	private Set TEvAlerttypeconrelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TAlAlertcondition() {
	}

	/** full constructor */
	public TAlAlertcondition(Double FAlertthreshold, String FAlertrule,
			Double FAlertthresholdinterval, String FAlertthresholdintevalunit,
			Set TEvAlerttypeconrelainfos) {
		this.FAlertthreshold = FAlertthreshold;
		this.FAlertrule = FAlertrule;
		this.FAlertthresholdinterval = FAlertthresholdinterval;
		this.FAlertthresholdintevalunit = FAlertthresholdintevalunit;
		this.TEvAlerttypeconrelainfos = TEvAlerttypeconrelainfos;
	}

	// Property accessors

	public BigDecimal getFAlertconditionid() {
		return this.FAlertconditionid;
	}

	public void setFAlertconditionid(BigDecimal FAlertconditionid) {
		this.FAlertconditionid = FAlertconditionid;
	}

	public Double getFAlertthreshold() {
		return this.FAlertthreshold;
	}

	public void setFAlertthreshold(Double FAlertthreshold) {
		this.FAlertthreshold = FAlertthreshold;
	}

	public String getFAlertrule() {
		return this.FAlertrule;
	}

	public void setFAlertrule(String FAlertrule) {
		this.FAlertrule = FAlertrule;
	}

	public Double getFAlertthresholdinterval() {
		return this.FAlertthresholdinterval;
	}

	public void setFAlertthresholdinterval(Double FAlertthresholdinterval) {
		this.FAlertthresholdinterval = FAlertthresholdinterval;
	}

	public String getFAlertthresholdintevalunit() {
		return this.FAlertthresholdintevalunit;
	}

	public void setFAlertthresholdintevalunit(String FAlertthresholdintevalunit) {
		this.FAlertthresholdintevalunit = FAlertthresholdintevalunit;
	}

	public Set getTEvAlerttypeconrelainfos() {
		return this.TEvAlerttypeconrelainfos;
	}

	public void setTEvAlerttypeconrelainfos(Set TEvAlerttypeconrelainfos) {
		this.TEvAlerttypeconrelainfos = TEvAlerttypeconrelainfos;
	}

}