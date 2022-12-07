<%@include file="includes/metadata.jsp"%>

<title>Sign up</title>

<%@include file="includes/exstyles.jsp"%>
	
<style>
body {
    background:url("images/login.jpg");
    background-size: cover;
}

.maincontformaddcus {
	width: 100%;
	height: 110vh;
	display: flex;
	justify-content: center;
	color: white;
}

.outerformcont {
	width: 35%;
	height: 770px;
    background-color: rgba(0,0,0,0.4);
	display: flex;
	justify-content: center;
	margin-top: 25px;
}

.innerformcont {
	width: 80%;
	height: 100%;
	margin-top: 20px;
}

::-webkit-scrollbar{
    display: none;
  }
</style>

</head>
<body>
	<div class="maincontformaddcus">
		<div class="outerformcont">
			<div class="innerformcont">
					<div class="titlebar">
						<h1>Signup</h1>
					</div>
				<form action="createcus" method="post">
				  <div class="form-row">
				 	<div class="form-group col-md-3">
				      <label for="inputEmail4">Title:</label>
					  <select name="title"  id="inputState" class="form-control">
						<option value="Mr.">Mr.</option>
						<option value="Mrs.">Mrs.</option>
						<option value="Miss.">Miss.</option>
						<option value="Dr.">Dr.</option>
						<option value="Rev.">Rev.</option>
					  </select>	  
				    </div>
				    <div class="form-group col-md-4">
				      <label for="inputEmail4">First Name:</label>
				      <input type="email" class="form-control" id="inputEmail4" placeholder="First Name" name="fname" required>
				    </div>
				    <div class="form-group col-md-5">
				      <label for="inputPassword4">Last Name:</label>
				      <input type="password" class="form-control" id="inputPassword4" placeholder="Last Name" name="lname" required>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputAddress">House No:</label>
				    <input type="text" class="form-control" id="inputAddress" placeholder="House No" name="houseno" required>
				  </div>
				  <div class="form-group">
				    <label for="inputAddress">Lane Name:</label>
				    <input type="text" class="form-control" id="inputAddress" placeholder="Lane Name" name="lanename" required>
				  </div>
				  <div class="form-group">
				    <label for="inputAddress">Street Name:</label>
				    <input type="text" class="form-control" id="inputAddress" placeholder="Street Name" name="streetname" required>
				  </div>
				  <div class="form-group">
				    <label for="inputAddress2">City:</label>
				    <input type="text" class="form-control" id="inputAddress2" placeholder="City" name="city" required>
				  </div>
				  <div class="form-row">
				    <div class="form-group col-md-6">
				      <label for="inputCity">Email:</label>
				      <input type="text" class="form-control" id="inputCity" name="email" placeholder="example@mail.com" pattern="[a-z0-9]+@[a-z0-9]+.[a-z]{2,3}" required>
				    </div>
				    <div class="form-group col-md-6">
				      <label for="inputCity">Password:</label>
				      <input type="text" class="form-control" id="inputCity" name="password" required>
				    </div>
				    <div class="form-group col-md-5">
				      <label for="inputZip">Phone:</label>
				      <input type="phone" class="form-control" id="inputZip" name="phone"  pattern="[0-9]{10}" placeholder="0123456789" required>
				    </div>
				  </div>
				  <div class="form-group">
				  </div>
				  <center><button type="submit" class="btn btn-outline-light">Sign up</button></center>
				</form>
			</div>
		</div>
	</div>
</body>
</html>