<%--
  Created by IntelliJ IDEA.
  User: suren
  Date: 5/5/2019
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Agent Banking</title>
<style>
div.dataTables_wrapper {
	width: 100%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<%@ include file="/WEB-INF/views/template/header.jsp"%>
		</div>
		<div class="row">
			<div class="col-md-2">
				<%@ include file="/WEB-INF/views/template/sidebar.jsp"%>
			</div>
			<div class="col-md-10">
				<section class="content-header">
					<h1>
						Dashboard <small>User Page</small>
					</h1>
					<ol class="breadcrumb">
						<li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
						<li class="active">User</li>
					</ol>
				</section>
				<section class="content">
					<div class="row" style="margin-top: 50px;margin-bottom: 25px;">
						<form method="POST">
							<div class="row">
								<div class="col-md-12">
									<div class="col-md-4">
										<div class="form-group">
											<label for="username">Username</label> <input type="text"
												class="form-control" name="username" placeholder="Username" />
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label for="username">Full Name</label> <input type="text"
												class="form-control" name="fullname" placeholder="Full Name" />
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label for="username">Employee ID</label> <input type="text"
												class="form-control" name="employeeid" placeholder="Employee ID" />
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="col-md-3">
										<button class="btn btn-primary">Search</button>
										<button class="btn btn-primary">Add</button>
										<button class="btn btn-danger">Reset</button>
									</div>
								</div>
							</div>
						</form>
					</div>
					<hr/>
					<div class="row" style="margin-top: 50px;">
						<table id="userTable" class="table table-striped ">
							<thead class="thead-dark">
								<th>Username</th>
								<th>Full Name</th>
								<th>Employee ID</th>
								<th>User Role</th>
								<th>User Status</th>
								<th>Password Status</th>
								<th>Attempts</th>
								<th>Expiry Date</th>
								<th>Last Logged Date</th>
								<th>Last Updated Time</th>
								<th>Created Time</th>
								<th>Last Updated User</th>
							</thead>
							<tbody>
								<c:forEach items="${users}" var="user">
									<tr>
										<td>${user.username}</td>
										<td>${user.fullname}</td>
										<td>${user.employeeid}</td>
										<td>${user.userrole.description}</td>
										<td>${user.statusByStatus.description}</td>
										<td>${user.statusByPasswordstatus.description}</td>
										<td>${user.attempts}</td>
										<td>${user.expirydate}</td>
										<td>${user.lastloggeddate}</td>
										<td>${user.lastupdatedtime}</td>
										<td>${user.createdtime}</td>
										<td>${user.lastupdateduser}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</section>
			</div>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-10">
					<%@ include file="/WEB-INF/views/template/footer.jsp"%></div>
			</div>
		</div>
	</div>
</body>
<script>
	$(document).ready(function() {
		$('#userTable').DataTable({
			"scrollX" : true
		});
	});
</script>
</html>
