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
						<h1>Pickup</h1>
					</div>
					<div class="formsec">
						<form action="shipmthd" method="post">
						  <div class="form-group">
						    <label for="exampleInputEmail1">Pickup Date:</label>
						    <input type="date" name="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="" required>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Pickup Time:</label>
						    <select class="form-control" name="time" required>
								<option value="8-9">8.00 AM - 9.00 AM</option>
								<option value="9-10">9.00 AM - 10.00 AM</option>
								<option value="10-11">10.00 AM - 11.00 AM</option>
								<option value="11-12">11.00 AM - 12.00 PM</option>
								<option value="12-1">12.00 PM - 1.00 PM</option>
								<option value="1-2">1.00 PM - 2.00 PM</option>
								<option value="2-3">2.00 PM - 3.00 PM</option>
								<option value="3-4">3.00 PM - 4.00 PM</option>
								<option value="4-5">4.00 PM - 5.00 PM</option>
								<option value="5-6">5.00 PM - 6.00 PM</option>
								<option value="6-7">6.00 PM - 7.00 PM</option>
								<option value="7-8">7.00 PM - 8.00 PM</option>
							</select>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputEmail1">Note:</label>
						    <input type="text" name="note" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your note...">
						  </div><br>
							<input type="text" name="address" value="" hidden>
							<input type="text" name="shiptype" value="Pickup" hidden>
						 	<button type="submit" class="btn btn-light">Proceed to Payment</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	<%@include file="includes/footer.jsp"%>