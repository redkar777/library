<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>LIBRARY ADD</title>
</head>
<body>
	<h1>도서관 관리자 등록</h1>
	
	<form action="<c:url value="/library/libraryAdd" />" method="post">
	아이디  : 	<input type="text" name="library_id"/>
	비밀번호  : <input type="password" name="library_pw"/>
		<select name="local_no">
			<option>::선택::</option>
			<c:forEach var="local" items="${local}">
				<option value="${local.local_no}">${local.local_name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="완료"/>
		<input type="reset" value="초기화"/>
	</form>
	
</body>
</html>