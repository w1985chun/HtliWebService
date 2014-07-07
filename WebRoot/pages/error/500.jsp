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
		<title>500错误</title>
		<meta
			content="width=device-width, initial-scale=1.0,
			minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"
			name="viewport">
		<!-- basic styles -->

		<script src="res/js/jquery-2.1.0.min.js"></script>
		<script src="res/js/jquery.mobile-1.4.2.min.js"></script>
		<link rel="stylesheet" type="text/css"
			href="res/css/jquery.mobile-1.4.2.min.css">
		<link href="res/css/my.custom.page.css" rel="stylesheet"
			type="text/css">
		<link rel="stylesheet" type="text/css"
			href="res/css/my-custom-jqm-theme.css">
	</head>

	<body class="login-layout">
		<div class="ui-content">
			<div style="text-align:center">
			<p>服务器不支持实现此请求所需的功能。请检查URL 中的错误，如果问题依然存在，请与 Web服务器的管理员联系。</p>
			<img alt="" src="res/images/robot.png">
			</div>
		</div>
	</body>
</html>