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

/**
 * Servlet implementation class Update_servlet
 */
@WebServlet("/Update_servlet")
public class Update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_servlet() {
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
		String Repassword = request.getParameter("Repassword");
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String date = request.getParameter("date");
		int age = Integer.parseInt(request.getParameter("age"));
		String phone = request.getParameter("phone");
		String details = request.getParameter("details");
		String donorid =request.getParameter("donorid");
		
		String donorname = fname+" "+lname;
		
		try{
			System.out.println("Hiiim..............................................");
			ManageDonor md = new ManageDonor();
			ManageMain_Master m3 = new ManageMain_Master();
			
	//		String query = "update MAIN_MASTER set USER_ID =:userid, PASSWORD =:password,EMAIL_ID =:email, FNAME =:fname, LNAME =:lname where USER_ID =:oldUserId";
			
		ArrayList<String> param = new ArrayList<String>();
			param.add(userid);
			param.add(password);
			param.add(email);
			param.add(fname);
			param.add(lname);
			param.add(oldUserId);
			
			
		/*	System.out.println(query);
			
		*/
			m3.updateUser(indexid,param);
			
			
		
			List list = new ArrayList();
			
			list.add(userid);
			list.add(donorname);
			list.add(address);
			list.add(date);
			list.add(age);
			list.add(phone);
			list.add(details);
			list.add(donorid);
			md.updateDonor(list,Integer.parseInt(donorid));
			
			System.out.println("hohhohohohoho");
			
			
			
			 RequestDispatcher rd = request.getRequestDispatcher("UpdateDonorProfile.jsp?userid="+userid+"&password="+password+"&repassword="+Repassword+"&fname="+fname+"&lname="+lname+"&email="+email+"&address="+address+"&dob="+date+"&age="+age+"&phone="+phone+"&details="+details);
			 rd.forward(request, response);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}

}
