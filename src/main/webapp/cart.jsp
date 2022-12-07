<%@include file="includes/metadata.jsp"%>

<title>Cart</title>

<%@include file="includes/exstyles.jsp"%>

<style>
body {
    background:url("images/back.jpg");
    background-size: cover;
}

.User_option li {
	padding: 20px;
}

.cartmaincontainer {
	width: 100%;
	height: 80vh;
	dislpay: flex;
    justify-content: center;
}

.cartinnercontainer {
	width: 80%;
	height: 100%;
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.cartstatus {
	width: 100%;
	height: 80px;
}

.table {
    color: white;
}


::-webkit-scrollbar{
    display: none;
  }
</style>

</head>
<body>

	<%@include file="includes/header.jsp"%>

		<div class="cartmaincontainer">
			<div class="cartinnercontainer">
				<div class="cartstatus">
					<%
					if(cartDetails != null) {
						if(cartDetails.size() > 0) { %>
							<a href="shippingmethod.jsp">
								<button name="checkout" class="btn btn-outline-light mt-3">Proceed to Checkout</button>
							</a>
						<%}
					}%>
				</div>
				<div class="carttable">
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">Item Image</th>
					      <th scope="col">Item Name</th>
					      <th scope="col">Price</th>
					      <th scope="col">Quantity / Kg</th>
					      <th scope="col">Remove Item</th>
					    </tr>
					  </thead>
					  <tbody>
					    <%
						if (cartDetails != null) {
							for (Cart cart : cartDetails) {
								System.out.println("Have Data");
						%>
						<tr>
							<td><img alt="icon" class="cartlog" width="60px" height="60px" src="images/<%=cart.getItem_image()%>"></td>
							<td><h5><%=cart.getItem_name()%></h5></td>
							<td><h5><%=cart.getPrice()%></h5></td>
							<td><h1>
								<form method="post" action="" class="form-inline">
									<input type="text" name="id" value="1" class="form-input" hidden>
									<div class="form-group d-flex justify-content=between">
									<a class="btn btn-sm btn-decre" href="cartremoveqty?itemid=<%=cart.getItem_id()%>"><i class="fas fa-minus-square"></i></a>
									<input type="number" name="quantity" class="form-control" value="<%=cart.getQty() %>" readonly min="1" max="5">
									<a class="btn btn-sm btn-incre" href="cartaddqty?itemid=<%=cart.getItem_id()%>"><i class="fas fa-plus-square"></i></a>
									</div>
								</form>
							</h1></td>
							<td>
								<form action="deletecartitm" method="post">
									<input type="text" name="itmid" value="<%=cart.getItem_id() %>" hidden>
									<button type="submit" class="btn btn-outline-light mt-2">Delete</button>
								</form>
							</td>
						</tr>
						<%
							}
						}else {
							System.out.println("No data");
						}
						%>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
		
		
	<%@include file="includes/footer.jsp"%>