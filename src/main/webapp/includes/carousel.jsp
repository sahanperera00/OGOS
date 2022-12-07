<!-- slider section -->
		<section class="slider_section ">
			<div id="customCarousel1" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="container">
							<div class="row">
								<div class="col-md-6">
									<div class="detail-box">
										<h1> Hello<br> 
										<% if(cusDetails != null) {
											out.print(cusDetails.getTitle());
											out.print(cusDetails.getFname());}else{out.print("Guest");} %> !</h1>
										<h3>We are here to serve only the best products for you</h3>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item ">
						<div class="container">
							<div class="row">
								<div class="col-md-6">
									<div class="detail-box">
										<h1> Look no further!  <br /> We got everything for you. </h1>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<ol class="carousel-indicators">
					<li data-target="#customCarousel1" data-slide-to="0" class="active"></li>
					<li data-target="#customCarousel1" data-slide-to="1"></li>
				</ol>
			</div>
		</section>
	</div>
		<!-- end slider section -->