package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageOrgExpense {
	
	private static SessionFactory sessionFactory;
	
	public static void main(String args[])
	{
		
		
		try{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}catch(Exception e)
			{
				System.out.println("Failed to create sssion factory object : "+e);
			}
	
		ManageOrgExpense mr = new ManageOrgExpense();
		
		mr.addExpense("finance", "fundraising", "event", 12051993, 12012);
		
		
	}
	public String addExpense(String eXPENSE_TYPE, String eXPENSE_DETAILS, String eXPENSE_NAME,
			long eXPENSE_DATE, int oRG_ID)
	{
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
