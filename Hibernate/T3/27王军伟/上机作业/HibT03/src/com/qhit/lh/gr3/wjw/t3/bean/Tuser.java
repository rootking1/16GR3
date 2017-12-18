package com.qhit.lh.gr3.wjw.t3.bean;

/**
 * Tuser entity. @author MyEclipse Persistence Tools
 */

public class Tuser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;
	private Integer did;
	private Tdept tdept;

	// Constructors

	/** default constructor */
	public Tuser() {
	}

	/** full constructor */
	public Tuser(String uname, String upwd, Integer did) {
		this.uname = uname;
		this.upwd = upwd;
		this.did = did;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Tdept getTdept() {
		return tdept;
	}

	public void setTdept(Tdept tdept) {
		this.tdept = tdept;
	}

	@Override
	public String toString() {
		return "Tuser [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", did=" + did + ", tdept=" + tdept + "]";
	}

}