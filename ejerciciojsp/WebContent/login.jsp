<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
out.print(request.getParameter("name"));
%>

	<form action="">
		<ul>
			<li><label>Nombre</label><input type="text" name="name">
			</li>
			<li><label>Clave</label><input type="text" name="pass">
			</li>
			<li><input type="submit" value="ingresar" name=""></li>
		</ul>


	</form>

</body>
</html>