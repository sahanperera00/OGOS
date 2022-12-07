package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.crud.CustomerCRUD;

@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String houseno = request.getParameter("houseno");
		String lanename = request.getParameter("lanename");
		String streetname = request.getParameter("streetname");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		try {
			boolean isTrue = CustomerCRUD.createCustomer(title, fname, lname, houseno, lanename, streetname, city, email, password, phone);
			
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
				dis.forward(request, response);
			}else {
				RequestDispatcher dis2 = request.getRequestDispatcher("index.jsp");
				dis2.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
