package hibernate_java_files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageProjectFunding {
	
	
	
	private static SessionFactory sessionFactory;
	
	

	public static void main(String args[])
	{
		try{
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}catch(Exception e)
			{
				System.out.println("Failed to create sssion factory object : "+e);
			}
		
		ManageProjectFunding mp = new ManageProjectFunding();
		
		mp.addProjectFunding(12029,12024, 11051993, 1000, 1500);
		
	}
	
	
	
	public String addProjectFunding(int pROJECT_ID, int dONATION_ID, long dATE_OF_FUNDING, int aMOUNT, int tOTAL_AMOUNT)
	{
		
		Session session = sessionFactory.openSession();
		
		Transaction tx;
		
		int index_id;
		
		try{
			
			tx = session.beginTransaction();
			
			PROJECT_FUNDING pf = new PROJECT_FUNDING(pROJECT_ID, dONATION_ID, dATE_OF_FUNDING, aMOUNT, tOTAL_AMOUNT);
			
			index_id = (int) session.save(pf);
			
			System.out.println("Id :"+index_id);
			
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
