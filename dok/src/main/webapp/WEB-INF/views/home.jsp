<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<form action="dologin" method="get">
		Id: <input type="text" name="id" /> <br /> 
		Password: <input type="password" name="password" /> <br /> 
		<input type="submit" value="login" />
	</form>
</body>
</html>