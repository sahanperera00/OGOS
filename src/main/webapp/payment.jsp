<%@include file="includes/metadata.jsp"%>

<title>Payment</title>

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
	dislpay: flex;
    justify-content: center;
}

.cartinnercontainer {
	width: 90%;
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

.form-control {
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
					<h1>Payment</h1>
				</div>
				<div class="carttable">
					<table class="table">
					<% 
					List<Order> orderDetails = (List<Order>)request.getAttribute("orderDetails");
					int Oid = 0;
					%>
					  <thead>
					    <tr>
					      <th scope="col">Item Image</th>
					      <th scope="col">Item Name</th>
					      <th scope="col">Quantity / Kg</th>
					      <th scope="col">Shipping Method</th>
					      <th scope="col">Delivery Address</th>
					      <th scope="col">Date</th>
					      <th scope="col">Time</th>
					      <th scope="col">Pay</th>
					      <th scope="col">Remove</th>
					    </tr>
					  </thead>
					  <tbody>
						<tr>
						<form action="payment" method="get">
							<%
							if(orderDetails != null) {
								for(Order order : orderDetails) {
									Oid = order.getOrder_id();
									int Iid = order.getItem_id();
									String name = null;
									String imgname = null;
									int quantity = order.getQuantity();
									String type = order.getType();
									String address = order.getAddress();
									String date = order.getDate();
									String time = order.getTime();
								
									for(Item item : itemDetails) {
										if(item.getItem_id() == Iid) {
											name = item.getItem_name();
											System.out.println(name);
											imgname = item.getItem_image();
											break;
										}
									}%>
								<td><img alt="icon" class="cartlog" width="60px" height="60px" src="images/<%=imgname%>"></td>
								<td><h5><%=name%></h5></td>
								<td><h5><%=quantity%></h5></td>
								<td><h5><%=type%></h5></td>
								<td>
								<%if(type.equalsIgnoreCase("Delivery")) {%>
									<input class="form-control bg-transparent" type="text" name="address" value="<%=address %>">
								<%}else {%>---<%} %>
								</td>
								<td><input class="form-control bg-transparent" type="date" name="date" value="<%=date%>"></td>
								<td>
									<%if(type.equalsIgnoreCase("Delivery")) {%>
									<select name="time" class="form-control bg-transparent">
										<option value="8-10">8.00 AM - 10.00 AM</option>
										<option value="12-14">12.00 PM - 2.00 PM</option>
										<option value="16-18">4.00 PM - 6.00 PM</option>
									</select>
								<%}else {%>
									<select name="time" class="form-control bg-transparent">
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
								<%} %>
								</td>
									<input class="form-control bg-transparent" type="text" name="orderid" value="<%=Oid %>" hidden>
								<td><button type="submit" class="btn btn-outline-light">Pay</button></td>
								</form>
								<td><a href="delorder?orderid=<%=Oid %>"><button class="btn btn-outline-light">Remove</button></a></td>
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