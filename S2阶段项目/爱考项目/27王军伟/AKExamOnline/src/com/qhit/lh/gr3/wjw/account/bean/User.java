package com.qhit.lh.gr3.wjw.account.bean;
// Generated 2018-3-8 17:31:36 by Hibernate Tools 5.2.9.Final

/**
 * TUser generated by hbm2java
 */
public class User implements java.io.Serializable {

	private String name;
	private String pwd;
	private int role;

	public User() {
	}

	public User(String name, String pwd, int role) {
		this.name = name;
		this.pwd = pwd;
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
