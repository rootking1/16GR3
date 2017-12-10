package com.qhit.lh.gr3.wjw.sbm.user.service.Impl;

import java.util.List;

import com.qhit.lh.gr3.wjw.sbm.user.bean.User;
import com.qhit.lh.gr3.wjw.sbm.user.dao.Impl.UserDaoImpl;
import com.qhit.lh.gr3.wjw.sbm.user.service.UserService;

/**
 * @author 王军伟 
 * service业务 
 * 创建时间:2017年12月10日下午8:19:44
 */
public class UserServiceImpl implements UserService {

	/**
	 * 登陆认证
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	@Override
	public User Login(String userName, String userPassword) {
		return new UserDaoImpl().Login(userName, userPassword);
	}

	/**
	 * 注册认证
	 * 
	 * @param User
	 * @return
	 */
	@Override
	public User register(User user) {
		return new UserDaoImpl().register(user);
	}

	/**
	 * 遍历所有的用户
	 * 
	 * @param pageBean
	 * @return
	 */
	@Override
	public List<User> GetAllUser() {
		return new UserDaoImpl().GetAllUser();
	}

	/**
	 * 查询用户
	 * 
	 * @param pageBean
	 * @param userName
	 * @return
	 */
	@Override
	public User QueryUser(String userName) {
		return new UserDaoImpl().QueryUser(userName);
	}

}
