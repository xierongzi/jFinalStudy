<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="/js/jquery-1.4.4.min.js" type="text/javascript" ></script>
<title>全部用户-删除</title>

</head>
<body>
所有的user,这里是为了实现"删"

<div id="allUsersDiv">
    <table>
    <tr>
    <th>userId</th><th>userName</th><th>操作</th>
    </tr>
	<c:forEach var="u" items="${allUsersPage}">
	<tr>
	<td><c:out value='${ u.userId}'></c:out></td><td><c:out value='${ u.userName}'></c:out></td>
	
	<td><a href="/user/delete/${u.userId }">删除</a></td>
	</tr>
	
	
	</c:forEach>
</table>


</div>
</body>
</html>
