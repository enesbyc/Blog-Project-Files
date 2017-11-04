package jspkullanimi;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student1=new Student("Enes","Boyaci");
		Student student2=new Student("Ekrem","Boyaci");
		Student student3=new Student("Emre","Boyaci");
		ArrayList<Student> list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		request.setAttribute("studentlist", list);
		getServletContext().getRequestDispatcher("/studentlist.jsp").forward(request, response);
		
	}

}




