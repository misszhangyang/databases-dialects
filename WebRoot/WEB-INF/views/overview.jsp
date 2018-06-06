<%@page import="org.springframework.web.context.request.RequestScope"%>
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
				style="font-size:40px;font-family:楷体;font-weight:500;padding-left:30px;padding-right:120px">
				<a href="index.jsp"><img src="img/icon.jpg" width="130" height="65" /></a>徽州方言数据库</span><img
				src="img/head.png" width="41" height="27" /><a>重要公告</a> <span>|</span>
			<a>与我联系</a> <span>|</span> <a>加入收藏</a>
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
		<div class="context-left">
			<div class="context-menu">
				<span>地域分布情况:</span>
				<ul>
					<li><span class="first" onclick="f('sub_menu_1')">歙 县</span>
						<ul id="sub_menu_1">
							<li><a href="voicevideo?region=shexian&spread=phonology" class="secound">声韵调</a></li>
							<li><a href="voicevideo?region=shexian&spread=vocabulary" class="secound">词汇</a></li>
							<li><a href="voicevideo?region=shexian&spread=clause" class="secound">短句</a></li>
							<li><a href="voicevideo?region=shexian&spread=essay" class="secound">短文</a></li>
						</ul></li>
					<li><span class="first" onclick="f('sub_menu_2')">休 宁</span>
						<ul id="sub_menu_2">
							<li><a href="voicevideo?region=xiunin&spread=phonology" class="secound">声韵调</a></li>
							<li><a href="voicevideo?region=xiunin&spread=vocabulary" class="secound">词汇</a></li>
							<li><a href="voicevideo?region=xiunin&spread=clause" class="secound">短句</a></li>
							<li><a href="voicevideo?region=xiunin&spread=essay" class="secound">短文</a></li>
						</ul></li>
					<li><span class="first" onclick="f('sub_menu_3')">祁 门</span>
						<ul id="sub_menu_3">
							<li><a class="secound">声韵调</a></li>
							<li><a class="secound">词汇</a></li>
							<li><a class="secound">短句</a></li>
							<li><a class="secound">短文</a></li>
						</ul></li>
					<li><span class="first" onclick="f('sub_menu_4')">黟 县</span>
						<ul id="sub_menu_4">
							<li><a class="secound">声韵调</a></li>
							<li><a class="secound">词汇</a></li>
							<li><a class="secound">短句</a></li>
							<li><a class="secound">短文</a></li>
						</ul></li>
					<li><span class="first" onclick="f('sub_menu_5')">绩 溪</span>
						<ul id="sub_menu_5">
							<li><a class="secound">声韵调</a></li>
							<li><a class="secound">词汇</a></li>
							<li><a class="secound">短句</a></li>
							<li><a class="secound">短文</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="context-centertop">
			<a class="shouye" href="index.jsp">首页</a>>><a href="overview">方言概述</a>>><a>${requestScope.place}</a>
		</div>
		<div class="context-center">
			 <p
				style="padding-left:100px;padding-right:100px;font-size:20px;font-family:'楷体';text-indent:2em;align:left">${requestScope.overview}</p>
				
		</div>
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
			<div>
				<div id="demo">
					<div id="context-right-playback">
						<a href="regionpoint.jsp"><img class="pic" src="img/regionpoint.png" /><br>
							<a class="underpic" href="regionpoint.jsp">区域特点</a><br></a>
							 <a href="voicevideo"><img class="pic"src="img/voicevideo.png" /><br><a href="voicevideo" class="underpic">语音视屏</a><br></a>
						<a href="singtalk.jsp"><img class="pic" src="img/singtalk.png" /><br>
							<a href="singtalk.jsp" class="underpic">说唱视频</a><br></a> <a href="index.jsp"><img class="pic" src="img/index.png" /><br>
							<a href="index.jsp" class="underpic">网站首页</a><br></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/dialects.js"></script>
</html>
