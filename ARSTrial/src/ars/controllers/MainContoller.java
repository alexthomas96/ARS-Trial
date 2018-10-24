package ars.controllers;

import ars.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ars.models.*;
import ars.enums.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.persistence.TypedQuery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;  
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
@Controller
public class MainContoller 
{
	@Autowired
	
	@RequestMapping(value= {"/login", "/exit"})  
    public ModelAndView redirectToMain(){  
		return new ModelAndView("login","command",new Login());  
    }
	
	@RequestMapping(value = "/logincontrol", method = RequestMethod.GET) 
	public String loginControlGet(Login loginModel) { 
	    return "logincontrol"; 
	}
	
	@RequestMapping(value = "/logincontrol", method = RequestMethod.POST)
    public ModelAndView loginControlPost(@ModelAttribute("login") Login login, HttpServletRequest request, HttpSession session)
	{  
			StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session s=factory.openSession();  
		        
		    TypedQuery query=s.createQuery("from User");    
		    List<User> list=query.getResultList();   
		    boolean flag = false;
		    java.lang.Long userID = null;
		    Iterator<User> itr=list.iterator(); 
		    User user = new User();
		    while(itr.hasNext() && flag==false)
		    {    
		        user=itr.next();    
		        if(user.getUsername().equals(login.getUsername()) && user.getPassword().equals(login.getPassword()))   
		        	flag=true;
		    }
		    if(flag == true)
		    {
		    	session.setAttribute("message", "success");
		    	return new ModelAndView("dashboard","data",user);
		    }
		    else
		    {
		    	session.setAttribute("message", "fail");
		    	return new ModelAndView("login","command",new Login());
		    }
    } 
	
	@RequestMapping("/createRedirect")  
    public ModelAndView RedirectToCreation(){  
		return new ModelAndView("user","command",new Login());  
    }
	
	@RequestMapping(value = "/createUser", method = RequestMethod.GET) 
	public String createUserGet(Login loginModel) { 
	    return "createUser"; 
	}
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ModelAndView createUserPost(@ModelAttribute("login") Login login, HttpServletRequest request, HttpSession session)
	{
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session s=factory.openSession();  
       
        Transaction t=s.beginTransaction();    
        TypedQuery query=s.createQuery("from User");    
	    List<User> list=query.getResultList();   
	    boolean flag = false;
	    java.lang.Long userID = null;
	    Iterator<User> itr=list.iterator(); 
	    User user = new User();
	    while(itr.hasNext() && flag==false)
	    {    
	        user=itr.next();    
	        if(user.getUsername().equals(login.getUsername()))   
	        {
	        	flag=true;
	        	break;
	        }
	    }
	    if(flag == true)
	    {
	    	session.setAttribute("message", "exists");
	    	return new ModelAndView("user","data", new Login());
	    }
	    else
	    {
	    	StandardServiceRegistry ssr2=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta2=new MetadataSources(ssr2).getMetadataBuilder().build();  
	          
	        SessionFactory factory2=meta2.getSessionFactoryBuilder().build();  
	        Session s2=factory2.openSession();  
	       
	        Transaction t2=s2.beginTransaction();    
	    	User u = new User();
	    	u.setUsername(login.getUsername());
	    	u.setPassword(login.getPassword());
	    	u.setUserType(ars.enums.user.Existing_Account);
	    	u.setAccountLinkID(null);
	    	u.setDetailsLinkID(null);
	    	Long id = (Long) s2.save(u);
	    	t2.commit();
	    	
	    	session.setAttribute("message", "notexists");
	    	Details d = new Details();
	    	d.setUserLinkID(id);
	    	return new ModelAndView("details","command", d);
	    }
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET) 
	public String createDetailsGet(Details details) { 
	    return "createDetails"; 
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.POST)
    public ModelAndView createDetailsPost(@ModelAttribute("details") Details details, HttpServletRequest request, HttpSession session)
	{
		StandardServiceRegistry ssr2=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta2=new MetadataSources(ssr2).getMetadataBuilder().build();  
          
        SessionFactory factory2=meta2.getSessionFactoryBuilder().build();  
        Session s2=factory2.openSession();  
       
        Transaction t2=s2.beginTransaction();    
    	PersonalDetails d = new PersonalDetails();
    	d.setAgeGroup(ageGroup.valueOf(details.getAgeGroup()));
    	d.setFirstName(details.getFirstName());
    	d.setIdType(idType.valueOf(details.getIdType()));
    	d.setIdNo(details.getIdNo());
    	d.setLastName(details.getLastName());
    	d.setSex(sex.valueOf(details.getSex()));
    	d.setTicketLinkID(null);
    	d.setUserLinkID(details.getUserLinkID());
    	Long id = (Long) s2.save(d);
    	t2.commit();
    	
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session s=factory.openSession();  
       
        Transaction t=s.beginTransaction();  
        User u = (User)s.get(User.class,details.getUserLinkID());
        u.setDetailsLinkID(id);
        t.commit();
    	s.update(u);
    	
    	Accounts a = new Accounts();
    	a.setUserLinkID(details.getUserLinkID());
    	return new ModelAndView("accounts","command",a);
	}
	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET) 
	public String createAccountsGet(Details details) { 
	    return "createAccounts"; 
	}
	
	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public ModelAndView createAccountsPost(@ModelAttribute("accounts") Accounts accounts, HttpServletRequest request, HttpSession session) throws Exception
	{
		StandardServiceRegistry ssr2=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta2=new MetadataSources(ssr2).getMetadataBuilder().build();  
          
        SessionFactory factory2=meta2.getSessionFactoryBuilder().build();  
        Session s2=factory2.openSession();  
       
        Transaction t2=s2.beginTransaction();    
    	Account a = new Account();
    	a.setBalance(accounts.getBalance());
    	a.setBank(bank.valueOf(accounts.getBank()));
    	a.setCardNo(accounts.getCardNo());
    	a.setCardType(cardType.valueOf(accounts.getCardType()));
    	a.setCvv(accounts.getCvv());
    	
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	    System.out.println(accounts.getExpiryDate());
    	Date parsedDate = dateFormat.parse(accounts.getExpiryDate());
	    java.sql.Timestamp expiryDate = new java.sql.Timestamp(parsedDate.getTime());
    	a.setExpiryDate(expiryDate);
    	
    	a.setNetID(accounts.getNetID());
    	a.setNetPass(accounts.getNetPass());
    	a.setPaymentPlatform(paymentPlatform.valueOf(accounts.getPaymentPlatform()));
    	a.setUserLinkID(accounts.getUserLinkID());
    	Long id = (Long) s2.save(a);
    	t2.commit();
    	
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session s=factory.openSession();  
       
        Transaction t=s.beginTransaction();  
        User u = (User)s.get(User.class,accounts.getUserLinkID());
        u.setAccountLinkID(id);
        t.commit();
    	s.update(u);
    	session.setAttribute("message", "success");
    	return new ModelAndView("login","command",new Login());
	}
}
