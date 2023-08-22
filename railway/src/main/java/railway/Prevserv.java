package railway;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import railway.Ticket;
import java.io.IOException;


public class Prevserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Ser ss=new Ser();
		ss.meth();
		System.out.println("coonection established");
		
		Ticket t=(Ticket)request.getParameter("Tic");
	}

	

}
