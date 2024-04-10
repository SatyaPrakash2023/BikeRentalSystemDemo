package com.java.hib;


import java.util.Map; 

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class BikeManagmentImpl {
	SessionFactory sf;
	Session session;
	
	public String Login(User user) {
		Map<String,Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		System.out.println("Satya is here"+user);
		System.out.println(user.getEmail());
		sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(User.class);
		cr.add(Restrictions.eq("email",user.getEmail()));
		cr.add(Restrictions.eq("passWord",EncryptPassword.getCode(user.getPassWord())));
		
		cr.setProjection(Projections.rowCount());
		long count = (long) cr.uniqueResult();
		if(count == 1) {
			sessionMap.put("user",user);
			return"Home.jsp?faces-redirect=true";
		}
		
		else {
			System.out.println("Satya....");
			sessionMap.put("passWordErr", "Enter a valid password and try again.");
			
			return "DashBoard.jsp?faces-redirect=true";
		}
	}
	
	public String UserSignUp(User user) {
		System.out.println("Satya is here");
		Map<String,Object> sessionMap =
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr=session.createCriteria(User.class);
		cr.add(Restrictions.eq("email", user.getEmail()));
		cr.add(Restrictions.eq("fullName", user.getFullName()));
		User userFound=(User) cr.uniqueResult();	
		if(userFound!=null) {
			System.out.println("User already exits");
			return"UserSignUp.jsp?faces-redirect=true";
	}
		else {	
			User user1=new User();
			sf = SessionHelper.getConnection();
			Session session1 = sf.openSession();
			Transaction trans = session1.beginTransaction();
			String encr=EncryptPassword.getCode(user.getPassWord());
			user.setPassWord(encr);
			user1.setUserId(user.getUserId());
			user1.setAge(user.getAge());
			user1.setEmail(user.getEmail());
			user1.setFullName(user.getFullName());
			user1.setGender(user.getGender());
			user1.setPassWord(user.getPassWord());
			user1.setPhoneNumber(user.getPhoneNumber());
			user1.setUserName(user.getUserName());
			System.out.println(user1);
			System.out.println("First object is");
			System.out.println("user name is " +user.getFullName());
			System.out.println(userFound);
			String email=user.getEmail();
			long otp=GenerarteOtp.generateOtp();
			session1.save(user1);
			trans.commit();
			session.close();
			session1.close();
			String subject = "Security alert";
			String messageText = "Hello,\n\n Your BikeShareHub account created for the email id "+email+" and your verification otp"
					+ otp +"please don't share with anyone your one time password";
			MailSend.mailSend(email, subject, messageText);
			return "DashBoard.jsp?faces-redirect=true";
		}
	}
}
