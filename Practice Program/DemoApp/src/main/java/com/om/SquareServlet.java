package com.om;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
	/*
	 * This is use when we are working with RequestDispatcher.
		int k = (int)req.getAttribute("ans"); 
		
		int sqr = k*k; 
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+ sqr); */
		
		System.out.println("Square Called..");
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		int sqr = k*k; 
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+ sqr);
		
	}

}
