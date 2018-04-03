package com.qhit.lh.gr3.wjw.account.dao;

import com.qhit.lh.gr3.wjw.account.bean.User;
import com.qhit.lh.gr3.wjw.common.bean.PageBean;

/**
 * @author 王军伟 方法接口 创建时间:2018年1月3日下午9:04:05
 */
public interface UserDao {
	/*
	 * 登陆验证
	 * 
	 * @param user
	 * 
	 * @return
	 */
	User login(User user);

	/*
	 * 查询所有
	 * 
	 * @return
	 */
	PageBean QueryAll(PageBean pageBean, String hql);

}
