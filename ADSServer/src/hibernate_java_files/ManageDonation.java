package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageDonation {
	
	private static SessionFactory sessionFactory;
	
	
	
	
	public String addDonation(String dONATION_TYPE, String dATE_OF_DONATION, int oRG_ID, int dONOR_ID)
	{
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx;
		
		try{
			
			
			tx = session.beginTransaction();
			
			int donation_id;
			
			DONATION d1 = new DONATION(dONATION_TYPE, dATE_OF_DONATION, oRG_ID, dONOR_ID);
			
			donation_id = (int) session.save(d1);
			
			System.out.println("Id :"+donation_id);
			
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
