<%@page import="beans.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid text-white bg-success text-center">
<h1>Serach Student Data</h1>
</div>
<!-- Login 2 - Bootstrap Brain Component -->
<div class="bg-light py-3 py-md-5">
  <div class="container">
    <div class="row justify-content-md-center">
      <div class="col-12 col-md-11 col-lg-8 col-xl-7 col-xxl-6">
        <div class="bg-white p-4 p-md-5 rounded shadow-sm">
          <div class="row">
            <div class="col-12">
            </div>
          </div>
          <form action="SearchStudent" method="post">
            <div class="row gy-3 gy-md-4 overflow-hidden">
              <div class="col-12">
                <input type="text" class="form-control" name="searchText" id="searchText" placeholder="Enter Id , Name , Email" required>
              <div class="col-12">
              <br>
              <hr>
                <div class="d-grid">
                  <button class="btn btn-lg btn-primary" type="submit">Search</button>
                </div>
              </div>
            </div>
          </form>  
        </div>
      </div>
    </div>
  </div>
</div>


<%
if(request.getAttribute("students")!=null)
{
	ArrayList<Student> students=(ArrayList<Student>)request.getAttribute("students");
%>
<table class="table">
<%
for(Student s:students)
{
	%>
	<tr>
		<td><%=s.getSid()%></td>
		<td><%=s.getName()%></td>
		<td><%=s.getEmail()%></td>
		<td><%=s.getBranch()%></td>
		<td><a href="editstudent.jsp"><button class="btn btn-primary">Edit</button></a></td>
		<td><a href="deletestudent.jsp"><button class="btn btn-primary">Delete</button></a></td>
	<%
}
%>
</table>
<%
}
%>
</body>
</html>