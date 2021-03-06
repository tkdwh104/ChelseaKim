<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	
<ul>
	<c:choose>
		<c:when test="${not empty sessionScope.usersDto.userId }">
			<c:if test="${sessionScope.usersDto.verify eq 0}">
				<li><a href="${pageContext.request.contextPath }/master/master_index.do">관리자</a></li>
				<li><a href="${pageContext.request.contextPath}/home.do">홈으로</a></li>		
				<strong><a href="${pageContext.request.contextPath }/Users/info.do">${usersDto.userId}</a>님 환영합니다.</strong>
				<li><a href="${pageContext.request.contextPath }/Users/logout.do">로그아웃</a></li>
			</c:if>
		</c:when>
		<c:otherwise>
			<li><a href="${pageContext.request.contextPath }/Users/login_form.do">로그인</a></li>
			<li>
				<a href="${pageContext.request.contextPath }/Users/signup_form.do">회원가입</a>
			</li>
		</c:otherwise>
	</c:choose>
</ul>