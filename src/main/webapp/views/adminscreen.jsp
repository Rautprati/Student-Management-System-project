<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminScreen</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <style type="text/css">
 .enroll{
 background-image: url("images/c.jpg");
 background-size: cover;
 background-repeat: no-repeat;
 }
 .heading{
 font-family:cursive;
 text-align: center;
 margin-bottom: 20px;
 }
 form{
 width:400px
 }
 .view{
 background-image: url("images/t.jpeg");
 background-size: cover;
 background-repeat: no-repeat;
 }
 table thead tbody{
 border:1px solid black;
 border-radius: 50px;
 
 }
 
 .tabledesign{
 box-shadow:0px 0px 10px 10px grey;
 width : 600px
 }
</style>
</head>
<body>

<div class="card">
<nav class="d-flex justify-content-between p-2 border border-primary" >
<img src="images/cjclogo.png" width="100px" height="50px">
<div class="pt-2">
<a href="enroll">
 <button class="btn btn-outline-primary">Enroll Student</button>
</a>
<a href="view">
 <button class="btn btn-outline-primary">View Student</button>
</a>
<a href="/">
 <button class="btn btn-outline-primary">Logout</button>
</a>
</div>
</nav>

<section class="view" style="height:530px" id="view">
 <h1 class="text-center">Student Details..!</h1>
 <div class="text-center w-100">
 <form action="search" class="w-100">
 <select class="select form-control-sm border border-primary"
name="studentBatchNumber">
 <option value="#" selected>Select Batch Number</option>
 <option value="FDJ-160">FDJ-160</option>
 <option value="REG-160">REG-160</option>
 <option value="FDJ-161">FDJ-161</option>
 <option value="REG-161">REG-162</option>
 <option value="FDJ-162">FDJ-162</option>
 <option value="REG-162">REG-162</option>
 <option value="FDJ-163">FDJ-163</option>
 <option value="REG-163">REG-163</option>
 <option value="FDJ-164">FDJ-164</option>
 <option value="REG-164">REG-164</option>
 <option value="FDJ-165">FDJ-165</option>
 <option value="REG-165">REG-165</option>
 </select>
 <button class="btn btn-outline-primary mb-1">Search</button> 
 </form>
 <marquee>
 <h1 style="color: red;">
 ${message }
 </h1>
 </marquee>
 </div>
 <div class="tabledesign">
 <table class="table table-hover" style="font-size:
small">
 <thead>
 <tr>
 <th>Student ID</th>
 <th>Student Full Name</th>
 <th>Student Address</th>
 <th>Student Email Id</th>
 <th>Student Gender</th>
 <th>Student Batch Number</th>
 <th>Student Batch Mode</th>
 <th>Student Course</th>
 <th>Student Fees Paid</th>
 <th>Actions</th>
 </tr>
 </thead>
 <tbody>
 <c:forEach items="${data}" var="s">
 <tr>
 <td>${s.studentId}</td>
 <td>${s.studentFullName}</td>
 <td>${s.studentAddress}</td>
 <td>${s.studentEmailId}</td>
 <td>${s.studentGender}</td>
 <td>${s.studentBatchNumber}</td>
 <td>${s.studentBatchMode}</td>
 <td>${s.studentCourse}</td>
 <td>${s.studentFeesPaid}</td>
 <td><div class="btn-group btn-group-sm" role="group"
aria-label="...">
 <a href="fees?studentId=${s.studentId}"><button class="btn btn-outline-success">PayFees</button></a>
<a href="shiftbatch?studentId=${s.studentId}"><button class="btn btn-outline-primary">ShiftBatch</button></a>
<a href="delete?studentId=${s.studentId}" ><button class="btn btn-outline-danger">Remove</button></a>
 
 </div>
 </td>
 
 </tr>
 </c:forEach>
 
 </tbody>
 
 </table>
 </div>
</section>
</div>

</body>
</html>