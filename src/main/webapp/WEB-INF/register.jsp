<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<div class="d-flex justify-content-around">
		<form:form action="/register" method="post" modelAttribute="newUser"
			class="col-5 mx-auto border p-5 my-5 text-dark bg-light">
			<div class="form-group">
				<label>UserName:</label>
				<form:input path="userName" class="form-control" />
				<form:errors path="userName" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Email:</label>
				<form:input path="email" class="form-control" />
				<form:errors path="email" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Password:</label>
				<form:password path="password" class="form-control" />
				<form:errors path="password" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Confirm Password:</label>
				<form:password path="confirm" class="form-control" />
				<form:errors path="confirm" class="text-danger" />
			</div>
			<input type="submit" value="Register" class="btn btn-primary" />
		</form:form>
	</div>

</body>
</html>