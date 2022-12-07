package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.oop.model.Customer;
import com.oop.model.Item;
import com.oop.crud.CustomerCRUD;
import com.oop.crud.ItemCRUD;
import com.oop.utility.ValidateCustomer;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			boolean isTrue = ValidateCustomer.validate(email, password);
			
			if(isTrue == true) {
				HttpSession session = request.getSession();
				Customer cusDetails = CustomerCRUD.getCustomer(email);
				session.setAttribute("cusDetails", cusDetails);
				
				List<Item> itemDetails = ItemCRUD.readallitems();
				session.setAttribute("itemDetails", itemDetails);
				
				response.sendRedirect("home.jsp");
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Your username or password is incorrect');");
				out.println("location='login.jsp'");
				out.println("</script>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}