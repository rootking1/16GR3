package com.qhit.lh.gr3.wjw.sbm.user.service;

import java.util.List;

import com.qhit.lh.gr3.wjw.sbm.user.bean.User;

/**
 * @author 王军伟 
 * 业务接口 
 * 创建时间:2017年12月10日下午8:20:24
 */
public interface UserService {
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
	 * @param User
	 * @return
	 */
	User register(User user);

	/**
	 * 遍历所有的用户
	 * 
	 * @param pageBean
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
