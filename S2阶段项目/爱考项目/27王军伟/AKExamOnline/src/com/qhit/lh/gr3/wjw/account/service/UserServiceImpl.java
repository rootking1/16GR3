package com.qhit.lh.gr3.wjw.account.service;

import com.qhit.lh.gr3.wjw.account.bean.User;
import com.qhit.lh.gr3.wjw.account.dao.UserDao;
import com.qhit.lh.gr3.wjw.account.dao.UserDaoImpl;
import com.qhit.lh.gr3.wjw.common.bean.PageBean;

/**
 * @author 王军伟 业务实例 创建时间:2018年1月7日上午1:31:16
 */
public class UserServiceImpl implements UserService {
	private UserDao userdao = new UserDaoImpl();

	@Override
	public User login(User user) {
		return userdao.login(user);
	}

	@Override
	public PageBean QueryAll(PageBean pageBean, String hql) {
		return userdao.QueryAll(pageBean, hql);
	}

}
