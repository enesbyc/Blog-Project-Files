package com.enesbyc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enesbyc.dao.ComputerDao;
import com.enesbyc.model.Computer;


@WebServlet("/ComputerServlet")
public class ComputerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		ComputerDao computerDao=new ComputerDao();
		ArrayList<Computer> computerlist=computerDao.getComputerFromByID(id);
		request.setAttribute("computerlist", computerlist);
		request.getRequestDispatcher("/computer.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
