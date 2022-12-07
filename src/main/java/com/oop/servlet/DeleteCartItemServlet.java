package com.oop.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.Cart;

@WebServlet("/DeleteCartItemServlet")
public class DeleteCartItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("itmid"));
		
		List<Cart> cartDetails = (List<Cart>)request.getSession().getAttribute("cartDetails");
		for(Cart cart: cartDetails) {
			if(cart.getItem_id() == id) {
				cartDetails.remove(cart);
				break;
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("cartDetails", cartDetails);
		response.sendRedirect("cart.jsp");
	}

}
