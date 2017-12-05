<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登录 - 超市账单管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<c:if test="${moder != null}">
	<script>
		alert("用户名或密码错误，请稍后重试")
	</script>
</c:if>
</head>
<body class="blue-style">
	<div id="login">
		<div class="icon"></div>
		<div class="login-box">
			<form id="loginer" method="post" action="./user?cmd=longi">
				<dl>
					<dt>用户名：</dt>
					<dd>
						<input id="userName" type="text" name="userName"
							class="input-text" />
					</dd>
					<dt>密 码：</dt>
					<dd>
						<input id="userPassword" type="password" name="userPassword"
							class="input-text" />
					</dd>
				</dl>
				<div class="buttons">
					<input type="button" value="登录系统" class="input-button"
						onclick="ongin()" /> <input type="reset" value="重　　填"
						class="input-button" />
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function ongin() {
			var userName = document.getElementById("userName").value;
			var userPassword = document.getElementById("userPassword").value;
			if (userName != null && userName != "" && userPassword != null
					&& userPassword != "") {
				document.getElementById("loginer").submit();
			} else {
				alert("用户名或密码不能为空");
			}
		}
	</script>
</body>
</html>