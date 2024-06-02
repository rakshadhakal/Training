<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="cp" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>E-Commerce</title>

<!-- Custom fonts for this template-->
<link
	href="${cp}/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="${cp}/css/sb-admin-2.min.css"
	rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->


		<%@ include file="sidebar.jsp"%>

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<%@ include file="topbar.jsp"%>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>

					</div>

					<!-- Content Row -->

				</div>
				<!-- page content goes here -->
				
				<c:choose>
				    <c:when test="${edit eq true }">
				    <!-- edit category form here -->
				    <div class="row">
					<div class="col-lg-g">
						<div class="card">
							<div class="card-header">Update category detail</div>
							<div class="card-body">
								<form class="form-responsive" method="post"
									action="${cp }/admin/category/edit">

									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token }" }/>

									<div class="form-group">
										<label for="#nameInput">Category Id</label> <input
											type="text" class="form-control" id="idInput"
											name="category_id" value="${cat_edit.id }" readonly> 

									</div>
									<div class="form-group">
										<label for="#nameInput">Category Name</label> <input
											type="text" class="form-control" id="nameInput"
											name="category_name" value="${cat_edit.name }">

									</div>

									<div class="form-group">
										<label for="#description">Category Description</label>
										<textarea class="form-control" id="description"
											name="description" row="5" cols="50"
									>${cat_edit.description }</textarea>
									</div>

									<div class="form-group">
										<label for="#parent_category">Parent Category </label> <select
											class="form-control" id="parent_category"
											name="parent_category" >
											<option value="0">---Main Category---</option>
											<!-- <option value="1">Electronic</option> -->
											<c:forEach items="${cat_list }" var="cat">
											<c:if test="${cat.parentcat eq 0  }">  
											<!-- {cat.parentcat eq 0 } shows main category only -->
											
											<option value="${cat.id }"
											<c:if test="${cat_edit.parentcat eq cat.id }">selected</c:if>>${cat.name }</option>
											<!-- and select only that category which is the parent of edit_category -->
											</c:if>
											</c:forEach>
											
										</select>
									</div>

									<div class="form-control">
										<input type="submit" class="btn btn-primary"
											value="Update"> <input type="reset"
											class="btn btn-warning" value="Reset">
									</div>

								</form>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col">
						<div class="card">
							<div class="card-heading">Display all category details</div>
							<div class="card-body">
								<table class="table table-responsive">
									<thead>
										<tr>
											<th>Category Id</th>
											<th>Name</th>
											<th>Description</th>
											<th>Parent Category</th>
											<th>Edit</th>
											<th>Delete</th>
										</tr>
									</thead>
									<tbody>
									
									<c:forEach items="${cat_list }" var="cat">
										<tr>
											<td>${cat.id }</td>
											<td>${cat.name }</td>
											<td>${cat.description }</td>
											<td>${cat.parentcat }</td>
											<td><a class="btn btn-warning" href="${cp}/admin/category/edit/${cat.id}">Edit</a></td>
											<td><a class="btn btn-danger" href="${cp }/admin/category/delete/${cat.id}">Delete</a></td>
										</tr>
										</c:forEach>
									</tbody>
								</table>								
							</div>
						</div>
					</div>
				</div>
				    </c:when>
				    <c:otherwise>
				    <!-- add category form here -->
				    <div class="row">
					<div class="col-lg-g">
						<div class="card">
							<div class="card-header">Add new category detail</div>
							<div class="card-body">
								<form class="form-responsive" method="post"
									action="${pathContext.request.contextPath }/admin/category/add">

									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token }" }/>

									<div class="form-group">
										<label for="#nameInput">Category Name</label> <input
											type="text" class="form-control" id="nameInput"
											name="category_name" placeholder="Enter category name">

									</div>

									<div class="form-group">
										<label for="#description">Category Description</label>
										<textarea class="form-control" id="description"
											name="description" row="5" cols="50"
											placeholder="Enter category description"></textarea>
									</div>

									<div class="form-group">
										<label for="#parent_category">Parent Category </label> <select
											class="form-control" id="parent_category"
											name="parent_category">
											<option value="0">---Main Category---</option>
											<!-- <option value="1">Electronic</option> -->
											<c:forEach items="${cat_list }" var="cat">
											<c:if test="${cat.parentcat eq 0 }">  <!-- shows main category only -->
											<option value="${cat.id }">${cat.name }</option>
											</c:if>
											</c:forEach>
										</select>
									</div>

									<div class="form-control">
										<input type="submit" class="btn btn-primary"
											value="Save"> <input type="reset"
											class="btn btn-warning" value="Reset">
									</div>

								</form>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col">
						<div class="card">
							<div class="card-heading">Display all category details</div>
							<div class="card-body">
								<table class="table table-responsive">
									<thead>
										<tr>
											<th>Category Id</th>
											<th>Name</th>
											<th>Description</th>
											<th>Parent Category</th>
											<th>Edit</th>
											<th>Delete</th>
										</tr>
									</thead>
									<tbody>
									
									<c:forEach items="${cat_list }" var="cat">
										<tr>
											<td>${cat.id }</td>
											<td>${cat.name }</td>
											<td>${cat.description }</td>
											<td>${cat.parentcat }</td>
											<td><a class="btn btn-warning" href="${cp}/admin/category/edit/${cat.id}">Edit</a></td>
											<td><a class="btn btn-danger" href="${cp }/admin/category/delete/${cat.id}">Delete</a></td>
										</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				    </c:otherwise>
				</c:choose>
				

				<!-- page content goes here -->
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->
			<%@ include file="footer.jsp"%>
			<!-- Footer -->

			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->

	<%@ include file="logout.jsp"%>
	<!-- Bootstrap core JavaScript-->
	<script
		src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="${pageContext.request.contextPath}/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script
		src="${pageContext.request.contextPath}/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script
		src="${pageContext.request.contextPath}/js/demo/chart-area-demo.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/demo/chart-pie-demo.js"></script>

</body>

</html>