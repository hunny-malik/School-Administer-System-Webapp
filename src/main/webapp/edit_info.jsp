<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.DAO"%>
<%@page import="com.entity.values"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student Info</title>
<link rel="icon" type="image/x-icon" href="img/favicon4.jpg">
<%@ include file="component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body class="bg-light">

	<br>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Edit Student Information</p>

						<%
						int id = Integer.parseInt(request.getParameter("id"));
						DAO dao = new DAO(DBConnect.getConn());
						values val = dao.getInformationById(id);
						%>


						<form action="edit_info" method="post">
							<div class="mb-3">
								<label class="form-label">Full Name: </label> <input
									value="<%=val.getName()%>" name="name" type="text"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Address: </label> <input
									value="<%=val.getAddress()%>" name="address" type="text"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Email Address: </label> <input
									value="<%=val.getEmail()%>" name="email" type="email"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Date of Birth: </label> <input
									value="<%=val.getDob()%>" name="dob" type="date"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Phone: </label> <input
									value="<%=val.getPhone()%>" name="phone" type="number"
									class="form-control">
							</div>

							<input type="hidden" name="id" value="<%=val.getId()%>">

							<button type="submit" class="btn bg-success text-white col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>