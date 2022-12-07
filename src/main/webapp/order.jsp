<%@include file="includes/metadata.jsp"%>

<title>Order</title>

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
	width: 90%;
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
				</div>
				<div class="carttable">
					<table class="table">
					<% List<Order> orderDetails = (List<Order>)request.getAttribute("orderDetails");%>
					  <thead>
					    <tr>
					      <th scope="col">Item Image</th>
					      <th scope="col">Item Name</th>
					      <th scope="col">Quantity / Kg</th>
					      <th scope="col">Shipping Method</th>
					      <th scope="col">Delivery Address</th>
					      <th scope="col">Order Date</th>
					    </tr>
					  </thead>
					  <tbody>
					    <%
					    if(orderDetails != null) {
							for(Order order : orderDetails) {
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
						<tr>
							<td><img alt="icon" class="cartlog" width="60px" height="60px" src="images/<%=imgname%>"></td>
							<td><h5><%=name%></h5></td>
							<td><h5><%=quantity%></h5></td>
							<td><h5><%=type%></h5></td>
							<td><h5>
								<%if(type.equalsIgnoreCase("Delivery")) {%>
									<%=address %>
								<%}else {%>---<%} %>
							</h5></td>
							<td><h5><%=date%></h5></td>
						</tr>
						<%}
						}%>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
		
		
	<%@include file="includes/footer.jsp"%>