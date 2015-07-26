package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dhruv.emailutility;



/**
 * Servlet implementation class emailservlet
 */
@WebServlet("/emailservlet")
public class emailservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String host;
	private String port;
	private String user;
	private String pass;
	
	
	public void init()
	{
		ServletContext context  = getServletContext();
		
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user =context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
   

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
		
		String recipient = request.getParameter("recipient");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		try{
			
			
			
			emailutility.sendEmail(host, port, user, pass, recipient, subject, content);
			
			
			
			
			System.out.println("email has been sent successfully");
			
			RequestDispatcher rd = request.getRequestDispatcher("email.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
	}

}
