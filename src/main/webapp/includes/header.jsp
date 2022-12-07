<!-- header section starts -->
		<header class="header_section">
			<div class="container-fluid">
				<nav class="navbar navbar-expand-lg custom_nav-container">
					<a class="navbar-brand" href="index.jsp"> <span> OGOS </span>
					</a>
					<div class="" id="">
						<div class="container">
							<div class=" mr-auto flex-column flex-lg-row align-items-center">
								<ul class="navbar-nav justify-content-between ">
									<div class="User_option">
										<%
										if (cusDetails != null) {
										%>
										<li class="menuitem"><a class="" href="home">Home</a></li>
										<li class="menuitem"><a class="" href="cart.jsp">Cart
										<%if(cartDetails != null) {%>
											<span class="badge badge-success"><%= cartDetails.size() %></span>
										<%} %>
										</a></li>
										<li class="menuitem"><a class="" href="order">Order</a></li>
										<%
										} else {
										%>
										<li class=""><a class="" href="login.jsp">Login</a></li>
										<%
										}
										%>
									</div>
								</ul>
							</div>
						</div>

						<div class="custom_menu-btn">
							<button onclick="openNav()">
								<span class="s-1"> </span> <span class="s-2"> </span> <span class="s-3"> </span>
							</button>
						</div>
						<div id="myNav" class="overlay">
							<div class="overlay-content">
								<a href="home">Home</a>
								<%
								if (cusDetails != null) {
								%><a href="cart.jsp">Cart</a>
								<a href="order">Order</a>
								<a href="logout">Logout </a>
								<%
								} else {
								%><a href="login.jsp">Login<%
								}
								%>
								</a>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</header>
		<!-- end header section -->
		
		