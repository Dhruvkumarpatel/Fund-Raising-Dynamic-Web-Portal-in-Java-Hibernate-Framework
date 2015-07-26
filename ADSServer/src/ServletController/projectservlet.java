package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate_java_files.ManageProject;

/**
 * Servlet implementation class projectservlet
 */
@WebServlet("/projectservlet")
public class projectservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public projectservlet() {
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
		
		String projecttype = request.getParameter("projecttype");
		String projectdetails = request.getParameter("projectdetails");
		String projectname = request.getParameter("projectname");
		int org_id = Integer.parseInt(request.getParameter("orgid"));
		
		
		try{
			
			ManageProject mp = new ManageProject();
			mp.addProject(projectname, projecttype, projectdetails, org_id);
			

			 RequestDispatcher dispatcher = context.getRequestDispatcher("/Project.jsp");
            dispatcher.forward(request,response);
			
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
