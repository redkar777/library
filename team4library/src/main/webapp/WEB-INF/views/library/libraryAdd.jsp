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
	<h1>������ ������ ���</h1>
	
	<form action="<c:url value="/library/libraryAdd" />" method="post">
	���̵�  : 	<input type="text" name="library_id"/>
	��й�ȣ  : <input type="password" name="library_pw"/>
		<select name="local_no">
			<option>::����::</option>
			<c:forEach var="local" items="${local}">
				<option value="${local.local_no}">${local.local_name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="�Ϸ�"/>
		<input type="reset" value="�ʱ�ȭ"/>
	</form>
	
</body>
</html>