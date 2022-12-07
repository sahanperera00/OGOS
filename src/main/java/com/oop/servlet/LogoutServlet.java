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

import com.oop.crud.ItemCRUD;
import com.oop.model.Item;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if(request.getSession().getAttribute("cusDetails") != null) {
				request.getSession().removeAttribute("cusDetails");
				
				if(request.getSession().getAttribute("cartDetails") != null) {
					request.getSession().removeAttribute("cartDetails");
					request.getSession().invalidate();
				}
			}
			HttpSession session = request.getSession();
			List<Item> itemDetails = ItemCRUD.readallitems();
			session.setAttribute("itemDetails", itemDetails);
			response.sendRedirect("home.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
