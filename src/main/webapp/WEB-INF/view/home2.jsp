<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>



<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<!--  data table files working -->
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.4/css/jquery.dataTables.min.css">
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>
 
 	
	
  
<script>
    $(document).ready(function () {
        $('#dtBasicExample').DataTable();
    });
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management Screen</title>
</head>

<body>

 <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm">User ID
      </th>
      <th class="th-sm">User Name
      </th>
      <th class="th-sm">Email
      </th>
      <th class="th-sm">Password
      </th>
      <th class="th-sm">User type
      </th>
      <th class="th-sm">Actions
      </th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="user" items="${listUsers}">
                <tr>
 
                    <td>${user.uid}</td>
                    <td>${user.uname}</td>
                     <td>${user.uemail}</td>
                    <td>${user.upassword}</td>
                    <td>${user.utype}</td>
                    <td><a href="./editUser?id=${user.uid}"><i class="fa fa-edit"></i></a>
                        <a href="./deleteUser?id=${user.uid}"><i class="fa fa-remove"></i></a></td>

                </tr>
            </c:forEach>
  </tbody>
  <tfoot>
    <tr>
       <th>User ID
      </th>
      <th>User Name
      </th>
      <th>Email
      </th>
      <th>Password
      </th>
      <th>User type
      </th>
      <th>Actions
      </th>
      </tr>
  </tfoot>
</table>
  
   
</body>

</html>