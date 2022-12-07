<%@include file="includes/metadata.jsp"%>

<title>Shipping Method</title>

<%@include file="includes/exstyles.jsp"%>

<style>
body {
    background:url("images/back.jpg");
    background-size: cover;
    color: white;
}

.User_option li {
	padding: 20px;
}

.cartmaincontainer {
	width: 100%;
	height: 80vh;
}

.cartinnercontainer {
	width: 50%;
	height: 100%;
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.cartstatus {
	width: 100%;
	height: 80px;
	text-align: center;
}

.table {
    color: white;
}
</style>

</head>
<body>

	<%@include file="includes/header.jsp"%>

		<div class="cartmaincontainer">
			<div class="cartinnercontainer">
				<div class="cartstatus">
					<h1>Select the Shipping Method</h1>
				</div>
				<table>
					<tr>
						<td>
						<div class="card border-light mb-3 bg-transparent m-5" style="max-width: 18rem;">
							<div class="card-body">
						    	<center>
						    	<h5 class="card-title">Delivery</h5>
						    	<img alt="icon" class="cartlog" width="200px" height="200px" src="images/delivery.png">
						    	<a href="deliverymethod.jsp"><input type="button" name="delivery" value="Delivery" class="btn btn-outline-light mt-3"></a>
								</center>
							</div>
						</div>
						</td>
						<td>
						<div class="card border-light mb-3 bg-transparent m-5" style="max-width: 18rem;">
							<div class="card-body">
						    	<center>
						    	<h5 class="card-title">Pickup</h5>
						    	<img alt="icon" class="cartlog" width="200px" height="200px" src="images/pickup.png">
						    	<a href="pickupmethod.jsp"><input type="button" name="pickup" value="Pickup"  class="btn btn-outline-light mt-3"></a>
								</center>
							</div>
						</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
		
	<%@include file="includes/footer.jsp"%>