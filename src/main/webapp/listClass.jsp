<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 03/04/2022
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Management Application</title>
</head>
<body>
<center>
    <h1>Class Management</h1>
    <h2>
        <a href="/StudentServlet?action=createClass">Add New Class</a>
    </h2>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="classes" items="${classes}">
            <tr>
                <td><c:out value="${classes.id}"/></td>
                <td><c:out value="${classes.name}"/></td>
                <td><c:out value="${classes.description}"/></td>

                <td>
                    <a href="/StudentServlet?action=edit&id=${classes.id}">Edit</a>
                    <a href="/StudentServlet?action=delete&id=${classes.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
