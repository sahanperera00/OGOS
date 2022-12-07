package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.crud.OrderCRUD;
import com.oop.model.Customer;
import com.oop.model.Order;

@WebServlet("/DeleteOrderServlet")
public class DeleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int orderid = Integer.parseInt(request.getParameter("orderid"));
			boolean isTrue = OrderCRUD.deleteOrder(orderid);
			
			if(isTrue == true) {
				HttpSession session = request.getSession();
				Customer cusDetails = (Customer)session.getAttribute("cusDetails");
				int cusid = cusDetails.getCus_id();
				
				List<Order> orderDetails = OrderCRUD.readAllUnpayedOrders(cusid);
				System.out.println(orderDetails.size());
				
				request.setAttribute("orderDetails", orderDetails);
				RequestDispatcher dis = request.getRequestDispatcher("payment.jsp");
				dis.forward(request, response);
			}else {
				System.out.print("Delete failed!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
