package cresber.example.hibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/SaveUser")
public class ExampleServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {			
			super.doGet(req, resp);
			
			UserDetails userDetails = new UserDetails();
			userDetails.setFirstName(req.getParameter("firstName"));
			userDetails.setLastName(req.getParameter("lastName"));
			userDetails.setGender(req.getParameter("gender"));
			userDetails.setSalary(req.getParameter("salary"));
		

	    	Configuration config = new Configuration();
	    	config.configure("hibernate.cfg.xml");
	    	SessionFactory sessionFactory = config.buildSessionFactory();
	    	Session session = sessionFactory.openSession();
	    	Transaction t = session.beginTransaction();
	    	
	    	session.save(userDetails);
	    	
	    	t.commit();
			
			
			req.getRequestDispatcher("/WEB-INF/SaveUser.jsp").forward(req, resp);
			
			
		}
	
}
