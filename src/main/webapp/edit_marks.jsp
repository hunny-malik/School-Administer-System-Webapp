<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.DAO"%>
<%@page import="com.entity.values1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Marks</title>
<link rel="icon" type="image/x-icon" href="img/favicon4.jpg">
<%@ include file="component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>

<body class="bg-light">

	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Edit Student Marks</p>

						<%
						int id = Integer.parseInt(request.getParameter("id"));
						DAO dao = new DAO(DBConnect.getConn());
						values1 val1 = dao.getMarksById(id);
						%>


						<form action="edit_marks" method="post">
							<div class="mb-3">
								<label class="form-label">Name: </label> <input
									value="<%=val1.getName()%>" name="name" type="text"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in English: </label> <input
									value="<%=val1.getEnglish()%>" name="english" type="number"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Maths: </label> <input
									value="<%=val1.getMath()%>" name="maths" type="number"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Physics: </label> <input
									value="<%=val1.getPhysics()%>" name="physics" type="number"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Chemistry: </label> <input
									value="<%=val1.getChemistry()%>" name="chemistry" type="number"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Biology: </label> <input
									value="<%=val1.getBiology()%>" name="biology" type="number"
									class="form-control">
							</div>

							<input type="hidden" name="id" value="<%=val1.getId()%>">

							<button type="submit" class="btn bg-success text-white col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>