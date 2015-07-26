package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate_java_files.ManageOrgEvent;

/**
 * Servlet implementation class eventservlet
 */
@WebServlet("/eventservlet")
public class eventservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eventservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context = getServletContext();
		
		String eventname = request.getParameter("eventname");
		String eventtype = request.getParameter("eventtype");
		String location = request.getParameter("location");
		String eventdate = request.getParameter("eventdate");
		int org_id = Integer.parseInt(request.getParameter("orgid"));
		
		try{
			
			 ManageOrgEvent mg = new ManageOrgEvent();
			
			 mg.addEvent(eventname, eventtype, location,eventdate,org_id);
			
			 RequestDispatcher dispatcher = context.getRequestDispatcher("/Event.jsp");
             dispatcher.forward(request,response);
			
			
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
		
	}

}
