<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student marks</title>
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
						<p class="fs-4 text-center">Add Student Marks</p>

						<c:if test="${not empty suc }">
							<p class="text-center text-success">${suc }</p>
							<c:remove var="suc" />
						</c:if>

						<c:if test="${not empty err }">
							<p class="text-center text-success">${err }</p>
							<c:remove var="err" />
						</c:if>

						<form action="add_marks" method="post">
							<div class="mb-3">
								<label class="form-label">Name: </label> <input required
									name="name" type="text" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in English: </label> <input
									required name="english" type="number" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Maths: </label> <input
									required name="maths" type="number" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Physics: </label> <input
									required name="physics" type="number" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Chemistry: </label> <input
									required name="chemistry" type="number" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Marks in Biology: </label> <input
									required name="biology" type="number" class="form-control">
							</div>

							<button type="submit" class="btn bg-success text-white col-md-12">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>