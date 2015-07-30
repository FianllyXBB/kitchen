<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<form action="/kitchen/user/regist.ms" method="post">
		用户名：<input type="text" name="username" value="${userVo.username }"><font color="red">*<label>&nbsp;&nbsp;${errors.usernameError }</label></font>
		<br>
		邮箱：<input type="text" name="email" value="${userVo.email }"><font color="red">*<label>&nbsp;&nbsp;${errors.emailError }</label></font><br>
	          密 码：<input type="password" name="password" value="${userVo.password }"><font color="red">*&nbsp;&nbsp;${errors.passwordError }</font><br>
		手机号码：<input type="text" name="phonenumber" value="${userVo.phonenumber }"><font color="red">*&nbsp;&nbsp;${errors.phonenumberError }</font><br>
		<input type="submit" value="注册">
	</form>
</body>
</html>