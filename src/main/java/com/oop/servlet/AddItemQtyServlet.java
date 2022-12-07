package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

import com.oop.crud.CartCRUD;
import com.oop.crud.ItemCRUD;
import com.oop.model.Cart;
import com.oop.model.Item;

@WebServlet("/AddItemQtyServlet")
public class AddItemQtyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<Cart> cartDetails = new ArrayList<>();

			int itemid = Integer.parseInt(request.getParameter("itemid"));
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			String itemname = null;
			double itemprice = 0;
			float itemdiscount = 0;
			String itemimg = null;
			
			List<Item> itemDetails = ItemCRUD.readallitems();
			for(Item item: itemDetails) {
				if(item.getItem_id() == itemid) {
					itemname = item.getItem_name();
					itemprice = item.getPrice();
					itemdiscount = item.getDiscount();
					itemimg = item.getItem_image();
				}
			}
			
			Cart cart = new Cart();
			cart.setItem_id(itemid);
			cart.setQty(quantity);
			cart.setItem_name(itemname);
			cart.setPrice(itemprice);
			cart.setDiscount(itemdiscount);
			cart.setItem_image(itemimg);
			
			HttpSession session = request.getSession();
			ArrayList<Cart> cartdetails = (ArrayList<Cart>) session.getAttribute("cartDetails");

			if(cartdetails == null) {
				cartDetails.add(cart);
				System.out.println("Session Created and Items Added!");
				session.setAttribute("cartDetails", cartDetails);
				response.sendRedirect("home.jsp");
			}else {
				cartDetails = cartdetails;
				boolean exist = false;
				
				for(Cart item: cartDetails) {
					if(item.getItem_id() == itemid) {
						exist = true;
						cartDetails.remove(item);
						item.setQty(quantity);
						cartDetails.add(item);
						System.out.println("Item Exist!");
						session.setAttribute("cartDetails", cartDetails);
						response.sendRedirect("home.jsp");
					}
				}
				if(exist == false) {
					cartDetails.add(cart);
					System.out.println("Item Added!");
					session.setAttribute("cartDetails", cartDetails);
					response.sendRedirect("home.jsp");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
