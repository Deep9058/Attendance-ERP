<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Faculty Member</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
      <ul class="navbar-nav">
        <li class="nav-item">
         <div class="dropdown">
  			<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">Student</button>
  			<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    		<li><a class="dropdown-item" href="addstudent.jsp">Add Student</a></li>
    		<li><a class="dropdown-item" href="#">Search</a></li>
  			</ul>
		</div>
        </li>
        <li class="nav-item">
          <div class="dropdown">
  			<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">Faculty</button>
  			<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    		<li><a class="dropdown-item" href="addfaculty.jsp">Add Faculty</a></li>
    		<li><a class="dropdown-item" href="#">Search</a></li>
    		<li><a class="dropdown-item" href="#">Edit</a></li>
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
    <img src="image/logo.png" alt="erp image" width="100z" height="50">
 
</nav>

<div><h1 class="text-danger bg-primary text-center">Add Faculty details</h1></div>

<div class="bg-light py-3 py-md-5">

 
  

 <div class="container">
    <div class="row justify-content-md-center">
      <div class="col-12 col-md-11 col-lg-8 col-xl-7 col-xxl-6">
        <div class="bg-white p-4 p-md-5 rounded shadow-sm">
          <div class="row">
          <div class="col-12">
              <div class="mb-5">`
                <h3 class="text-center">Add Faculty Details</h3>
              </div>
            </div>
 			<form action="AddFaculty" method="post">
            <div class="row gy-3 gy-md-4 overflow-hidden">
              
              <div class="col-12">
                <label for="email" class="form-label">Faculty Email <span class="text-danger">*</span></label>
                <input type="email" class="form-control" name="email" id="email" value="" required>
              </div>
              <div class="col-12">
                <label for="password" class="form-label">Faculty Password <span class="text-danger">*</span></label>
                <input type="password" class="form-control" name="password" id="password" value="" required>
              </div>
              <div class="col-12">
                <label for="text" class="form-label">Faculty Name <span class="text-danger">*</span></label>
                <input type="text" class="form-control" name="name" id="name" value="" required>
              </div>
              <div class="col-12">
              <select class="form-select" aria-label="Default select example" name="type">
				<option value="cs" >CSE</option>
  				<option value="it" >IT</option>
  				<option value="ece">ECE</option>
  				<option value="me">ME</option>
			</select>
              </div>
               <div class="col-12">
                <div class="d-grid">
                  <button class="btn btn-lg btn-primary" type="submit">Save Details</button>
                </div>
              </div>
             </div>
          
 </form>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>

</body>
</html>