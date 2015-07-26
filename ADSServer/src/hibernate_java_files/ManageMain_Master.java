package hibernate_java_files;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageMain_Master {

	private static SessionFactory sessionFactory;

	
	private static int id_index;
	


	@SuppressWarnings("deprecation")
	public int adduser(String uSER_ID, String pASSWORD, String uSER_TYPE, String eMAIL_ID, String fNAME,
			String lNAME)
	{

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx=null;

		

		try{

			tx = session.beginTransaction();


			MAIN_MASTER m = new MAIN_MASTER(uSER_ID, pASSWORD, uSER_TYPE, eMAIL_ID, fNAME,
					lNAME);

			id_index = (int)session.save(m);

			System.out.println("Id : "+id_index);

			tx.commit();

			session.close();

		}

		catch(Exception e)
		{

			System.out.println("error while adding user:"+e);
		}


		return id_index;
	}
	
	
	
	////////////////////////////////////////List Details//////////////////////////////////////////////////////////////
	
	 @SuppressWarnings("deprecation")
	public List listUserse( ){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      List users = null;
	      try{
	         tx = session.beginTransaction();
	         
	         
	         users = session.createQuery("FROM MAIN_MASTER").list(); 
	         
	     
	        
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      
	      return users;
	   }
	
	 public void deleteusers(int idindex){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         MAIN_MASTER m3 = 
	                   (MAIN_MASTER)session.get(MAIN_MASTER.class,idindex); 
	         session.delete(m3); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	 
	 
	 public void updateUser(int indexid,ArrayList<String> param){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	      Session session = sessionFactory.openSession();
	      
	      
	      Transaction tx = null;
	      
	      MAIN_MASTER m3 = null;
	      
	      try{
	         
	    	  tx = session.beginTransaction();
	    	  
	    	  
	    	  m3 = (MAIN_MASTER) session.get(MAIN_MASTER.class, indexid);
	    	  
	    	  m3.setUSER_ID( param.get(0));
	    	  m3.setPASSWORD(param.get(1));
	    	  m3.setEMAIL_ID(param.get(2));
	    	  m3.setFNAME(param.get(3));
	    	  m3.setLNAME(param.get(4));
	    	  
	         session.update(m3);
	         tx.commit();
	       //  Query query = session.createQuery("update MAIN_MASTER set USER_ID =:userid,PASSWORD =:password,EMAIL_ID =:email,FNAME =:fname, LNAME =:lname where USER_ID =:oldUserId");
	         
	     /*    for(int i=0;i<param.size();i++)
	         {
	        	 System.out.println(param.get(i));
	         }
	         query.setParameter("userid", param.get(0));
	         query.setParameter("password", param.get(1));
	         query.setParameter("email", param.get(2));
	         query.setParameter("fname", param.get(3));
	         query.setParameter("lname", param.get(4));
	         query.setParameter("oldUserId", param.get(5));
	         
	     
	         System.out.println("therehere....................");
			int temp = query.executeUpdate();
			System.out.println("here...................."+temp);
			tx.commit(); */
	      
	      }catch (HibernateException e) {
	        System.out.println("Exception ...... "+e);
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	
	 @SuppressWarnings("deprecation")
	public boolean checkPassword(String userId,String enterpassword){
		 sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      Session session = sessionFactory.openSession();
	      List list= null;
	      Transaction tx = null;
	      MAIN_MASTER m3=null;
	      
	      try{
	    	  
	    	  String hqlQuery = "select PASSWORD from MAIN_MASTER where USER_ID= :UserId";
	    	  Query query = session.createQuery(hqlQuery);	
	    	  
	    	  query.setString("UserId",userId);
	    	  tx = session.beginTransaction();
	         
	         	 list= query.list();
	         	
	         	if(list.size()==0)
	         		return false;
		
	         tx.commit();
	      }catch (HibernateException e) {
	    	  
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	         
	      }finally {
	         session.close(); 
	      }
	      
	      return enterpassword.equals(list.get(0).toString()) ?  true :  false;
	   }
	

}
	
	
	
	
	
	
	
	
	
	






