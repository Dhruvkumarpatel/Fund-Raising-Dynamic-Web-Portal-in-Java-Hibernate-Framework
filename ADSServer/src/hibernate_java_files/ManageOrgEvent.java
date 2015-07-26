package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageOrgEvent {
	
	private static SessionFactory sessionFactory;
	
	
	
	
	
	
	public String addEvent(String eVENT_NAME, String eVENT_TYPE, String eVENT_LOCATION,
			String eVENT_DATE, int oRG_ID)
	{
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx=null;
		
		int event_id;
		
		
		try{
			
			
			tx = session.beginTransaction();
			
			
			ORGANIZATION_EVENT oe = new ORGANIZATION_EVENT(eVENT_NAME, eVENT_TYPE, eVENT_LOCATION,
					eVENT_DATE, oRG_ID);
			
			event_id = (int) session.save(oe);
			
			System.out.println("Id :"+event_id);
			
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
