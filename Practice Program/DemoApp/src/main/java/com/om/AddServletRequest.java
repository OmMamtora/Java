package com.om;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/squ")
public class AddServletRequest extends HttpServlet {
	

	//Here we are calling one servlet to another servlet by using RequestDispatcher.
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			//GetParameter accept only String value therefore here we have convert String into int by using ParseInt method.
			
			int number1 = Integer.parseInt(req.getParameter("num1"));
			int number2 = Integer.parseInt(req.getParameter("num2"));
			
			int sum = number1 + number2;
			
			
	//Here we are using RequestDispatcher.
			//Finding Square of sum.
			
			/*req.setAttribute("ans", sum);
			
			//TO call one servlet to another servlet we have two options - RequestDispatcher and Redirect.
			RequestDispatcher rd = req.getRequestDispatcher("square");
			rd.forward(req, res);*/
			
	// Here we are going to use another method called SENDREDIRECT.
			res.sendRedirect("square?k="+sum);
			
			
			
			
			
}
}
