package com.qhit.lh.gr3.wjw.account.service;

import com.qhit.lh.gr3.wjw.account.bean.User;
import com.qhit.lh.gr3.wjw.common.bean.PageBean;

/**
 * @author 王军伟 业务接口 创建时间:2018年1月7日上午1:30:42
 */
public interface UserService {
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
	PageBean QueryAll(PageBean pageBean , String hql);
}
