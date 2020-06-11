<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit User</h1>
        <form:form  class="text-center border border-light p-5" action="./saveUser" method="post" modelAttribute="user">
        <table>
            <form:hidden path="uid"/>
            <tr>
                <td>Name:</td>
                <td><form:input class="form-control mb-4" path="uname" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:input class="form-control mb-4" path="upassword" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input class="form-control mb-4" path="uemail" /></td>
            </tr>
            <tr>
                <td>usertype</td>
                <td><form:input class="form-control mb-4" path="utype" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input class="btn btn-info btn-block my-4" type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
    
    
</body>
</html>


