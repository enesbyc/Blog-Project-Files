package scope;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/KullaniciGirisServlet")
public class KullaniciGirisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public KullaniciGirisServlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kullaniciadi=request.getParameter("kullaniciadi");
		String sifre=request.getParameter("sifre");
		
		if(kullaniciadi.equals("enesbyc")&&sifre.equals("12345"))
		{
			request.getSession().setAttribute("kullaniciadi", kullaniciadi);
			request.getSession().setAttribute("sifre", sifre);
			response.sendRedirect("basariligiris.jsp");
		}
		else
		{
			response.getWriter().write("Girilen bilgiler yanlýþ.");
		}

	}

}
