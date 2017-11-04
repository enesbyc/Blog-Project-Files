package servletcontext;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadPropertiesServlet")
public class ReadPropertiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext servletContext=getServletContext();
		InputStream inputStream=servletContext.getResourceAsStream("db.properties");
		Properties properties=new Properties();
		properties.load(inputStream);
		
		PrintWriter writer=response.getWriter();
		writer.write(properties.getProperty("username"));
		writer.write(properties.getProperty("password"));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}


