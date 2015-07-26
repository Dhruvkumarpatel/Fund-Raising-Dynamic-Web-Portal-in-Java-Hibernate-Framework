package hibernate_java_files;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageDonor {

		private static SessionFactory sessionFactory;
		
	
		public int addDonor(String dONOR_NAME, String dONOR_ADDRESS,String dONOR_DOB, int dONOR_AGE,
				String dONOR_PHONE, String dONOR_DETAILS, String uSER_ID)
		{
			
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx=null;
			
			int donor_id = 0;
			
			
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
				
				
				System.out.println("Error while adding Donor row: "+e);
			}
			
			
			return donor_id;
		}
		
		 @SuppressWarnings("deprecation")
			public List listDonor(){
				 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			      Session session = sessionFactory.openSession();
			      Transaction tx = null;
			      List users = null;
			      try{
			         tx = session.beginTransaction();
			         
			         
			         users = session.createQuery("FROM DONOR").list(); 
			        
			     
			        
			         tx.commit();
			      }catch (HibernateException e) {
			         if (tx!=null) tx.rollback();
			         e.printStackTrace(); 
			      }finally {
			         session.close(); 
			      }
			      
			      return users;
			   }
		 
		 
		 
		 
		 
		 public void updateDonor(List list,int donorid)
		 {
			 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		      Session session = sessionFactory.openSession();
		      Transaction tx = null;
		      List users = null;
		      try{
		         tx = session.beginTransaction();
		         
		         
		         Query query = session.createQuery("update DONOR set USER_ID=:userid,DONOR_NAME=:name, DONOR_ADDRESS=:address, DONOR_DOB=:dob, DONOR_AGE=:age,DONOR_PHONE=:phone,DONOR_DETAILS=:details where DONOR_ID=:donorid"); 
		        
		         String []values={"userid","name","address","dob","age","phone","details","donorid"};
		         
		         for(int i=0;i<list.size();i++)
		         {
		        	 if(i==4 || i==7)
		        	 {
		        		 query.setInteger(values[i],Integer.parseInt(list.get(i).toString()));
		        	 }
		        	 else
		        	 {
		        		 query.setString(values[i], list.get(i).toString());
		        	 }
		         }
		         
		         query.executeUpdate();
		        
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
			 
			 
			 
		 }
		
		
		
		
	}



