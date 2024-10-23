<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
 
      <a href="index.jsp"><img src="image/home.png" alt="Home" style="width:70px;height:42px;"></a>
  			
      <ul class="navbar-nav">
        <li class="nav-item">
         <div class="dropdown">
  			<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">Student</button>
  			<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    		<li><a class="dropdown-item" href="addstudent.jsp">Add Student</a></li>
    		<li><a class="dropdown-item" href="searchstudents.jsp">Search Students</a></li>
  			</ul>
		</div>
        </li>
        <li class="nav-item">
          <div class="dropdown">
  			<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">Faculty</button>
  			<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    		<li><a class="dropdown-item" href="addfaculty.jsp">Add Faculty</a></li>
    		<li><a class="dropdown-item" href="#">Search Faculty</a></li>
  			</ul>
		</div>
        </li>
        <li class="nav-item">
          <div class="dropdown">
 			 <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">Attendance</button>
  				<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    			<li><a class="dropdown-item" href="#"></a></li>
    			<li><a class="dropdown-item" href="#">Another action</a></li>
    			<li><a class="dropdown-item" href="#">Something else here</a></li>
  				</ul>
		</div>
        </li>
       
      </ul>
    </div>
    <img src="image/logo.png" alt="erp image" width="100" height="50">
 
</nav>
<img src="image/image1.jpg" alt="erp-image" width="1518">
</body>
</html>