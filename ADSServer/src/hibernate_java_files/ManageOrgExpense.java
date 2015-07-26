package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageOrgExpense {
	
	private static SessionFactory sessionFactory;
	
	
	public String addExpense(String eXPENSE_TYPE, String eXPENSE_DETAILS, String eXPENSE_NAME,
			String eXPENSE_DATE, int oRG_ID)
	{
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx=null;
		
		int expense_id;
		
		try
		{
			tx = session.beginTransaction();
			
			ORGANIZATION_EXPENSE oe = new ORGANIZATION_EXPENSE(eXPENSE_TYPE, eXPENSE_DETAILS, eXPENSE_NAME, eXPENSE_DATE, oRG_ID);
			
			expense_id = (int) session.save(oe);
			
			tx.commit();
			
			session.close();
			
			
			
		}
		catch(Exception e)
		{
			
			System.out.println("Error while adding Organization row: "+e);
			
			
		}
		
		
		
		
		
		return null;
	}
	
	

}
