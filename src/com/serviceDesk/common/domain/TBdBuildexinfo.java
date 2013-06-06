package com.serviceDesk.common.domain;

import java.math.BigDecimal;

/**
 * TBdBuildexinfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildexinfo implements java.io.Serializable {

	// Fields

	private String FBuildid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private BigDecimal FWorkernum;
	private BigDecimal FCustomernum;
	private BigDecimal FOpenhours;
	private String FServicelevel;
	private BigDecimal FHotelliverate;
	private BigDecimal FHotelbednum;
	private BigDecimal FVisitornum;
	private BigDecimal FStudentnum;
	private String FHospitalstandard;
	private String FHospitaltype;
	private BigDecimal FPatientnum;
	private BigDecimal FHospitalbednum;
	private BigDecimal FSpectatornum;
	private String FGroupfunc;
	private String FExtendfunc;
	private String FElectriprice;
	private String FWaterprice;
	private String FGasprice;
	private String FHeatprice;
	private String FOtherprice;

	// Constructors

	/** default constructor */
	public TBdBuildexinfo() {
	}

	/** minimal constructor */
	public TBdBuildexinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	/** full constructor */
	public TBdBuildexinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			BigDecimal FWorkernum, BigDecimal FCustomernum,
			BigDecimal FOpenhours, String FServicelevel,
			BigDecimal FHotelliverate, BigDecimal FHotelbednum,
			BigDecimal FVisitornum, BigDecimal FStudentnum,
			String FHospitalstandard, String FHospitaltype,
			BigDecimal FPatientnum, BigDecimal FHospitalbednum,
			BigDecimal FSpectatornum, String FGroupfunc, String FExtendfunc,
			String FElectriprice, String FWaterprice, String FGasprice,
			String FHeatprice, String FOtherprice) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FWorkernum = FWorkernum;
		this.FCustomernum = FCustomernum;
		this.FOpenhours = FOpenhours;
		this.FServicelevel = FServicelevel;
		this.FHotelliverate = FHotelliverate;
		this.FHotelbednum = FHotelbednum;
		this.FVisitornum = FVisitornum;
		this.FStudentnum = FStudentnum;
		this.FHospitalstandard = FHospitalstandard;
		this.FHospitaltype = FHospitaltype;
		this.FPatientnum = FPatientnum;
		this.FHospitalbednum = FHospitalbednum;
		this.FSpectatornum = FSpectatornum;
		this.FGroupfunc = FGroupfunc;
		this.FExtendfunc = FExtendfunc;
		this.FElectriprice = FElectriprice;
		this.FWaterprice = FWaterprice;
		this.FGasprice = FGasprice;
		this.FHeatprice = FHeatprice;
		this.FOtherprice = FOtherprice;
	}

	// Property accessors

	public String getFBuildid() {
		return this.FBuildid;
	}

	public void setFBuildid(String FBuildid) {
		this.FBuildid = FBuildid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public BigDecimal getFWorkernum() {
		return this.FWorkernum;
	}

	public void setFWorkernum(BigDecimal FWorkernum) {
		this.FWorkernum = FWorkernum;
	}

	public BigDecimal getFCustomernum() {
		return this.FCustomernum;
	}

	public void setFCustomernum(BigDecimal FCustomernum) {
		this.FCustomernum = FCustomernum;
	}

	public BigDecimal getFOpenhours() {
		return this.FOpenhours;
	}

	public void setFOpenhours(BigDecimal FOpenhours) {
		this.FOpenhours = FOpenhours;
	}

	public String getFServicelevel() {
		return this.FServicelevel;
	}

	public void setFServicelevel(String FServicelevel) {
		this.FServicelevel = FServicelevel;
	}

	public BigDecimal getFHotelliverate() {
		return this.FHotelliverate;
	}

	public void setFHotelliverate(BigDecimal FHotelliverate) {
		this.FHotelliverate = FHotelliverate;
	}

	public BigDecimal getFHotelbednum() {
		return this.FHotelbednum;
	}

	public void setFHotelbednum(BigDecimal FHotelbednum) {
		this.FHotelbednum = FHotelbednum;
	}

	public BigDecimal getFVisitornum() {
		return this.FVisitornum;
	}

	public void setFVisitornum(BigDecimal FVisitornum) {
		this.FVisitornum = FVisitornum;
	}

	public BigDecimal getFStudentnum() {
		return this.FStudentnum;
	}

	public void setFStudentnum(BigDecimal FStudentnum) {
		this.FStudentnum = FStudentnum;
	}

	public String getFHospitalstandard() {
		return this.FHospitalstandard;
	}

	public void setFHospitalstandard(String FHospitalstandard) {
		this.FHospitalstandard = FHospitalstandard;
	}

	public String getFHospitaltype() {
		return this.FHospitaltype;
	}

	public void setFHospitaltype(String FHospitaltype) {
		this.FHospitaltype = FHospitaltype;
	}

	public BigDecimal getFPatientnum() {
		return this.FPatientnum;
	}

	public void setFPatientnum(BigDecimal FPatientnum) {
		this.FPatientnum = FPatientnum;
	}

	public BigDecimal getFHospitalbednum() {
		return this.FHospitalbednum;
	}

	public void setFHospitalbednum(BigDecimal FHospitalbednum) {
		this.FHospitalbednum = FHospitalbednum;
	}

	public BigDecimal getFSpectatornum() {
		return this.FSpectatornum;
	}

	public void setFSpectatornum(BigDecimal FSpectatornum) {
		this.FSpectatornum = FSpectatornum;
	}

	public String getFGroupfunc() {
		return this.FGroupfunc;
	}

	public void setFGroupfunc(String FGroupfunc) {
		this.FGroupfunc = FGroupfunc;
	}

	public String getFExtendfunc() {
		return this.FExtendfunc;
	}

	public void setFExtendfunc(String FExtendfunc) {
		this.FExtendfunc = FExtendfunc;
	}

	public String getFElectriprice() {
		return this.FElectriprice;
	}

	public void setFElectriprice(String FElectriprice) {
		this.FElectriprice = FElectriprice;
	}

	public String getFWaterprice() {
		return this.FWaterprice;
	}

	public void setFWaterprice(String FWaterprice) {
		this.FWaterprice = FWaterprice;
	}

	public String getFGasprice() {
		return this.FGasprice;
	}

	public void setFGasprice(String FGasprice) {
		this.FGasprice = FGasprice;
	}

	public String getFHeatprice() {
		return this.FHeatprice;
	}

	public void setFHeatprice(String FHeatprice) {
		this.FHeatprice = FHeatprice;
	}

	public String getFOtherprice() {
		return this.FOtherprice;
	}

	public void setFOtherprice(String FOtherprice) {
		this.FOtherprice = FOtherprice;
	}

}