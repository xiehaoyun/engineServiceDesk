package com.serviceDesk.common.form;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoOrgbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoOrgbaseinfoForm implements java.io.Serializable {

	// Fields

	private String FOrgcode;
	private String FOrgname;
	private String FOrgtype;
	private Timestamp FRegdate;
	private Timestamp FRegvaliddate;
	private Double FRegcapital;
	private String FCorporate;
	private String FCorporatetel;
	private String FEnergyleader;
	private String FEnergyleadertel;
	private String FOrgaddr1;
	private String FOrgaddr2;
	private String FOrgaddr3;
	private String FOrgaddr4;
	private String FOrgaddr5;
	private String FOrgaddr6;
	private Integer FOrgpeoplenum;
	private Integer FOrgeffectnum;
	private String FOrgtel;
	private String FOrgfaxnum;
	private String FOrgemail;
	private Double FOrgbuildarea;
	private Double FHeatarea;
	private Double FColdarea;
	private Integer FOrgcarnum;
	private Integer FFormcarnum;
	private Integer FOfficialcarnum;
	private Integer FOthercarnum;
	private Integer FGasolinecarnum;
	private Integer FDieselcarnum;
	private String FOrgdesc;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Timestamp FMonitordate;
	private Timestamp FAcceptdate;
	private Set TPdDepartmaintarelainfos = new HashSet(0);
	private Set TMoOrgengyconsrenoinfos = new HashSet(0);
	private Set TMoDepartbaseinfos = new HashSet(0);
	private Set TEvManagerorgrelainfos = new HashSet(0);
	private Set TBdOrgbuildrelainfos = new HashSet(0);

	//对应的服务和客户经理信息 
	private Timestamp FStartTime;
	private Timestamp FEndTime;
	private Integer FState;
	private String FDescription;
	private Integer FStaffId;
	private String FStaffName;
	private String FStaffTel;
	
	// Constructors

	public String getFStaffTel() {
		return FStaffTel;
	}

	public void setFStaffTel(String fStaffTel) {
		FStaffTel = fStaffTel;
	}

	public Timestamp getFStartTime() {
		return FStartTime;
	}

	public void setFStartTime(Timestamp fStartTime) {
		FStartTime = fStartTime;
	}

	public Timestamp getFEndTime() {
		return FEndTime;
	}

	public void setFEndTime(Timestamp fEndTime) {
		FEndTime = fEndTime;
	}

	public Integer getFState() {
		return FState;
	}

	public void setFState(Integer fState) {
		FState = fState;
	}

	public String getFDescription() {
		return FDescription;
	}

	public void setFDescription(String fDescription) {
		FDescription = fDescription;
	}

	public Integer getFStaffId() {
		return FStaffId;
	}

	public void setFStaffId(Integer fStaffId) {
		FStaffId = fStaffId;
	}

	public String getFStaffName() {
		return FStaffName;
	}

	public void setFStaffName(String fStaffName) {
		FStaffName = fStaffName;
	}

	/** default constructor */
	public TMoOrgbaseinfoForm() {
	}

	/** minimal constructor */
	public TMoOrgbaseinfoForm(String FOrgname) {
		this.FOrgname = FOrgname;
	}

	// Property accessors

	public String getFOrgcode() {
		return this.FOrgcode;
	}

	public void setFOrgcode(String FOrgcode) {
		this.FOrgcode = FOrgcode;
	}

	public String getFOrgname() {
		return this.FOrgname;
	}

	public void setFOrgname(String FOrgname) {
		this.FOrgname = FOrgname;
	}

	public String getFOrgtype() {
		return this.FOrgtype;
	}

	public void setFOrgtype(String FOrgtype) {
		this.FOrgtype = FOrgtype;
	}

	public Timestamp getFRegdate() {
		return this.FRegdate;
	}

	public void setFRegdate(Timestamp FRegdate) {
		this.FRegdate = FRegdate;
	}

	public Timestamp getFRegvaliddate() {
		return this.FRegvaliddate;
	}

	public void setFRegvaliddate(Timestamp FRegvaliddate) {
		this.FRegvaliddate = FRegvaliddate;
	}

	public Double getFRegcapital() {
		return this.FRegcapital;
	}

	public void setFRegcapital(Double FRegcapital) {
		this.FRegcapital = FRegcapital;
	}

	public String getFCorporate() {
		return this.FCorporate;
	}

	public void setFCorporate(String FCorporate) {
		this.FCorporate = FCorporate;
	}

	public String getFCorporatetel() {
		return this.FCorporatetel;
	}

	public void setFCorporatetel(String FCorporatetel) {
		this.FCorporatetel = FCorporatetel;
	}

	public String getFEnergyleader() {
		return this.FEnergyleader;
	}

	public void setFEnergyleader(String FEnergyleader) {
		this.FEnergyleader = FEnergyleader;
	}

	public String getFEnergyleadertel() {
		return this.FEnergyleadertel;
	}

	public void setFEnergyleadertel(String FEnergyleadertel) {
		this.FEnergyleadertel = FEnergyleadertel;
	}

	public String getFOrgaddr1() {
		return this.FOrgaddr1;
	}

	public void setFOrgaddr1(String FOrgaddr1) {
		this.FOrgaddr1 = FOrgaddr1;
	}

	public String getFOrgaddr2() {
		return this.FOrgaddr2;
	}

	public void setFOrgaddr2(String FOrgaddr2) {
		this.FOrgaddr2 = FOrgaddr2;
	}

	public String getFOrgaddr3() {
		return this.FOrgaddr3;
	}

	public void setFOrgaddr3(String FOrgaddr3) {
		this.FOrgaddr3 = FOrgaddr3;
	}

	public String getFOrgaddr4() {
		return this.FOrgaddr4;
	}

	public void setFOrgaddr4(String FOrgaddr4) {
		this.FOrgaddr4 = FOrgaddr4;
	}

	public String getFOrgaddr5() {
		return this.FOrgaddr5;
	}

	public void setFOrgaddr5(String FOrgaddr5) {
		this.FOrgaddr5 = FOrgaddr5;
	}

	public String getFOrgaddr6() {
		return this.FOrgaddr6;
	}

	public void setFOrgaddr6(String FOrgaddr6) {
		this.FOrgaddr6 = FOrgaddr6;
	}

	public Integer getFOrgpeoplenum() {
		return this.FOrgpeoplenum;
	}

	public void setFOrgpeoplenum(Integer FOrgpeoplenum) {
		this.FOrgpeoplenum = FOrgpeoplenum;
	}

	public Integer getFOrgeffectnum() {
		return this.FOrgeffectnum;
	}

	public void setFOrgeffectnum(Integer FOrgeffectnum) {
		this.FOrgeffectnum = FOrgeffectnum;
	}

	public String getFOrgtel() {
		return this.FOrgtel;
	}

	public void setFOrgtel(String FOrgtel) {
		this.FOrgtel = FOrgtel;
	}

	public String getFOrgfaxnum() {
		return this.FOrgfaxnum;
	}

	public void setFOrgfaxnum(String FOrgfaxnum) {
		this.FOrgfaxnum = FOrgfaxnum;
	}

	public String getFOrgemail() {
		return this.FOrgemail;
	}

	public void setFOrgemail(String FOrgemail) {
		this.FOrgemail = FOrgemail;
	}

	public Double getFOrgbuildarea() {
		return this.FOrgbuildarea;
	}

	public void setFOrgbuildarea(Double FOrgbuildarea) {
		this.FOrgbuildarea = FOrgbuildarea;
	}

	public Double getFHeatarea() {
		return this.FHeatarea;
	}

	public void setFHeatarea(Double FHeatarea) {
		this.FHeatarea = FHeatarea;
	}

	public Double getFColdarea() {
		return this.FColdarea;
	}

	public void setFColdarea(Double FColdarea) {
		this.FColdarea = FColdarea;
	}

	public Integer getFOrgcarnum() {
		return this.FOrgcarnum;
	}

	public void setFOrgcarnum(Integer FOrgcarnum) {
		this.FOrgcarnum = FOrgcarnum;
	}

	public Integer getFFormcarnum() {
		return this.FFormcarnum;
	}

	public void setFFormcarnum(Integer FFormcarnum) {
		this.FFormcarnum = FFormcarnum;
	}

	public Integer getFOfficialcarnum() {
		return this.FOfficialcarnum;
	}

	public void setFOfficialcarnum(Integer FOfficialcarnum) {
		this.FOfficialcarnum = FOfficialcarnum;
	}

	public Integer getFOthercarnum() {
		return this.FOthercarnum;
	}

	public void setFOthercarnum(Integer FOthercarnum) {
		this.FOthercarnum = FOthercarnum;
	}

	public Integer getFGasolinecarnum() {
		return this.FGasolinecarnum;
	}

	public void setFGasolinecarnum(Integer FGasolinecarnum) {
		this.FGasolinecarnum = FGasolinecarnum;
	}

	public Integer getFDieselcarnum() {
		return this.FDieselcarnum;
	}

	public void setFDieselcarnum(Integer FDieselcarnum) {
		this.FDieselcarnum = FDieselcarnum;
	}

	public String getFOrgdesc() {
		return this.FOrgdesc;
	}

	public void setFOrgdesc(String FOrgdesc) {
		this.FOrgdesc = FOrgdesc;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public String getFCreateuser() {
		return this.FCreateuser;
	}

	public void setFCreateuser(String FCreateuser) {
		this.FCreateuser = FCreateuser;
	}

	public Timestamp getFMonitordate() {
		return this.FMonitordate;
	}

	public void setFMonitordate(Timestamp FMonitordate) {
		this.FMonitordate = FMonitordate;
	}

	public Timestamp getFAcceptdate() {
		return this.FAcceptdate;
	}

	public void setFAcceptdate(Timestamp FAcceptdate) {
		this.FAcceptdate = FAcceptdate;
	}

	public Set getTPdDepartmaintarelainfos() {
		return this.TPdDepartmaintarelainfos;
	}

	public void setTPdDepartmaintarelainfos(Set TPdDepartmaintarelainfos) {
		this.TPdDepartmaintarelainfos = TPdDepartmaintarelainfos;
	}

	public Set getTMoOrgengyconsrenoinfos() {
		return this.TMoOrgengyconsrenoinfos;
	}

	public void setTMoOrgengyconsrenoinfos(Set TMoOrgengyconsrenoinfos) {
		this.TMoOrgengyconsrenoinfos = TMoOrgengyconsrenoinfos;
	}

	public Set getTMoDepartbaseinfos() {
		return this.TMoDepartbaseinfos;
	}

	public void setTMoDepartbaseinfos(Set TMoDepartbaseinfos) {
		this.TMoDepartbaseinfos = TMoDepartbaseinfos;
	}

	public Set getTEvManagerorgrelainfos() {
		return this.TEvManagerorgrelainfos;
	}

	public void setTEvManagerorgrelainfos(Set TEvManagerorgrelainfos) {
		this.TEvManagerorgrelainfos = TEvManagerorgrelainfos;
	}

	public Set getTBdOrgbuildrelainfos() {
		return this.TBdOrgbuildrelainfos;
	}

	public void setTBdOrgbuildrelainfos(Set TBdOrgbuildrelainfos) {
		this.TBdOrgbuildrelainfos = TBdOrgbuildrelainfos;
	}

}