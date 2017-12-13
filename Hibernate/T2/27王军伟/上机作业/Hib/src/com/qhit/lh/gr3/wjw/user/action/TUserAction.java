package com.qhit.lh.gr3.wjw.user.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.wjw.user.bean.TUser;
import com.qhit.lh.gr3.wjw.user.service.impl.TUserIerviceImpl;

/**
 * @author 王军伟 
 * action
 * 创建时间:2017年12月11日下午4:21:09
 */
public class TUserAction extends ActionSupport {
	private TUser tuser;
	private List<TUser> tusers;

	/**
	 * 添加用户
	 * 
	 * @return
	 */
	public String add() {
		new TUserIerviceImpl().add(tuser);
		return SUCCESS;
	}

	/**
	 * 删除用户
	 * 
	 * @return
	 */
	public String del() {
		new TUserIerviceImpl().del(tuser);
		return SUCCESS;
	}

	/**
	 * 更新用户
	 * 
	 * @return
	 */
	public String update() {
		new TUserIerviceImpl().update(tuser);
		return SUCCESS;
	}

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public String getall() {
		tusers = new TUserIerviceImpl().getall("from TUser");
		return "getallsuccess";
	}
	
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public String get() {
		tuser = new TUserIerviceImpl().get(tuser);
		return "getsuccess";
	}

	public List<TUser> getTusers() {
		return tusers;
	}

	public TUser getTuser() {
		return tuser;
	}

	public void setTuser(TUser tuser) {
		this.tuser = tuser;
	}

	public void setTusers(List<TUser> tusers) {
		this.tusers = tusers;
	}
}
