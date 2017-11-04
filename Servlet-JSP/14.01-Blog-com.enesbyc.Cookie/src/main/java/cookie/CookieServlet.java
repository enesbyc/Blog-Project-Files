package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie userCookie=new Cookie("userCookie", "enesbyc");
		Cookie passwordCookie=new Cookie("passwordCookie", "123456");
		Cookie tryCookie=new Cookie("tryCookie", "tryCookie");
		
		//tryCookie oluþturuldak 10 saniye sonra silinecektir.
		tryCookie.setMaxAge(10);
		
		response.addCookie(userCookie);
		response.addCookie(passwordCookie);
		response.addCookie(tryCookie);
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
