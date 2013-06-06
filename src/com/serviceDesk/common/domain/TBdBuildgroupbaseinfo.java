package com.serviceDesk.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TBdBuildgroupbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildgroupbaseinfo implements java.io.Serializable {

	// Fields

	private String FBuildgroupid;
	private String FBuildgroupname;
	private String FGroupaliasname;
	private String FGroupdesc;
	private Set TBdBuildgrouprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TBdBuildgroupbaseinfo() {
	}

	/** minimal constructor */
	public TBdBuildgroupbaseinfo(String FBuildgroupname, String FGroupaliasname) {
		this.FBuildgroupname = FBuildgroupname;
		this.FGroupaliasname = FGroupaliasname;
	}

	/** full constructor */
	public TBdBuildgroupbaseinfo(String FBuildgroupname,
			String FGroupaliasname, String FGroupdesc,
			Set TBdBuildgrouprelainfos) {
		this.FBuildgroupname = FBuildgroupname;
		this.FGroupaliasname = FGroupaliasname;
		this.FGroupdesc = FGroupdesc;
		this.TBdBuildgrouprelainfos = TBdBuildgrouprelainfos;
	}

	// Property accessors

	public String getFBuildgroupid() {
		return this.FBuildgroupid;
	}

	public void setFBuildgroupid(String FBuildgroupid) {
		this.FBuildgroupid = FBuildgroupid;
	}

	public String getFBuildgroupname() {
		return this.FBuildgroupname;
	}

	public void setFBuildgroupname(String FBuildgroupname) {
		this.FBuildgroupname = FBuildgroupname;
	}

	public String getFGroupaliasname() {
		return this.FGroupaliasname;
	}

	public void setFGroupaliasname(String FGroupaliasname) {
		this.FGroupaliasname = FGroupaliasname;
	}

	public String getFGroupdesc() {
		return this.FGroupdesc;
	}

	public void setFGroupdesc(String FGroupdesc) {
		this.FGroupdesc = FGroupdesc;
	}

	public Set getTBdBuildgrouprelainfos() {
		return this.TBdBuildgrouprelainfos;
	}

	public void setTBdBuildgrouprelainfos(Set TBdBuildgrouprelainfos) {
		this.TBdBuildgrouprelainfos = TBdBuildgrouprelainfos;
	}

}