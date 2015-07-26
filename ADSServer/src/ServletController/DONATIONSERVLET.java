package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hibernate_java_files.ManageDonation;
import hibernate_java_files.ManageFund;

/**
 * Servlet implementation class DONATIONSERVLET
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/DONATIONSERVLET" })
public class DONATIONSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DONATIONSERVLET() {
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
		
		
		String donationtype = request. getParameter("donationType");
		String date = request.getParameter("date");
		int amount = Integer.parseInt(request.getParameter("amount"));
		int orgid = Integer.parseInt(request.getParameter("org_id"));
		int donor_id = Integer.parseInt(request.getParameter("donor_id"));
		
		HttpSession session = request.getSession(true);
		try{
			
			ManageDonation md = new ManageDonation();
			
			md.addDonation(donationtype, date, orgid, donor_id);
			
			ManageFund mf = new ManageFund();
			
			
			
			
			
			mf.addFund(amount,orgid);
			
	
			
			
			System.out.println("herre you go");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("Donation.jsp");
		 rd.forward(request, response);
		
		
	}

}
