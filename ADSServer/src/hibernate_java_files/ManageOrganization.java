package hibernate_java_files;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageOrganization {

	
	private static SessionFactory sessionFactory;
	
	
	
	
	
	
	public int addOrganization(String oRG_NAME, String oRG_TYPE, int tOTAL_EMPLOYEE, String oRG_GOALS,
			String oRG_DETAILS, String oRG_STATUS, String oRG_PHONE, String oRG_WEBSITE, String uSER_ID,
			String oRG_ADDRESS)
	{
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx=null;
		
		int org_id = 0;
		
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
		
		
		
		
		return org_id;
		
	}
	
	
	 @SuppressWarnings("deprecation")
		public List listOrganization(){
			 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		      Session session = sessionFactory.openSession();
		      Transaction tx = null;
		      List users = null;
		      try{
		         tx = session.beginTransaction();
		         
		         
		         users = session.createQuery("FROM ORGANIZATION").list(); 
		        
		     
		        
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      
		      return users;
		   }
	
	 @SuppressWarnings("deprecation")
		public int getOrganizationId(String uid){
			 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		      Session session = sessionFactory.openSession();
		      Transaction tx = null;
		      List users = null;
		      int orgid=0;
		      try{
		         tx = session.beginTransaction();
		         
		         
		         Query query = session.createQuery("FROM ORGANIZATION WHERE USER_ID=:uid"); 
		        
		         query.setString("uid",uid);
		         users = query.list();
		         
		         if(users.size()!=0)
		         {
		        	 ORGANIZATION org = (ORGANIZATION)users.get(0);
		        	 orgid = org.getORG_ID();
		         }
		     
		        
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      
		      return orgid;
		   }
	
	
	 public int updateOrganization(List list){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      List users = null;
	      int orgid=0;
	      try{
	         tx = session.beginTransaction();
	         
	         Query query = session.createQuery("update ORGANIZATION set USER_ID=:userid,ORG_NAME=:name, ORG_ADDRESS=:address, ORG_TYPE=:orgtype, TOTAL_EMPLOYEE=:totalemp,ORG_PHONE=:phone,ORG_DETAILS=:details,ORG_GOALS=:goals,ORG_STATUS=:status,ORG_WEBSITE=:website where ORG_ID=:orgid"); 
		        
	         String []values={"userid","name","address","orgtype","totalemp","phone","details","goals","status","website","orgid"};
	         
	         for(int i=0;i<list.size();i++)
	         {
	        	 System.out.println("Dhruv.....: "+list.get(i));
	        	 if(i==4 || i==10)
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
	      
	      return orgid;
	   }
	
	
	
}
