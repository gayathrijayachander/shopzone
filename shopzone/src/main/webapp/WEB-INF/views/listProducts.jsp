
<link rel="stylesheet"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<div class="container">

	<div class="row">
	
	<!-- to display sidebar -->
	
	<div class="col-md-3">
	
	<%@ include file="./shared/sidebar.jsp" %>
	
	</div>

	<!-- to display products-->
	
	<div class="col-md-9">
	<!-- added breadcrumb product -->
	<div class="row">
	
		<div class="col-md-12">
		
		<c:if test="${userClicksAllProducts == true}">
		<ol class="breadcrumb">
		
		<li><a href="${contextRoot}/home">Home</a></li>
		<li class="active">All Products</li>
		
		</ol>
		</c:if>
		
		<c:if test="${userClicksCategoryProducts == true}">
		<ol class="breadcrumb">
		
		<li><a href="${contextRoot}/home">Home</a></li>
		<li class="active">category</li>
		<li class="active">${category.name}</li>
		
		
		</ol>
		</c:if>
		
		
		</div>
	</div>
	
	</div>
	
	
	
	
	
	
	</div>





</div>