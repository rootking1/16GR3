package com.qhit.lh.gr3.wjw.user.service;

import java.util.List;

import com.qhit.lh.gr3.wjw.user.bean.TUser;

/**
 * @author 王军伟
 *  业务接口 
 *  创建时间:2017年12月11日下午2:22:48
 */
public interface TUserService {
	/**
	 * 添加用户
	 * 
	 * @param tuser
	 */
	void add(TUser tuser);

	/**
	 * 删除用户
	 * 
	 * @param tuser
	 */
	void del(TUser tuser);

	/**
	 * 修改用户
	 * 
	 * @param tuser
	 */
	void update(TUser tuser);

	/**
	 * 查询所有用户
	 * 
	 * @param from
	 * @return
	 */
	List<TUser> getall(String from);
	
	/**
	 * 查询用户
	 * 
	 * @param tuser
	 * @return
	 */
	TUser get(TUser tuser);

}
