package railway;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dup4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String tlist = request.getParameter("tlist");
		String clas = request.getParameter("clas");
		
		System.out.println("From: " + from);
		System.out.println("To: " + to);
		System.out.println("Tlist: " + tlist);
		System.out.println("Clas: " + clas);

		
		//String dat = request.getParameter("dat");
		String[] name = request.getParameterValues("Name");
		String[] age = request.getParameterValues("Age");
		String[] gender = request.getParameterValues("Gender");
		// System.out.println(name[1] + " " + age[1] + " " + gender[1]);
		Ser cn = new Ser();
		Ticket tt = cn.meth3( from, to,tlist, clas, name, age, gender);
		System.out.println(tt.getTname());
		request.setAttribute("ticket", tt);
		//
		request.getRequestDispatcher("/prev.jsp").include(request, response);
		// request.getRequestDispatcher("/LastBookSer").include(request, response);
	}

	

}
