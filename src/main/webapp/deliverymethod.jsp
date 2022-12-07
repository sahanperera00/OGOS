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

.maincontainer {
	width: 100%;
	height: 80vh;
    /*background-color: rgb(15,15,15);*/
}

.outercontainer {
	width: 50%;
	height: 100%;
    display: block;
    margin-left: auto;
    margin-right: auto;
    /*background-color: rgb(105,105,105);*/
    display: flex;
    justify-content: center;
}

.cartinnercontainer {
	width: 60%;
	height: 80%;
	text-align: center;
    margin-top: 70px;
   /* background-color: rgb(115,115,115);*/
}

.titlebar {
	width: 100%;
	height: 15%;
    /*background-color: rgb(145,145,145);*/
}

.formsec {
	width: 100%;
	height: 60%;
    /*background-color: rgb(185,185,185);*/
    margin-top: 20px;
}

.table {
    color: white;
}
</style>

</head>
<body>

	<%@include file="includes/header.jsp"%>

		<div class="maincontainer">
			<div class="outercontainer">
				<div class="cartinnercontainer">
					<div class="titlebar">
						<h1>Delivery</h1>
					</div>
					<div class="formsec">
						<form action="shipmthd" method="post">
						  <div class="form-group">
						    <label for="exampleInputEmail1">Delivery Address:</label>
						    <input type="text" name="address" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Address" required>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputEmail1">Pickup Date:</label>
						    <input type="date" name="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="" required>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Pickup Time:</label>
						    <select class="form-control" name="time" required>
								<option value="8-10">8.00 AM - 10.00 AM</option>
								<option value="12-14">12.00 PM - 2.00 PM</option>
								<option value="16-18">4.00 PM - 6.00 PM</option>
							</select>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputEmail1">Note:</label>
						    <input type="text" name="note" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your note...">
						  </div><br>
							<input type="text" name="shiptype" value="Delivery" hidden>
						 	<button type="submit" class="btn btn-light">Proceed to Payment</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	<%@include file="includes/footer.jsp"%>