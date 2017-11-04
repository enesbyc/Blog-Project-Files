package com.enesbyc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.enesbyc.dao.LessonDao;
import com.enesbyc.model.Lesson;

@WebServlet("/LessonServlet")
public class LessonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LessonDao lessonDao=new LessonDao();
		ArrayList<Lesson> lessonlist=lessonDao.getLessonList();
		request.setAttribute("lessonlist", lessonlist);
		request.getRequestDispatcher("/showlesson.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
