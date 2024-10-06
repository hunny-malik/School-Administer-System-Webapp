<%@page import="java.util.List"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.DAO"%>
<%@page import="com.entity.values"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Info</title>
<link rel="icon" type="image/x-icon" href="img/favicon2.png">
<%@ include file="component/allcss.jsp"%>

</head>
<body class="bg-light">

	<%@ include file="component/navbar.jsp"%>

	<br>
	<div class="container p-3">
		<a href="add_info.jsp" type="button" class="btn btn-warning"
			style="margin-left: 1141px;">Add Student Info</a>

		<div class="card">
			<div class="card-body">

				<p class="text-center fs-1">All Student Information</p>

				<c:if test="${not empty suc }">
					<p class="text-center text-success">${suc }</p>
					<c:remove var="suc" />
				</c:if>

				<c:if test="${not empty err }">
					<p class="text-center text-success">${err }</p>
					<c:remove var="err" />
				</c:if>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Full Name</th>
							<th scope="col">Address</th>
							<th scope="col">Email</th>
							<th scope="col">Date of Birth</th>
							<th scope="col">Phone</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>
						<%
						DAO dao = new DAO(DBConnect.getConn());
						List<values> list = dao.showAllInformation();

						for (values val : list) {
						%>

						<tr>
							<th scope="row"><%=val.getName()%></th>
							<td><%=val.getAddress()%></td>
							<td><%=val.getEmail()%></td>
							<td><%=val.getDob()%></td>
							<td><%=val.getPhone()%></td>
							<td><a href="edit_info.jsp?id=<%=val.getId()%>"
								class="btn btn-sm btn-primary">Edit</a> <a
								href="delete_info?id=<%=val.getId()%>"
								class="btn btn-sm btn-danger ms-1">Delete</a></td>

							<%
							}
							%>

						</tr>

					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>