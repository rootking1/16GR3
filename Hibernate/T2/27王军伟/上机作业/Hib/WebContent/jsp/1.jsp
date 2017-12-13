<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
</head>
<body>
<a href="jsp/3.jsp">添加</a>
	<table align="center">
		<tr>
			<th>用户id</th>
			<th>用户名</th>
			<th>用户密码</th>
			<th>年龄</th>
			<th>性别</th>
			<th>用户地址</th>
			<th>操作</th>
		</tr>
		<s:iterator value="tusers" var="tuser">
			<tr>
				<td>${tuser.id}</td>
				<td>${tuser.name}</td>
				<td>${tuser.password}</td>
				<td>${tuser.tinfo.age}</td>
				<td>${tuser.tinfo.sex}</td>
				<td>${tuser.address}</td>
				<td><a href="get_user?tuser.id=${tuser.id}">修改</a><a href="del_user?tuser.id=${tuser.id}">删除</a> </td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>