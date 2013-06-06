package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TBdBuildaddfile entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildaddfile implements java.io.Serializable {

	// Fields

	private String FFileid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private String FFilefunctype;
	private String FFileformattype;
	private String FFiledesc;
	private BigDecimal FFilesize;
	private Timestamp FFiledate;
	private String FFilepath;

	// Constructors

	/** default constructor */
	public TBdBuildaddfile() {
	}

	/** minimal constructor */
	public TBdBuildaddfile(TBdBuildbaseinfo TBdBuildbaseinfo,
			String FFilefunctype, String FFileformattype, BigDecimal FFilesize,
			Timestamp FFiledate, String FFilepath) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FFilefunctype = FFilefunctype;
		this.FFileformattype = FFileformattype;
		this.FFilesize = FFilesize;
		this.FFiledate = FFiledate;
		this.FFilepath = FFilepath;
	}

	/** full constructor */
	public TBdBuildaddfile(TBdBuildbaseinfo TBdBuildbaseinfo,
			String FFilefunctype, String FFileformattype, String FFiledesc,
			BigDecimal FFilesize, Timestamp FFiledate, String FFilepath) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FFilefunctype = FFilefunctype;
		this.FFileformattype = FFileformattype;
		this.FFiledesc = FFiledesc;
		this.FFilesize = FFilesize;
		this.FFiledate = FFiledate;
		this.FFilepath = FFilepath;
	}

	// Property accessors

	public String getFFileid() {
		return this.FFileid;
	}

	public void setFFileid(String FFileid) {
		this.FFileid = FFileid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public String getFFilefunctype() {
		return this.FFilefunctype;
	}

	public void setFFilefunctype(String FFilefunctype) {
		this.FFilefunctype = FFilefunctype;
	}

	public String getFFileformattype() {
		return this.FFileformattype;
	}

	public void setFFileformattype(String FFileformattype) {
		this.FFileformattype = FFileformattype;
	}

	public String getFFiledesc() {
		return this.FFiledesc;
	}

	public void setFFiledesc(String FFiledesc) {
		this.FFiledesc = FFiledesc;
	}

	public BigDecimal getFFilesize() {
		return this.FFilesize;
	}

	public void setFFilesize(BigDecimal FFilesize) {
		this.FFilesize = FFilesize;
	}

	public Timestamp getFFiledate() {
		return this.FFiledate;
	}

	public void setFFiledate(Timestamp FFiledate) {
		this.FFiledate = FFiledate;
	}

	public String getFFilepath() {
		return this.FFilepath;
	}

	public void setFFilepath(String FFilepath) {
		this.FFilepath = FFilepath;
	}

}