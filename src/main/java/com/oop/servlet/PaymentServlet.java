package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int orderid = Integer.parseInt(request.getParameter("orderid"));
			String address = request.getParameter("address");
			String date = request.getParameter("date");
			String time = request.getParameter("time");
			int itemid = 0;
			boolean isTrue = OrderCRUD.updateOrder(orderid,address,date,time);
			
			if(isTrue == true) {
				List<Order> OrderDetails = OrderCRUD.readAllOrders(orderid);
				
				if(OrderDetails.size() > 0) {
					for(Order order: OrderDetails) {
						if(order.getOrder_id() == orderid) {
							itemid = order.getItem_id();
						}
					}
				}
				HttpSession session = request.getSession();
				ArrayList<Cart> cartDetails = (ArrayList<Cart>)session.getAttribute("cartDetails");
				
				if(cartDetails != null) {
					for(Cart cart: cartDetails) {
						if(cart.getItem_id() == itemid) {
							cartDetails.remove(cart);
							session.setAttribute("cartDetails", cartDetails);
							break;
						}
					}
				}
				
				Customer cusDetails = (Customer)session.getAttribute("cusDetails");
				int cusid = cusDetails.getCus_id();
				
				List<Order> orderDetails = OrderCRUD.readAllUnpayedOrders(cusid);
				System.out.println(orderDetails.size());
				
				request.setAttribute("orderDetails", orderDetails);
				RequestDispatcher dis = request.getRequestDispatcher("payment.jsp");
				dis.forward(request, response);
			}else {
				response.sendRedirect("home.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
