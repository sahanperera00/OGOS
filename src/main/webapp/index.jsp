<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">

<title>Hello, world!</title>
<style>
.carousel img {
	width: 100%;
	height: 100vh;
}

.card {
	height: 250px;
	margin-bottom: 150px;
	background-color: rgb(0,0,0,0.2);
}
</style>
</head>
<body>
	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active" data-interval="100">
				<img class="d-block w-100" src="images/page1.jpg" alt="First slide">
				<div class="carousel-caption d-none d-md-block">
					<div class="card">
				      <div class="card-body mt-4">
				        <h1 class="card-title">New to OGOS?</h1>
				        <h3 class="card-text">Register Here</h3><br>
				        <a href="addcustomer.jsp"><input type="button" class="btn btn-outline-light" name="addcustomer" value="New Customer"></a>
				      </div>
				    </div>
				</div>
			</div>
			<div class="carousel-item" data-interval="100">
				<img class="d-block w-100" src="images/page2.jpg" alt="Second slide" width="100vw" height="762px">
				<div class="carousel-caption d-none d-md-block">
					<div class="card">
				      <div class="card-body mt-4">
				        <h1 class="card-title">Already Registered?</h1>
				        <h3 class="card-text">Login Here</h3><br>
				        <a href="login.jsp"><input type="button" class="btn btn-outline-light" name="addcustomer" value="Login"></a>
				      </div>
				    </div>
				</div>
			</div>
			<div class="carousel-item" data-interval="100">
				<img class="d-block w-100" src="images/page3.jpg" alt="Third slide" width="100vw" height="762px">
				<div class="carousel-caption d-none d-md-block">
					<div class="card">
				      <div class="card-body mt-4">
				        <h1 class="card-title">Browse the Store</h1>
				        <h3 class="card-text">Click Here</h3><br>
				        <a href="home"><input type="button" class="btn btn-outline-light" name="addcustomer" value="Browse Store"></a>
				      </div>
				    </div>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>