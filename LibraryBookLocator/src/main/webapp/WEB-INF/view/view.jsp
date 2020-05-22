<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #2A9DC3;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>View Book</title>
</head>
<body>

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
			<a href="backuser">Go Back</a> 
</body>
</html>