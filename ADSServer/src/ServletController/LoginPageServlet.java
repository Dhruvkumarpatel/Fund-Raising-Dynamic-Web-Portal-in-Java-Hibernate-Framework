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

import hibernate_java_files.DONOR;
import hibernate_java_files.MAIN_MASTER;
import hibernate_java_files.ManageDonor;
import hibernate_java_files.ManageMain_Master;
import hibernate_java_files.ManageOrganization;
import hibernate_java_files.ORGANIZATION;

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
			ManageDonor md =new ManageDonor();
			ManageOrganization mo =new ManageOrganization();
			List s =  (List) m.listUserse();
			List donor = (List)md.listDonor();
			List o =(List)mo.listOrganization();
			
			MAIN_MASTER m1=null;
			DONOR d=null;
			ORGANIZATION org=null;
			
			
			for(int i=0;i<s.size();i++)
			{
				
				m1 = (MAIN_MASTER) s.get(i);
				
				if(m1.getUSER_ID().equals(userId))
				{
					break;
				}
				
			
			}
			
			
			
			
			
			
			
			
				String	usertype = m1.getUSER_TYPE();
			
				
				int indexid= m1.getID_INDEX();
				
				//firstname
				String fname = m1.getFNAME();
				
				request.setAttribute("INDEXID", indexid);
				
				request.setAttribute("FNAME", fname);
				
				request.setAttribute("USERID", userId);
				
				String lname = m1.getLNAME();
				
				request.setAttribute("LNAME", lname);
				request.setAttribute("PASSWORD", m1.getPASSWORD());
				request.setAttribute("REPASSWORD", m1.getPASSWORD());
				
				request.setAttribute("EMAIL", m1.getEMAIL_ID());
			
			boolean answer = m.checkPassword(userId, password);
			
			 if( m.checkPassword(userId, password) && usertype.equals("donor")){
				 
				 for(int i=0;i<donor.size();i++)
					{
						d =(DONOR)donor.get(i);
						
						if(d.getUSER_ID().equals(userId))
							break;
					}
				 
					request.setAttribute("DONORID", d.getDONOR_ID());
				 request.setAttribute("DOB", d.getDONOR_DOB());
					request.setAttribute("AGE", d.getDONOR_AGE());
					request.setAttribute("DETAILS", d.getDONOR_DETAILS());
					request.setAttribute("PHONE",d.getDONOR_PHONE());
					request.setAttribute("ADDRESS", d.getDONOR_ADDRESS());
				 
				 
			//	 JOptionPane.showMessageDialog(null,"You are successfully SignIn ", "Success", JOptionPane.ERROR_MESSAGE);
				 RequestDispatcher rd = request.getRequestDispatcher("Donor.jsp");
				 rd.forward(request, response);
		//		 response.sendRedirect("Donor.jsp");
		
			 }
			 else if( m.checkPassword(userId, password) && usertype.equals("organization"))
			 {
				 
				 for(int i=0;i<o.size();i++)
					{
						org =(ORGANIZATION)o.get(i);
						
						if(org.getUSER_ID().equals(userId))
							break;
					}
				request.setAttribute("ORGID", org.getORG_ID());
				 request.setAttribute("NOE", org.getTOTAL_EMPLOYEE());
				 request.setAttribute("WEBSITE", org.getORG_WEBSITE());
				 request.setAttribute("STATUS", org.getORG_STATUS());
				 request.setAttribute("GOALS", org.getORG_GOALS());
					request.setAttribute("DETAILS", org.getORG_DETAILS());
					request.setAttribute("PHONE",org.getORG_PHONE());
					request.setAttribute("ADDRESS", org.getORG_ADDRESS());
					request.setAttribute("TYPE", org.getORG_TYPE());
				 
			//	 JOptionPane.showMessageDialog(null,"You are successfully SignIn ", "Success", JOptionPane.ERROR_MESSAGE);
				 RequestDispatcher rd = request.getRequestDispatcher("Organization.jsp");
				 rd.forward(request, response);
			//	 response.sendRedirect("Organization.jsp");
			 }
			
			 else	 
			 {
				 
				
			//	 JOptionPane.showMessageDialog(null,"Please Enter Correct Username & Password Field ", "Error", JOptionPane.ERROR_MESSAGE);
				 
				 response.sendRedirect("login.jsp");
				 
				 
			 }
			
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
