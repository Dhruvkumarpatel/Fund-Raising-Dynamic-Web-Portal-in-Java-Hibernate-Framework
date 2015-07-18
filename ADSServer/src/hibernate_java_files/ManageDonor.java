package hibernate_java_files;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageDonor {

		private static SessionFactory sessionFactory;
		
	
		public String addDonor(String dONOR_NAME, String dONOR_ADDRESS,String dONOR_DOB, int dONOR_AGE,
				String dONOR_PHONE, String dONOR_DETAILS, String uSER_ID)
		{
			
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx=null;
			
			int donor_id;
			
			
			try
			{
				tx = session.beginTransaction();
				
				DONOR d = new DONOR(dONOR_NAME, dONOR_ADDRESS,dONOR_DOB, dONOR_AGE, dONOR_PHONE, dONOR_DETAILS, uSER_ID);
				
				donor_id = (int) session.save(d);
				
				System.out.println("Id:"+donor_id);
				
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



