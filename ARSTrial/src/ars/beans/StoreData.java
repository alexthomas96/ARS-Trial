package ars.beans;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class StoreData 
{    
	public static void main(String[] args) throws Exception 
	{    
        
		//Create typesafe ServiceRegistry object    
		/*StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
   		  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		 */
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); //load file into memory (or) find existence of file
		SessionFactory factory = cfg.buildSessionFactory();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
       /*     
		PersonalDetails pd = new PersonalDetails();
		pd.setAgeGroup(ars.enums.ageGroup.Adult);
		pd.setFirstName("Alex");
		pd.setIdNo("AA1123");
		pd.setIdType(ars.enums.idType.Aadhar_Card);
		pd.setLastName("Thomas");
		pd.setSex(ars.enums.sex.Female);
		*/
		/*
		Account ac = new Account();
		ac.setBalance(25500);
		ac.setBank(ars.enums.bank.AXIS);
		ac.setCardNo(new Long(112345));
		ac.setCardType(ars.enums.cardType.Credit);
		ac.setCvv(223);
		ac.setNetID(new Long(112233));
		ac.setNetPass("admin");
		ac.setPaymentPlatform(ars.enums.paymentPlatform.Mastercard);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	    Date parsedDate = dateFormat.parse("2018-12-12 11:11:11.555");
		ac.setExpiryDate(new java.sql.Timestamp(parsedDate.getTime()));
		*/
		/*
	   List l = new ArrayList<String>();
	    l.add("Trial");
	    l.add("Hope it works");*/
		User u = new User();
		u.setPassword("admin");
		u.setUsername("alex");
		u.setUserType(ars.enums.user.Admin);
		u.setAccountLinkID(new Long(1));
		u.setDetailsLinkID(new Long(1));
		//u.setTickets(l);
    	// session.persist(e1);  
    	
    	session.save(u);
    	
    	t.commit();  
    	System.out.println("Successfully Shaved");    
    	factory.close();  
    	session.close();    
        
	}    
}   