<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 이후/view/Users/login</title>
</head>
<body>
	<strong>${dto.userId} 이 로그인을 하셨습니다.</strong>
	<p><a href="${pageContext.request.contextPath}/home.do">홈으로</a></p>
</body>
</html>