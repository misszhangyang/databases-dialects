<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1" />
<!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />-->

<link rel="stylesheet" href="css/dialects.css" />


<title>首页</title>
</head>

<body class="body_one">
	<div class="overall">
		<div class="head">
			<span
				style="font-size:40px;font-family:楷体;font-weight:500;padding-left:20px;padding-right:120px"><a href="index.jsp"><img src="img/icon.jpg" width="130" height="65" /></a>徽州方言数据库</span><img
				src="img/head.png" width="41" height="27" /><span>嗨，<span>${requestScope.name} </span>  欢迎来到徽州数据库门户网站  </span>
			<p>
				<a href="index.jsp" style="margin-left:50px;font-size:16px;">网站首页</a>
				<a href="overview"
					style="margin-left:50px;font-size:16px;text-decoration:none">方言概述</a>
				<a href="voicevideo"
					style="margin-left:50px;font-size:16px;text-decoration:none">语音视屏</a>
				<a href="singtalk.jsp"
					style="margin-left:50px;font-size:16px;text-decoration:none">说唱视屏</a>
				<a href="regionpoint.jsp"
					style="margin-left:50px;font-size:16px;text-decoration:none">区域特点</a>
				<a href="overview.jsp"
					style="margin-left:50px;font-size:16px;text-decoration:none">地区分布</a>
				<a href="overview.jsp"
					style="margin-left:50px;font-size:16px;text-decoration:none">给我留言</a>
			</p>
		</div>
		<img style="float:left;margin-left:180px;margin-right:50px"
			src="img/titlecenter.png">
		<div class="context-right">
			<div class="context-right-top">
				<p class="context-right-topimage">
					<img src="img/head.png" width="41" height="27" /> <img
						src="img/right-top.png" width="81" height="63" />
				</p>
				<h4>方言概念</h4>
			</div>
			<div class="context-right-centerlist">
				<ul>
					<li><a href="overview?place=shexian">歙县方言</a></li>
					<li><a href="overview?place=xiunin">休宁方言</a></li>
					<li><a href="overview?place=qimen">祁门方言</a></li>
					<li><a href="overview?place=yixian">黟县方言</a></li>
					<li><a href="overview?place=jixi">绩溪方言</a></li>
				</ul>
				<img style="padding-left:10px" src="img/right-center0.png"
					width="35" height="38" /> <img style="padding-left:20px"
					src="img/right-center1.png" width="35" height="38" /> <img
					style="padding-left:25px" src="img/right-center2.png" width="55"
					height="58" />
			</div>
			<div style="float:right;margin-top:90px">
				<img style="float:left;margin-left:180px;margin-right:50px"
					src="img/titlebuttom.png">
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/dialects.js"></script>
</html>
