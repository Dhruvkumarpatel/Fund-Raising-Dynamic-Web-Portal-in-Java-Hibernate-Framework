package hibernate_java_files;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageFund {

	private static SessionFactory sessionFactory;
	
	
	static int totalfundamount;
	
	public String addFund(int fUND_AMOUNT,int oRG_ID)
	{
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx=null;
		
		int fund_id;
		
		
		 totalfundamount = totalfundamount + fUND_AMOUNT;
		
		try
		{
			tx = session.beginTransaction();
			
			FUND f = new  FUND(fUND_AMOUNT,oRG_ID);
			
			fund_id = (int) session.save(f);
			
			System.out.println("Id:"+fund_id);
			
			
			
			tx.commit();
			
			session.close();
			
			
			
		}
		catch(Exception e)
		{
			
			
			System.out.println("Error while adding Organization row: "+e);
		}
		
		
		return null;
	}
	
	 @SuppressWarnings("deprecation")
		public List listFund(){
			 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		      Session session = sessionFactory.openSession();
		      Transaction tx = null;
		      List users = null;
		      try{
		         tx = session.beginTransaction();
		         
		         
		         users = session.createQuery("FROM FUND").list(); 
		        
		     
		        
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      
		      return users;
		   }
	
	 
	 
	 public int getTotalFund(String orgid){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      List users = null;
	     int totalAmount=0;
	      try{
	         tx = session.beginTransaction();
	         
	         
	         Query query = session.createQuery("SELECT sum(FUND_AMOUNT) FROM FUND WHERE ORG_ID=:orgid GROUP BY ORG_ID"); 
	         query.setString("orgid", orgid);
	        
	         
	         if(query.list().size()>0)
	          totalAmount =Integer.parseInt(query.list().get(0).toString());
	         
	        
	         
	     
	        
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      
	      return totalAmount;
	   }
	 
	 public List getAllFund(String orgid){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      List users = null;
	     int totalAmount=0;
	      try{
	         tx = session.beginTransaction();
	         
	         
	         Query query = session.createQuery("FROM FUND WHERE ORG_ID=:orgid"); 
	         query.setString("orgid", orgid);
	        
	         
	         if(query.list().size()!=0)
	         {
	          users =query.list();
	         }
	         else
	         {
	        	 users =new ArrayList();
	         }
	        
	         System.out.println(users.size());
	     
	        
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      
	      return users;
	   }
	
	public void deleteFund(int fundid){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      List users = null;
	     int totalAmount=0;
	      try{
	         tx = session.beginTransaction();
	         
	         
	         Query query = session.createQuery("DELETE FROM FUND WHERE FUND_ID=:orgid"); 
	         query.setInteger("orgid", fundid);
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
