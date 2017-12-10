package com.qhit.lh.gr3.wjw.sbm.user.dao;

import java.util.List;

import com.qhit.lh.gr3.wjw.sbm.user.bean.User;

/**
 * @author 王军伟
 *  dao接口 
 *  创建时间:2017年12月10日下午8:18:23
 */
public interface UserDao {
	/**
	 * 登陆认证
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	User Login(String userName, String userPassword);

	/**
	 * 注册认证
	 * 
	 * @param user
	 * @return
	 */
	User register(User user);

	/**
	 * 遍历所有的用户
	 * 
	 * @param List<User>
	 * @return
	 */
	List<User> GetAllUser();

	/**
	 * 查询用户
	 * 
	 * @param pageBean
	 * @param userName
	 * @return
	 */
	User QueryUser(String userName);
}
