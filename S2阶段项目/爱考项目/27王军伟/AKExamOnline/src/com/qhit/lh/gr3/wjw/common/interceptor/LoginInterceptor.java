package com.qhit.lh.gr3.wjw.common.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qhit.lh.gr3.wjw.account.bean.User;

/**
 * @author 王军伟 类说明：登陆校验 创建时间:2018年1月9日下午11:43:52
 */
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("登录校验拦截器执行");
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if (user == null) {
			// 未登录
			return "login_view";
		}
		return arg0.invoke();
	}

}
