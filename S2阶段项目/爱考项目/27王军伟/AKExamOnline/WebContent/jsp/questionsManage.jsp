<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>题库管理</title>
<style type="text/css">
.group {
	text-align: center;
	width: 200px;
	height: 60px;
	margin: 10px 10px;
	float: left;
	border: solid 1px black;
	padding: 5px;
}
</style>
</head>

<body>
	<!-- 
		1，theme='simple' 不使用主题，水平排列 
		2，s:if判断记录当前查询条件
	-->
	<s:form action="/question_getCourseInfo" method="post" theme="simple">
		<s:select name="major" list="{'SCME','SCCE'}"></s:select>
		<s:select name="stage" list="{'G1','G2','G3'}"></s:select>
		<s:submit value="查询"></s:submit>
	</s:form>
	
	<s:iterator value="cs" var="course">
		<div align="center" class="group">
			${course.csName }&nbsp;&nbsp;${course.stage }
			<br />
			<a href="developing.jsp" target="manFrame">
				机试题:
				<s:property value="#course.machineTests.size()"/>
			</a>
			<br>
			<a href="question_getWrittenList?course.csId=${course.csId }&course.csName=${course.csName}" target="manFrame">
				笔试题:<s:property value="#course.writtenTests.size()"/>
			</a>
		</div>
	</s:iterator>
</body>
</html>
