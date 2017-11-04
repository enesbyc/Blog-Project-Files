package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kontrolservlet")
public class KontrolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sayfa=request.getParameter("deger");
		if(sayfa.equals("Gida"))
		{
			request.getRequestDispatcher("Gida").forward(request, response);
		}
		else if(sayfa.equals("Giyim"))
		{
			request.getRequestDispatcher("Giyim").forward(request, response);

		}
	}

}



