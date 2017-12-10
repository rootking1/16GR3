package com.qhit.lh.gr3.wjw.sbm.user.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.wjw.sbm.user.bean.User;
import com.qhit.lh.gr3.wjw.sbm.user.service.Impl.UserServiceImpl;

/**
 * @author 王军伟 
 * action 
 * 创建时间:2017年12月9日下午4:35:59
 */
public class ActionUser extends ActionSupport {
	private User user;
	private List<User> users;
	private File file;
	private String fileFileName;
	private String fileContentType;
	private String filepath;

	/**
	 * 登录认证
	 * 
	 * @return
	 */
	public String login() {
		//user对象实例化认证
		user = new UserServiceImpl().Login(user.getUserName(), user.getUserPassword());
		//user对象是否为空
		if (user != null) {
			return "loginSuccess";
		} else {
			//错误提示
			super.addFieldError("error", "用户名或密码错误,请重新输入");
			return null;
		}
	}

	/**
	 * 文件上传
	 * 
	 * @return
	 * @throws Exception
	 */
	public String uploadPhoto() throws Exception {
		//获取路径
		filepath = ServletActionContext.getServletContext().getRealPath("/upload");
		//输入流
		InputStream is = new FileInputStream(file);
		//文件路径实例化
		File files = new File(filepath, fileFileName);
		//判定是否存在
		if (!files.exists()) {
			//创建文件路径
			files.mkdirs();
		}
		//输出流
		OutputStream os = new FileOutputStream(files);
		//buffer字节码
		byte[] buffer = new byte[8 * 1024];
		//复制是否结束
		while (-1 != is.read(buffer, 0, buffer.length)) {
			//复制
			os.write(buffer);
		}
		//关闭
		os.close();
		is.close();
		return "uploadPfotoSuccess";
	}

	/**
	 * 用户资料添加
	 * 
	 * @return
	 */
	public String add() {
		//头像文件路径添加
		user.setPic(filepath);
		//添加新用户
		user = new UserServiceImpl().register(user);
		//判断用户是否添加成功
		if(user.getUserId() != 0) {
			return "addSuccess";
		}else {
			//弹出错误提示
			super.addFieldError("error", "服务器异常，请重试");
			return null;
		}
	}
	public String getAll() {
		//查询所有用户
		users = new UserServiceImpl().GetAllUser();
		return "listUser";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
