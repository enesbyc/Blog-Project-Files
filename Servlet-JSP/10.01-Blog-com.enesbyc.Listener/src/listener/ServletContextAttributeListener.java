package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletContextAttributeListener implements javax.servlet.ServletContextAttributeListener {

   
    public ServletContextAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        System.out.println("Attribute Added");
    }

	
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        System.out.println("Attribute Remove");

    }

    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("Attribute Replace");

    }
	
}

