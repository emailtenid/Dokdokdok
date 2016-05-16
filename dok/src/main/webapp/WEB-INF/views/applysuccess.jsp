<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	ID:
	<c:out value="${id}"></c:out>
	</br> BOOK NAME:
	<c:out value="${book_name}"></c:out>
	</br> APPLY TEXT:
	<c:out value="${apply_text}"></c:out>

</body>
</html>