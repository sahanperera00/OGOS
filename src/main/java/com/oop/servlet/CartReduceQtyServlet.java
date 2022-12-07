package com.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.Cart;

public class CartReduceQtyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("itemid"));
			ArrayList<Cart> cartDetails = (ArrayList<Cart>)request.getSession().getAttribute("cartDetails");
			
			for(Cart cart: cartDetails) {
				if(cart.getItem_id() == id) {
					cart.setQty(cart.getQty() - 1);
					cartDetails.remove(cart);
					cartDetails.add(cart);
					break;
				}
			}
			HttpSession session = request.getSession();
			session.setAttribute("cartDetails", cartDetails);
			response.sendRedirect("cart.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
