package com.qhit.smb.User.dao;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年11月13日 下午2:26:14 
* 类说明 
*/
import com.qhit.smb.User.bean.User;
import com.qhit.smb.common.bean.PageBean;

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
	 * @param pageBean
	 * @return
	 */
	PageBean GetAllUser(PageBean pageBean);

	/**
	 * 查询用户
	 * 
	 * @param pageBean
	 * @param userName
	 * @return
	 */
	PageBean QueryUser(PageBean pageBean, String userName);
}
