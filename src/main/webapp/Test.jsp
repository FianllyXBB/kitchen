<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	这是一个测试的JSP
	<table>
		<tr><th>数字1</th><th>数字2</th></tr>
		<c:forEach begin="1" end="10" varStatus="status">
			<tr>
				<td>${status.index }</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>