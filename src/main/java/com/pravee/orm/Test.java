package com.pravee.orm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
public class Test {

	public static void main(String [] args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("/com/pravee/orm/applicationcontext.xml");
		Transactions t=(Transactions)ac.getBean("transaction");
		Product p=new Product();
		p.setPcost(10);
		p.setPid(2);
		p.setPname("pencil");
		System.out.println(t.insert(p));
	}
	
}
