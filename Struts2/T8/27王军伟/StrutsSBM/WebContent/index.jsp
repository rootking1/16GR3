<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登录 - 超市账单管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body class="blue-style">
	<div id="login">
		<div class="icon"></div>
		<div class="login-box">
			<s:fielderror name="error" />
			<s:form method="post" action="login_user">
				<table>
					<tr>
						<th>用户名：</th>
						<td><s:textfield name="user.userName" class="input-text" />
						</td>
					</tr>
					<tr>
						<th>密 码：</th>
						<td><s:password name="user.userPassword" class="input-text" />
						</td>
					</tr>
					<tr>
						<td>
							<div class="buttons">
								<s:submit value="登录系统" class="input-button" />
								<s:reset value="重　　填" class="input-button" />
							</div>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
</body>
</html>