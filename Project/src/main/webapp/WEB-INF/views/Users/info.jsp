<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수정 창/Users/info.jsp</title>

</head>
<body>
<section id="contect">
<form action="info.do">
	<div class="select_area">
		<h1>개인 정보 페이지</h1>
		<table>
			<tr>
				<th>ID</th>
				<td>${usersDto.userId }</td>
			</tr>
			<tr>
				<th>PassWord</th>
				<td><a href="${pageContext.request.contextPath}/Users/newPassform.do">수정하기</a></td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${usersDto.userName }</td>
			</tr>
			<tr>
				<th>연락처</th>
				<td>${usersDto.userPhone }</td>
			</tr>
			<tr>
				<th>E-mail</th>
				<td>${usersDto.email }</td>
			</tr>
			<tr>
				<th>첫번째 주소</th>
				<td>${usersDto.userAddr1 }</td>
			</tr>
			<tr>
				<th>두번째 주소</th>
				<td>${usersDto.userAddr2 }</td>
			</tr>
			<tr>
				<th>세번째 주소</th>
				<td>${usersDto.userAddr3 }</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${usersDto.regiDate }</td>
			</tr>
		</table>
		<a href="${pageContext.request.contextPath}/home.do">홈으로</a>
		<p><a href="updateform.do">개인 정보 수정하기</a></p>
		
		<%-- <p><a href="${pageContext.request.contextPath}/Users/updateform.do">개인 정보 수정하기</a></p> --%>
		
		<p><a href="${pageContext.request.contextPath}/Users/delete.do">회원 탈퇴</a></p>
	</div>
</form>
</section>
</body>
</html>





