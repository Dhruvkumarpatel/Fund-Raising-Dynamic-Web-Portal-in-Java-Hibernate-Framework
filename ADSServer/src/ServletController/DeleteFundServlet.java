package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate_java_files.ManageFund;

/**
 * Servlet implementation class DeleteFund
 */
@WebServlet("/DeleteFundServlet")
public class DeleteFundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFundServlet() {
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
		
		
		try
		{
		String values[] = request.getParameterValues("fund");
		String orgid =request.getParameter("org_id");
		String fname =request.getParameter("fname");
		String lname =request.getParameter("lname");
		
		System.out.println("Hiiiiiii.............."+orgid+"....."+fname+"....."+lname);
		ManageFund mf =new ManageFund();
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
			mf.deleteFund(Integer.parseInt(values[i]));
		}
		
		
		response.sendRedirect("Fund.jsp?orgid="+orgid+"&fname=+"+fname+"&lname="+lname);
	//	 rd.forward(request, response);
		 
		}catch(Exception e){
			System.out.println("Exception occured: ");
			e.printStackTrace();
		}
	}

}
