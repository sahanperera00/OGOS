package com.oop.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.oop.crud.ItemCRUD;
import com.oop.model.Item;

@WebServlet("/AddItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item_name = request.getParameter("iname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		String discount = request.getParameter("discount");
		String image = request.getParameter("image");
		
		try {
			boolean isTrue = ItemCRUD.createitem(item_name, price, qty, discount, image);
			
			if(isTrue == true) {
				HttpSession session = request.getSession();
				List<Item> itemDetails = ItemCRUD.readallitems();
				session.setAttribute("itemDetails", itemDetails);
				
				response.sendRedirect("additem.jsp");
			}else {
				response.sendRedirect("additem.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
