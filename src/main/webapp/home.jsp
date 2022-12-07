<%@include file="includes/metadata.jsp"%>

<title>Home</title>

<style>
.homemaincontainerhome {
	width: 100%;
	/*background-color: rgb(150,100,100);*/
	display: flex;
	justify-content: center;
}

.titlecont {
	width: 100%;
	height: 50px;
	text-align: center;
}

.cardcontainerhome {
	width: 80%;
	/*background-color: rgb(150,150,150);*/
	display: flex;
	flex-wrap: wrap;
}

.card {
	width: 200px;
	height: 440px;
	margin: 20px;
	background-color: rgb(230, 230, 230);
	transition: 0.3s ease-in-out;
}

.card:hover {
	transform: scale(1.05);
}

.cardimage {
	width: 200px;
	height: 200px;
	display: flex;
	overflow: hidden;
}

.cardimage img {
	width: 200px;
	height: 200px;
	display: block;
}

.cardbody {
	width: 100%;
	height: 100px;
	/*background-color: rgb(220,220,220);*/
	text-align: center;
	margin-top: 10px;
}

.User_option li {
	padding: 20px;
}

::-webkit-scrollbar{
    display: none;
  }
</style>

<%@include file="includes/exstyles.jsp"%>

</head>
<body>
	<div class="hero_area">
		<div class="hero_bg_box">
			<img src="images/hero-bg.jpg" alt="">
		</div>

	<%@include file="includes/header.jsp"%>
	<%@include file="includes/carousel.jsp"%>
	
	</div>

	<!-- Grocery section -->
	<div class="titlecont">
		<h3>Grocery Items</h3>
	</div>
	<div class="homemaincontainerhome">
		<div class="cardcontainerhome">
			<%
			if (itemDetails != null) {
				for (Item item : itemDetails) {
					int qnty = 0;
					int id = item.getItem_id();

					if (cartDetails != null) {
						for (Cart cart : cartDetails) {
							if (cart.getItem_id() == id) {
							qnty = cart.getQty();
							}
						}
					}%>
			<div class="card">
				<div class="cardimage">
					<img alt="Card Image" src="images/<%=item.getItem_image()%>">
				</div>
				<div class="cardbody">
					<h3 class="itemname"><%=item.getItem_name()%></h3>
					<h5 class="itemprice"> Price: Rs.<%=item.getPrice()%></h5>
					<h5 class="itemdiscount">Discount: <%=item.getDiscount()%>% </h5>

					<%
					if (cusDetails != null) {
					%>
					<form action="updateqty" method="post">
						<input type="number" name="quantity" value="<%out.print(qnty);%>" id="qtyno" min="1" max="5"><br><br>
						<input type="text" name="itemid" value="<%=item.getItem_id()%>" hidden> 
						<input type="submit" class="btn btn-outline-dark" name="addtocart" value="Add to Cart">
					</form>
					<%
					} else {
					%>
					<a href="login.jsp">
						<button>Add to Cart</button>
					</a>
					<%
					}
					%>
				</div>
			</div>
			<%
			}
			}
			%>
		</div>
	</div>
	<!-- end Grocery section -->

	<%@include file="includes/footerhome.jsp"%>