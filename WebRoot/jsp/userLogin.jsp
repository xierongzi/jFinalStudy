<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
登录界面
<form action="/user/userLogin" method="post">  
        用户名：<input type="text" name="user.userName"/> 
        密码：<input type="password" name="user.userPassword"/>
        <input type="submit" value="登录"/>  
    </form>  
</body>
</html>