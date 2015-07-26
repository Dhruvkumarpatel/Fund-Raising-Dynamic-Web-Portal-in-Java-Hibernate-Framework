package ServletController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate_java_files.ManageDonor;
import hibernate_java_files.ManageMain_Master;
import hibernate_java_files.ManageOrganization;

/**
 * Servlet implementation class Update_servlet
 */
@WebServlet("/UpdateOrganization_servlet")
public class UpdateOrganization_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOrganization_servlet() {
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
		PrintWriter out = response.getWriter();
		String oldUserId=request.getParameter("oldUserId");
		int indexid = Integer.parseInt(request.getParameter("indexid"));
		String userid = request.getParameter("userId");
		String password = request.getParameter("password");
		String repassword = request.getParameter("Repassword");
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String website = request.getParameter("website");
		int noofemp = Integer.parseInt(request.getParameter("noofemployee"));
		String orgtype = request.getParameter("orgtype");
		String details = request.getParameter("details");
		String phone = request.getParameter("phone");
		
		String status = request.getParameter("status");
		String goals = request.getParameter("goals");
		String orgid = request.getParameter("orgid");
		
		
		
		
		String organizationname = fname+" "+lname;
		
		try{
			System.out.println("Hiiim..............................................");
			ManageOrganization md = new ManageOrganization();
			ManageMain_Master m3 = new ManageMain_Master();
			
	//		String query = "update MAIN_MASTER set USER_ID =:userid, PASSWORD =:password,EMAIL_ID =:email, FNAME =:fname, LNAME =:lname where USER_ID =:oldUserId";
			
		ArrayList<String> param = new ArrayList<String>();
			param.add(userid);
			param.add(password);
			param.add(email);
			param.add(fname);
			param.add(lname);
			param.add(oldUserId);
			
			
		
			m3.updateUser(indexid,param);
			
			List list = new ArrayList();
			
			list.add(userid);
			list.add(fname+" "+lname);
			list.add(address);
			list.add(orgtype);
			list.add(noofemp);
			list.add(phone);
			list.add(details);
			list.add(goals);
			list.add(status);
			list.add(website);
			list.add(orgid);
		
			md.updateOrganization(list);
			
			System.out.println("hohhohohohoho");
			
		 RequestDispatcher rd = request.getRequestDispatcher("UpdateOrganizationProfile.jsp?type="+orgtype+"&repassword="+repassword+"&password="+password+"&address="+address+"&phone="+phone+"&details="+details+"&goals="+goals+"&status="+status+"&website="+website+"&noofemp="+noofemp+"&fname="+fname+"&lname="+lname+"&email="+email+"&userid="+userid+"&indexid="+indexid);
		 rd.forward(request, response);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
