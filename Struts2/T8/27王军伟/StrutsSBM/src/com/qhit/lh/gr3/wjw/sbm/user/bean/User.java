package com.qhit.lh.gr3.wjw.sbm.user.bean;

public class User {
	// 用户id
	private int userId;
	// 用户姓名
	private String userName;
	// 用户密码
	private String userPassword;
	// 用户性别
	private String userSex;
	// 用户年龄
	private int userAge;
	// 用户手机号
	private int telephone;
	// 用户家庭住址
	private String address;
	// 用户头像
	private String pic;
	// 用户身份
	private int type;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public User(int userId, String userName, String userPassword, String userSex, int userAge, int telephone,
			String address, String pic, int type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.telephone = telephone;
		this.address = address;
		this.pic = pic;
		this.type = type;
	}

	public User(String userName, String userPassword, String userSex, int userAge, int telephone, String address,
			String pic, int type) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.telephone = telephone;
		this.address = address;
		this.pic = pic;
		this.type = type;
	}

	public User() {
		super();
	}
}
