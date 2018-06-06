<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<%
	request.setCharacterEncoding("utf-8"); //解决中文乱码问题
%>
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
				style="font-size:40px;font-family:楷体;font-weight:500;padding-left:20px;padding-right:120px"><a
				href="index.jsp"><img src="img/icon.jpg" width="130" height="65" /></a>徽州方言数据库</span><img
				src="img/head.png" width="41" height="27" /><span>
		</div>
		<div
			style="margin-top:30px;margin-left:100px;background-image: url(img/login.png);height:390px;width:1170px;">
			<div style="float:right;padding-right:200px;padding-top:40px">
				<form id="register" action="login" method="post">
					<p>
						<label>姓名 </label> <input type="text" id="name" name="name"
							tabindex="1">
					</p>
					<p>
						<label>密码 </label> <input type="text" id="password"
							name="password" tabindex="2">
					</p>
					<p id="buttons">
						<input style="width:102px;height:23px;" id="submit" type="submit"
							name="submit" tabindex="4" value="submit"> <input
							style="width:102px;height:23px;" id="reset" type="submit"
							name="reset" tabindex="5" value="register">
					</p>
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/dialects.js"></script>
</html>
