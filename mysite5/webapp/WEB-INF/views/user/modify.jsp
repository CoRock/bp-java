<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>MySite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="${pageContext.servletContext.contextPath}/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<c:import url="/WEB-INF/views/includes/header.jsp" />
		<div id="content">
			<div id="user">
				<form id="join-form" name="modifyForm" method="post" action="${pageContext.servletContext.contextPath}/user/modify">
					<input type="hidden" name="no" value="${userVo.no}">
					<label class="block-label" for="name">이름</label>
					<input id="name" name="name" type="text" value="">

					<label class="block-label" for="email">이메일</label>
					<h3>${userVo.email}</h3>
					
					<label class="block-label">패스워드</label>
					<input name="password" type="password" value="">
					
					<fieldset>
						<legend>성별</legend>
						<c:choose>
							<c:when test='${userVo.gender eq "female"}'>							
								<label>남</label> <input type="radio" name="gender" value="male">
								<label>여</label> <input type="radio" name="gender" value="female" checked="checked">
							</c:when>
							<c:otherwise>
								<label>남</label> <input type="radio" name="gender" value="male" checked="checked">
								<label>여</label> <input type="radio" name="gender" value="female">
							</c:otherwise>
						</c:choose>
					</fieldset>
					
					<input type="submit" value="수정하기">
					
				</form>
			</div>
		</div>
		<c:import url="/WEB-INF/views/includes/navigation.jsp" />
		<c:import url="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
<c:if test='${param.result == "success"}'>
	<script>
		alert( "정상적으로 수정되었습니다." );
	</script>
</c:if>
</html>