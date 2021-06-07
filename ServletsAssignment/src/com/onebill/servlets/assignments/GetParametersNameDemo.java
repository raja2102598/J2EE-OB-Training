package com.onebill.servlets.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParametersNameDemo
 */
@WebServlet("/GetParametersNameDemo")
public class GetParametersNameDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public GetParametersNameDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<h2>Form Parameter Names<h2>");
		Enumeration<String> parameterNames = request.getParameterNames();
//		System.out.println(parameterNames);
		writer.print("<ul>");
		while (parameterNames.hasMoreElements()) {
			writer.print("<li>"+parameterNames.nextElement()+"</li>");
		}
		writer.print("</ul>");
		
	}

}
