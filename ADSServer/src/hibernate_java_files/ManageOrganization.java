package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageOrganization {

	
	private static SessionFactory sessionFactory;
	
	public static void main(String args[])
	{
		
		
		try{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}catch(Exception e)
			{
				System.out.println("Failed to create sssion factory object : "+e);
			}
		
		
		ManageOrganization mo = new ManageOrganization();
		
		mo.addOrganization("wright", "active", 20 , "smart work", "good", "xyz", "92515", "www.wright", "Dhruv", "dayton"); 
		
		
		
	}
	
	
	
	
	public String addOrganization(String oRG_NAME, String oRG_TYPE, int tOTAL_EMPLOYEE, String oRG_GOALS,
			String oRG_DETAILS, String oRG_STATUS, String oRG_PHONE, String oRG_WEBSITE, String uSER_ID,
			String oRG_ADDRESS)
	{
		
		Session session = sessionFactory.openSession();
		Transaction tx=null;
		
		int org_id;
		
		try{
			
			tx = session.beginTransaction();
			
			
			
			ORGANIZATION org = new ORGANIZATION(oRG_NAME,oRG_TYPE,tOTAL_EMPLOYEE,oRG_GOALS, oRG_DETAILS, oRG_STATUS, oRG_PHONE, oRG_WEBSITE, uSER_ID, oRG_ADDRESS);
			
			org_id = (int) session.save(org);
			System.out.println("Id: "+ org_id);
			tx.commit();
			session.close();
			
		}catch(Exception e)
		{
			System.out.println("Error while adding Organization row: "+e);
		}
		
		
		
		
		return null;
		
	}
	
	
	
	
}
