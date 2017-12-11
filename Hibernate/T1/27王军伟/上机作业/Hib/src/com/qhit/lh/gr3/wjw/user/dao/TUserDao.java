package com.qhit.lh.gr3.wjw.user.dao;

import java.util.List;

import com.qhit.lh.gr3.wjw.user.bean.TUser;

/**
 * @author 王军伟
 * 方法接口
 * 创建时间:2017年12月11日下午2:23:18
 */
public interface TUserDao {
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
