package com.qhit.lh.gr3.wjw.sbm.user.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.gr3.wjw.sbm.user.bean.User;
import com.qhit.lh.gr3.wjw.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.wjw.sbm.util.DBManager;

/**
 * @author 作者 E-mail:
 * @version 创建时间：2017年11月13日 下午2:26:39 类说明
 */
public class UserDaoImpl implements UserDao {
	Connection con = null;
	PreparedStatement ps = null;

	/**
	 * 登陆认证
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	@Override
	public User Login(String userName, String userPassword) {
		User user = null;
		con = DBManager.getConnection();
		String sql = "select * from tb_user where userName = ? and userPassword = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User(rs.getInt("userId"), userName, userPassword, rs.getString("userSex"),
						rs.getInt("userAge"), rs.getInt("telephone"), rs.getString("address"), rs.getString("pic"),
						rs.getInt("type"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, ps);
		}
		return user;
	}

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public User register(User user) {
		con = DBManager.getConnection();
		String sql = "insert tb_user values(?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ps.setString(3, user.getUserSex());
			ps.setInt(4, user.getUserAge());
			ps.setInt(5, user.getTelephone());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getPic());
			ps.setInt(8, user.getType());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setUserId(rs.getInt("userId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, ps);
		}
		return user;
	}

	/**
	 * 查询所有用户
	 * 
	 * @param List<User>
	 * @return
	 */
	@Override
	public List<User> GetAllUser() {
		List<User> users = new ArrayList<>();
		con = DBManager.getConnection();
		String sql = "select * from tb_user";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				users.add(new User(rs.getInt("userId"), rs.getString("userName"), rs.getString("userPassword"),
						rs.getString("userSex"), rs.getInt("userAge"), rs.getInt("telephone"), rs.getString("address"),
						rs.getString("pic"), rs.getInt("type")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, ps);
		}
		return users;
	}

	/**
	 * 查询条件用户
	 * 
	 * @param User
	 * @return
	 */
	@Override
	public User QueryUser(String userName) {
		con = DBManager.getConnection();
		User user = null;
		String sql = "select * from tb_user where userName = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt("userId"), userName, rs.getString("userPassword"), rs.getString("userSex"),
						rs.getInt("userAge"), rs.getInt("telephone"), rs.getString("address"), rs.getString("pic"),
						rs.getInt("type"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, ps);
		}
		return user;
	}
}
