package ServletController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate_java_files.ManageOrgExpense;

/**
 * Servlet implementation class expenseservlet
 */
@WebServlet("/expenseservlet")
public class expenseservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public expenseservlet() {
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
		
		String expensetype = request.getParameter("expensetype");
		String expensedetails = request.getParameter("expensedetails");
		String expensename = request.getParameter("expensename");
		String expensedate = request.getParameter("expensedate");
		int org_id = Integer.parseInt(request.getParameter("orgid"));
		
		try{
			
			ManageOrgExpense mo = new ManageOrgExpense();
			
			mo.addExpense(expensetype, expensedetails, expensename, expensedate, org_id);
			
			
			 RequestDispatcher dispatcher = context.getRequestDispatcher("/Expense.jsp");
             dispatcher.forward(request,response);
			
			
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}

}
