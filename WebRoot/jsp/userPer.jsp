<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人中心</title>
</head>
<body>
个人中心
<div id="changePer">
	<form action="/user/update" method="post">
	用户名<input type="text" name="user.userName"  value="${user1.userName }"/>
密码<input type="password" name="user.userPassword"  value="${user1.userPassword }"/>
等级<input type="text" name="user.level"  value="${user1.level }">
ID:<input type="text" name="user.userId"  value="${user1.userId }">
<input type="text" name="user.userSex"  value="${user1.userSex}">
<input type="submit" value="修改">
	</form>
</div>




</body>
</html>