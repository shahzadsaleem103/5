<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<!-- Default form login -->
<form:form class="text-center border border-light p-5" action="./login" modelAttribute="user">

    <p class="h4 mb-4">Sign in</p>

    <!-- Email -->
    <form:input path="uname"  class="form-control mb-4" placeholder="User Name"/>

    <!-- Password -->
    <form:input path="upassword"  type="password"  class="form-control mb-4" placeholder="Password" />

    <div class="d-flex justify-content-around">
        
        
    </div>

    <!-- Sign in button -->
    <button class="btn btn-info btn-block my-4" type="submit">Sign in</button>

    <!-- Register -->
    <p>Not a member?
        <a href="./newUser">Register</a>
    </p>

    <!-- Social login -->
    
</form:form>
<!-- Default form login -->
</body>
</html>