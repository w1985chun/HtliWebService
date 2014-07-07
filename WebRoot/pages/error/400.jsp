<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>400错误</title>
		<meta
			content="width=device-width, initial-scale=1.0,
			minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"
			name="viewport">
		<!-- basic styles -->
	</head>

	<body class="login-layout">
		<div class="ui-content">
			<div style="text-align:center">
			<p>对不起,服务器无法理解此请求！</p>
			<img alt="" src="res/images/robot.png">
			</div>
		</div>
	</body>
</html>