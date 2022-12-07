package com.oop.servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.oop.crud.OrderCRUD;
import com.oop.model.Cart;
import com.oop.model.Customer;
import com.oop.model.Order;

@WebServlet("/ShippingServlet")
public class ShippingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String type = request.getParameter("shiptype");
			String deladdress = request.getParameter("address");
			String date = request.getParameter("date");
			String time = request.getParameter("time");
			String note = request.getParameter("note");
			
			LocalTime ordertimes = LocalTime.now();
			String ordertime = ordertimes.toString();
			
			HttpSession session = request.getSession();
			Customer cusDetails = (Customer)session.getAttribute("cusDetails");
			int cusid = cusDetails.getCus_id();
			List<Cart> cartDetails = (List<Cart>)session.getAttribute("cartDetails");
			System.out.println(cartDetails.size());
			
			if(cartDetails != null) {
				for(Cart cart: cartDetails) {
					boolean isTrue = false;
					int itmid = cart.getItem_id();
					int qty = cart.getQty();
					
					isTrue = OrderCRUD.createOrder(cusid,itmid,qty,type,deladdress,date,time,note,ordertime);
					if(isTrue == true) {
						System.out.println("order created!");
					}else {
						System.out.println("order not created!");
						response.sendRedirect("shippingmethod.jsp");
						break;
					}
				}
				List<Order> orderDetails = OrderCRUD.readAllUnpayedOrders(cusid);
				System.out.println(orderDetails.size());
				request.setAttribute("orderDetails", orderDetails);
				RequestDispatcher dis = request.getRequestDispatcher("payment.jsp");
				dis.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
