package org.egiants;


import org.egiants.dao.JdbcDaoImpl;
import org.egiants.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext cxt =
	    		new ClassPathXmlApplicationContext("Spring.xml");
		
		JdbcDaoImpl dao = (JdbcDaoImpl) cxt.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		Customer customer = dao.getCustomer(1);
		System.out.print(customer.getFirstname());
		System.out.print(" ");
		System.out.print(customer.getLastname());
		
		
	}

}
