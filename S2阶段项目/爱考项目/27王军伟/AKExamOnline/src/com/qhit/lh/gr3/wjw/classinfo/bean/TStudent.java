package com.qhit.lh.gr3.wjw.classinfo.bean;
// Generated 2018-3-8 11:27:08 by Hibernate Tools 5.2.8.Final

/**
 * @author 王军伟
 * 类说明：学生表
 * 创建时间:2018年3月8日下午5:39:13
 */
public class TStudent implements java.io.Serializable {
//编号
	private String sid;
	//姓名
	private String sname;
	//性别
	private String sex;
	//入学年份
	private String enterSchool;
	//所属班级
	private String ccode;
	//头像
	private String photo;
	private String birthday;
	private String idcard;
	private String poutlook;
	private String province;
	private String city;
	private String tel;
	private String address;
	private String ptel;
	private String prelation;
	private String hostelBuil;
	private String hostelNo;
	private String baseInfo;
	private String eduBg;
	private String remarks;

	public TStudent() {
	}

	public TStudent(String sid, String sname, String sex, String enterSchool, String ccode) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.enterSchool = enterSchool;
		this.ccode = ccode;
	}

	public TStudent(String sid, String sname, String sex, String enterSchool, String ccode, String photo,
			String birthday, String idcard, String poutlook, String province, String city, String tel, String address,
			String ptel, String prelation, String hostelBuil, String hostelNo, String baseInfo, String eduBg,
			String remarks) {
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.enterSchool = enterSchool;
		this.ccode = ccode;
		this.photo = photo;
		this.birthday = birthday;
		this.idcard = idcard;
		this.poutlook = poutlook;
		this.province = province;
		this.city = city;
		this.tel = tel;
		this.address = address;
		this.ptel = ptel;
		this.prelation = prelation;
		this.hostelBuil = hostelBuil;
		this.hostelNo = hostelNo;
		this.baseInfo = baseInfo;
		this.eduBg = eduBg;
		this.remarks = remarks;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEnterSchool() {
		return this.enterSchool;
	}

	public void setEnterSchool(String enterSchool) {
		this.enterSchool = enterSchool;
	}

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPoutlook() {
		return this.poutlook;
	}

	public void setPoutlook(String poutlook) {
		this.poutlook = poutlook;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPtel() {
		return this.ptel;
	}

	public void setPtel(String ptel) {
		this.ptel = ptel;
	}

	public String getPrelation() {
		return this.prelation;
	}

	public void setPrelation(String prelation) {
		this.prelation = prelation;
	}

	public String getHostelBuil() {
		return this.hostelBuil;
	}

	public void setHostelBuil(String hostelBuil) {
		this.hostelBuil = hostelBuil;
	}

	public String getHostelNo() {
		return this.hostelNo;
	}

	public void setHostelNo(String hostelNo) {
		this.hostelNo = hostelNo;
	}

	public String getBaseInfo() {
		return this.baseInfo;
	}

	public void setBaseInfo(String baseInfo) {
		this.baseInfo = baseInfo;
	}

	public String getEduBg() {
		return this.eduBg;
	}

	public void setEduBg(String eduBg) {
		this.eduBg = eduBg;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
