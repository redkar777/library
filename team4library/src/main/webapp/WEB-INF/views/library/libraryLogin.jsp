<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>LIBRARY LOGIN</title>
</head>
<body>
	<h1>도서관 관리자 로그인</h1>
	<form action="/library/libraryLogin" method="post">
		<div>아이디 : <input type="text" name="library_id"/></div>
		<div>비밀번호 : <input type="password" name="library_pw"/></div>
		<div>
			<input type="submit" value="로그인"/>
			<input type="button" value="도서관 등록" onclick="location.href='/library/libraryAdd'"/>
		</div>
		
	</form>
</body>
</html>