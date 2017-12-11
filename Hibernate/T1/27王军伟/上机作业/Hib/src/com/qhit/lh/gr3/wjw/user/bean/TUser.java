package com.qhit.lh.gr3.wjw.user.bean;
/**
 * @author 王军伟
 * 用户bean
 * 创建时间:2017年12月11日下午11:19:38
 */
public class TUser {

	private Integer id;
	private String name;
	private String password;
	private String address;

	public TUser() {
	}

	public TUser(String name, String password, String address) {
		this.name = name;
		this.password = password;
		this.address = address;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
