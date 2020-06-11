<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>



<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<!-- DATA TABLE SCRIPTES -->
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.4/css/jquery.dataTables.min.css">
	<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>

	
  


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
      
      <th class="th-sm">User type
      </th>
      
    </tr>
  </thead>
  <tbody>
     <c:forEach var="user" items="${listUsers}">
                <tr>
 
                    <td>${user.uid}</td>
                    <td>${user.uname}</td>
                     <td>${user.uemail}</td>
                    
                    <td>${user.utype}</td>
                    
 
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
      <th>User type
      </th>
          </tr>
  </tfoot>
</table>
  
   
</body>

</html>
<script>
    $(document).ready(function () {
        $('#dtBasicExample').DataTable();
    });
</script>
