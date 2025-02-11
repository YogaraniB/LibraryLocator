 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>
</head>
<body>

<div class="topnav">
 <p align="center"><b>Welcome to Library Book Locator</b></p> 
  <a href="registerBook">Register Book</a>
  <a href="addBookRack">Add BookRack</a>
  <a href="getAllBooks">Show All Books</a>
  <div class="search-container">
     <form action="searchbyName">
     <input type="text" placeholder="Search by BookName.." name="bookName">
     <button type="submit"><i class="fa fa-search"></i></button>
     </form></div>
   <div class="search-container">  <form action="searchbyId">
      <input type="text" placeholder="Search by BookId.." name="bookId">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
  <div><a href="logout">Logout</a></div>
</div>

<h3><u>Book Details</u></h3>
<%-- <div align="center">

		<thead>
			<tr>
			<th>Data Id</th>
			<th>E-Mail Id</th>
			<th>Construction Type</th>
				<th>Location</th>
				<th>Plot Size</th>
				<th>Distance</th>
				
               <!--   <th>Actions</th> -->
			</tr>
		</thead>
		<tbody>--%>
<table border="1"  >
			<thead>
  <tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Book Type</th>
				<th>Book Rack</th>
				<th>ISBN</th>
				<th>Description</th>
				
               <!--   <th>Actions</th> -->
			</tr>
		</thead>
		<tbody>
			<c:forEach var="b" items="${li}">
				<tr>
				<td><c:out value="${b.bookId}" /></td>
				<td><c:out value="${b.bookName}" /></td>
				<td><c:out value="${b.bookType}" /></td>
					<td><c:out value="${b.bookRack}" /></td>
					<td><c:out value="${b.isbn}"/></td>
					<td><c:out value="${b.bookDescription}" /></td>
					
					
					
				</tr>
			</c:forEach>
			</tbody> 
			</table>
		
			<br><br>
			<a href="header">Go Back</a> 
</body>
</html>