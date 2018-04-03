package com.qhit.lh.gr3.wjw.common.action;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.wjw.account.bean.User;
import com.qhit.lh.gr3.wjw.account.service.UserService;
import com.qhit.lh.gr3.wjw.account.service.UserServiceImpl;
import com.qhit.lh.gr3.wjw.classinfo.bean.TCourse;
import com.qhit.lh.gr3.wjw.question.service.ProblemService;
import com.qhit.lh.gr3.wjw.question.service.ProblemServiceImpl;

/**
 * @author 王军伟 类说明：登陆action 创建时间:2018年3月8日下午12:48:26
 */
public class LoginAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	private ProblemService problemService = new ProblemServiceImpl();
	private User user;
	private List<TCourse> cs;

	/*
	 * 登陆认证
	 */
	public String login() {
		User login = userService.login(user);
		cs = problemService.queryall();
		if (login != null) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("user", user);
			// session.setAttribute("cs", cs);
			return "loginSuccess";
		} else {
			super.addActionError("登录失败！用户名密码错误!");
			return "loginError";
		}
	}

	/*
	 * @return 退出
	 */
	public String logout() {
		// 获取session对象，并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<TCourse> getCs() {
		return cs;
	}

	public void setCs(List<TCourse> cs) {
		this.cs = cs;
	}

}
