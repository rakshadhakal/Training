<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>E-Commerce</title>

    <!-- Custom fonts for this template-->
    <link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath}/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        

           <%@ include file="sidebar.jsp" %>
            
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">
                      
            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <%@ include file="topbar.jsp" %> 
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
                       
                    </div>

                    <!-- Content Row -->
                   
                </div>
                <!-- page content goes here -->
                <c:choose>
                <c:when test="${edit eq true }">
                <div class="row">
					<div class="col-lg-g">
						<div class="card">
							<div class="card-header">Update Prdouct detail</div>
							<div class="card-body">
								<form class="form-responsive" method="post"
									action="${pathContext.request.contextPath }/admin/product/edit"
									enctype="multipart/form-data">

									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token }" }/>

									<div class="form-group">
										<label for="#nameInput">Product ID</label> <input
											type="text" class="form-control" id="idInput"
											name="product_id" value="${product_edit.id }" readonly>

									</div>
																	<div class="form-group">
										<label for="#nameInput">Product Name</label> <input
											type="text" class="form-control" id="nameInput"
											name="product_name" value="${product_edit.name }" readonly>

									</div>

									<div class="form-group">
										<label for="#description">Product Description</label>
										<textarea class="form-control" id="description"
											name="product_description" row="5" cols="50"
											>${product_edit. description}</textarea>
									</div>
									
									<div class="form-group">
										<label for="#productInput">Product Quantity</label> <input
											type="number" class="form-control" id="productInput"
											name="product_quantity" value="${product_edit.quantity}" >

									</div>
									<div class="form-group">
										<label for="#doe">Date of Entry</label> <input
											type="date" class="form-control" id="doe"
											name="product_doe" value="${product_edit.dateOfEntry }">

									</div>
									<div class="form-group">
										<label for="#img">Product Image</label> <input
											type="file" class="form-control" id="img"
											name="product_image">
											<input type="text" name="original_image" value="${product_edit.image }" readonly>

									</div>
									<div class="form-group">
										<label for="#price">Price</label> <input
											type="number" class="form-control" id="price"
											name="product_price" value="${product_edit.price}" >

									</div>

									<div class="form-group">
										<label for="#category">Category </label> <select
											class="form-control" id="parent_category"
											name="product_category" value="${product_edit.category}" >
											<c:forEach items="${cat_list }" var="cat">
											
											<option value="${cat.id }">${cat.name }</option>
											
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
				
                </c:when>
                <c:otherwise>
                 <!-- add product form here -->
				    <div class="row">
					<div class="col-lg-g">
						<div class="card">
							<div class="card-header">Add new Prdouct detail</div>
							<div class="card-body">
								<form class="form-responsive" method="post"
									action="${pathContext.request.contextPath }/admin/product/add"
									enctype="multipart/form-data">

									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token }" }/>

									<div class="form-group">
										<label for="#nameInput">Product Name</label> <input
											type="text" class="form-control" id="nameInput"
											name="product_name" placeholder="Enter Prdouct name">

									</div>

									<div class="form-group">
										<label for="#description">Product Description</label>
										<textarea class="form-control" id="description"
											name="product_description" row="5" cols="50"
											placeholder="Enter Product description"></textarea>
									</div>
									
									<div class="form-group">
										<label for="#productInput">Product Quantity</label> <input
											type="number" class="form-control" id="productInput"
											name="product_quantity" placeholder="Enter Prdouct Quantity">

									</div>
									<div class="form-group">
										<label for="#doe">Date of Entry</label> <input
											type="date" class="form-control" id="doe"
											name="product_doe" placeholder="Enter Date of Entry">

									</div>
									<div class="form-group">
										<label for="#img">Product Image</label> <input
											type="file" class="form-control" id="img"
											name="product_image" placeholder="Upload product img">

									</div>
									<div class="form-group">
										<label for="#price">Price</label> <input
											type="number" class="form-control" id="price"
											name="product_price" placeholder="Enter Prdouct price">

									</div>

									<div class="form-group">
										<label for="#category">Category </label> <select
											class="form-control" id="parent_category"
											name="product_category" >
											
											<!-- <option value="1">Electronic</option> -->
											<c:forEach items="${cat_list }" var="cat">
											
											<option value="${cat.id }">${cat.name }</option>
											
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
				</c:otherwise>
				</c:choose>
				
				<div class="row">
					<div class="col">
						<div class="card">
							<div class="card-heading">Display all product details</div>
							<div class="card-body">
								<table class="table table-responsive">
									<thead>
										<tr>
											<th>Product Id</th>
											<th>Name</th>
											<th>Description</th>
											<th>Quantity</th>
											<th>Date Of Entry</th>
											<th>Image</th>
											<th>Price</th>
											<th>Category</th>
											<th>Edit</th>
											<th>Delete</th>
										</tr>
									</thead>
									<tbody>
									
									<c:forEach items="${product_list }" var="product">
										<tr>
											<td>${product.id }</td>
											<td>${product.name }</td>
											<td>${product.description }</td>
											<td>${product.quantity }</td>
											<td>${product.dateOfEntry }</td>
											<td><img height="70px" alt="${product.image }" src="${pageContext.request.contextPath }/prod_image/${product.image }"></td>
											<td>${product.price }</td>
											<td>${product.category.name }</td>
											<td><a class="btn btn-warning" href="${cp}/admin/product/edit/${product.id}">Edit</a></td>
											<td><a class="btn btn-danger" href="${cp }/admin/product/delete/${product.id}">Delete</a></td>
										</tr>
										</c:forEach>
									</tbody>
								</table>								
							</div>
						</div>
					</div>
				</div>
                 <!-- page content goes here -->
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
          <%@ include file="footer.jsp" %> 
            <!-- Footer -->

            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    
   <%@ include file="logout.jsp" %> 
    <!-- Bootstrap core JavaScript-->
    <script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="${pageContext.request.contextPath}/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="${pageContext.request.contextPath}/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="${pageContext.request.contextPath}/js/demo/chart-area-demo.js"></script>
    <script src="${pageContext.request.contextPath}/js/demo/chart-pie-demo.js"></script>

</body>

</html>