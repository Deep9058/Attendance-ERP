<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="row justify-content-md-center">
      <div class="col-12 col-md-11 col-lg-8 col-xl-7 col-xxl-6">
        <div class="bg-white p-4 p-md-5 rounded shadow-sm">
          <div class="row">
          <div class="col-12">
              <div class="mb-5">
                <h3 class="text-center">Add Student Details</h3>
              </div>
            </div>
 			<form action="Edit" method="post">
            <div class="row gy-3 gy-md-4 overflow-hidden">
              
              <div class="col-12">
                <label for="email" class="form-label">Student Email <span class="text-danger">*</span></label>
                <input type="email" class="form-control" name="email" id="email" value="" readonly>
              </div>
              <div class="col-12">
                <label for="password" class="form-label">Student Password <span class="text-danger">*</span></label>
                <input type="password" class="form-control" name="password" id="password" value="" required>
              </div>
              <div class="col-12">
                <label for="text" class="form-label">Student Name <span class="text-danger">*</span></label>
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
</body>
</html>