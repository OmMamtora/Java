package com.om;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Instead of writing code in web.xml file we have another option called Annotation.
//Here we are using Annotation.

@WebServlet("/add")

public class AddServlet extends HttpServlet
{
	// if we want to use method then it is compulsory to use method called service. 
	// we can not use any other method name it is compulsory to use service method name.
	
	// Service is method which is belong from SERVLET LIFE CYCLE 
	
	
	// Here by using object req we can fetch data from the client and by using res object we can send response to the client.
	
	// We have two more method get and post method, for use that method we can write doGet and doPost inplace of service method.
	
	/* public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {}
	   public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {}
	   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {} */
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//GetParameter accept only String value therefore here we have convert String into int by using ParseInt method.
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = number1 + number2;
		
		// Here System.out.println print data in console but we want that the answer display on webpage. Fot that we have getWriter() object 
		//System.out.println("Result is "+ sum);
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+ sum);
		
		res.getWriter().println("Result is "+ sum);
	
	}
}
