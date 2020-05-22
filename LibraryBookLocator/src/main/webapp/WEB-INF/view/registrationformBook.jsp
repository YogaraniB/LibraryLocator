 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
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
   .topnav a, .topnav input[type=text],select, .topnav .search-container button {
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

body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}

.icon {
  padding: 10px;
  background: dodgerblue;
  color: white;
  min-width: 50px;
  text-align: center;
}

.input-field,select {
  width: 100%;
  padding: 10px;
  outline: none;
}

.input-field:focus {
  border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
  background-color: dodgerblue;
  color: white;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>

</head>
<body>
<div class="topnav">
  <p align="center">Welcome to Library Book Locator</p>
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
<form action="registersaveBook" style="max-width:500px;margin:auto">
  <h2>Register Book Here</h2>
  <div class="input-container">
    <i class="fa fa-book icon"></i>
    <input class="input-field" type="text" placeholder="Bookname" name="bookName">
  </div>

  <div class="input-container">
    <i class="fa fa-id-badge icon"></i>
    <input class="input-field" type="text" placeholder="BookId" name="bookId">
  </div>
  
  
  <div class="input-container">
    <i class="fa fa-comment icon"></i>
    
    <select name="bookRack">
    <option >Select BookRack</option>
					<c:forEach var="b" items="${li}">
						<option value="${b.bookRackId}">${b.bookRackId}</option>
    </c:forEach></select>
  </div>
  
  
  
  <div class="input-container">
    <i class="fa fa-server icon"></i>
    
    <select name="bookType">
    <option >Select BookType</option>
					<c:forEach var="b" items="${li}">	<option value="${b.bookType}">${b.bookType}</option>
    </c:forEach></select>
  </div>
  
  <div class="input-container">
    <i class="fa fa-info icon"></i>
    <input class="input-field" type="text" placeholder="ISBN" name="isbn">
  </div>
  
  <div class="input-container">
    <i class="fa fa-sticky-note-o icon"></i>
    <input class="input-field" type="text" placeholder="BookDescription" name="bookDescription">
  </div>

  <button type="submit" class="btn">Register</button>
</form>

</body>
</html>
