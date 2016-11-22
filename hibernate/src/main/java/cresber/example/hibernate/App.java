package cresber.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	UserDetails user1 = new UserDetails();
    	user1.setUserId(1);
    	user1.setUserName("User1");
    	
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory = config.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction t = session.beginTransaction();
    	
    	session.save(user1);
    	
    	t.commit();
    }
}
