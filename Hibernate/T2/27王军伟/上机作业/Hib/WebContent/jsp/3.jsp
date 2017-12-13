<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加界面</title>
</head>
<body>
	<s:form action="add_user" method="post">
		<table align="center" style="padding: 10%">
			<tr>
				<th>用户名</th>
				<td><s:textfield name="tuser.name" /></td>
			</tr>
			<tr>
				<th>用户密码</th>
				<td><s:textfield name="tuser.password" /></td>
			</tr>
			<tr>
				<th>用户年龄</th>
				<td><s:textfield name="tuser.tinfo.age" /></td>
			</tr>
			<tr>
				<th>用户性别</th>
				<td><s:textfield name="tuser.tinfo.sex" /></td>
			</tr>
			<tr>
				<th>用户地址</th>
				<td><s:textfield name="tuser.address" /></td>
			</tr>
			<tr>
				<th colspan="2"><s:submit value="提交" /></th>
			</tr>
		</table>
	</s:form>
</body>
</html>