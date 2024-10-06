<%@page import="java.util.List"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.DAO"%>
<%@page import="com.entity.values1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Marks</title>
<link rel="icon" type="image/x-icon" href="img/favicon3.jpg">

<%@ include file="component/allcss.jsp"%>

</head>
<body class="bg-light">

	<%@ include file="component/navbar.jsp"%>

	<br>
	<div class="container p-3">
		<a href="add_marks.jsp" type="button" class="btn btn-warning"
			style="margin-left: 1186px;">Add Marks</a>

		<div class="card">
			<div class="card-body">

				<p class="text-center fs-1">Student Marks</p>

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
							<th scope="col">Name</th>
							<th scope="col">English</th>
							<th scope="col">Maths</th>
							<th scope="col">Physics</th>
							<th scope="col">Chemistry</th>
							<th scope="col">Biology</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>

						<%
						DAO dao = new DAO(DBConnect.getConn());
						List<values1> list = dao.showAllMarks();

						for (values1 val1 : list) {
						%>

						<tr>
							<th scope="row"><%=val1.getName()%></th>
							<td><%=val1.getEnglish()%></td>
							<td><%=val1.getMath()%></td>
							<td><%=val1.getPhysics()%></td>
							<td><%=val1.getChemistry()%></td>
							<td><%=val1.getBiology()%></td>
							<td><a href="edit_marks.jsp?id=<%=val1.getId()%>"
								class="btn btn-sm btn-primary">Edit</a> <a href="delete_marks?id=<%=val1.getId()%>"
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