package ServletController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import hibernate_java_files.MAIN_MASTER;
import hibernate_java_files.ManageMain_Master;

/**
 * Servlet implementation class LoginPageServlet
 */
@WebServlet("/LoginPageServlet")
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPageServlet() {
        
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
		
		PrintWriter out = response.getWriter();  
		response.setContentType("text/html"); 
		String userId = request.getParameter("userId");
		
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(true);
		
		try{
			
			ManageMain_Master m = new  ManageMain_Master();
			
			List s =  (List) m.listUserse();
			MAIN_MASTER m1=null;
			for(int i=0;i<s.size();i++)
			{
				
				m1 = (MAIN_MASTER) s.get(i);
				if(m1.getUSER_ID().equals(userId))
				{
					break;
				}
			}
				String	usertype = m1.getUSER_TYPE();
			
				
				//firstname
				String fname = m1.getFNAME();
				
				request.setAttribute("FNAME", fname);
				
				request.setAttribute("USERID", userId);
				
				String lname = m1.getLNAME();
				
				request.setAttribute("LNAME", lname);
			
			boolean answer = m.checkPassword(userId, password);
			
			 if( m.checkPassword(userId, password) && usertype.equals("donor")){
				 
				 RequestDispatcher rd = request.getRequestDispatcher("/Donor.jsp");
				 rd.forward(request, response);
		//		 response.sendRedirect("Donor.jsp");
		
			 }
			 else if( m.checkPassword(userId, password) && usertype.equals("organization"))
			 {
				 
				 RequestDispatcher rd = request.getRequestDispatcher("Organization.jsp");
				 rd.forward(request, response);
			//	 response.sendRedirect("Organization.jsp");
			 }
			
			 else	 
			 {
				 
				
				 response.sendRedirect("login.jsp");
			 }
			
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
