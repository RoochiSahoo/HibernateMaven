package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMAin 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Configuration configuration=new Configuration().configure();
    	SessionFactory sessionfactory=configuration.buildSessionFactory();
    	Session session=sessionfactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	Product p=new Product();
    	p.setProductId(10);
    p.setName("ar");
    	p.setBrand("wp");
    	p.setPrice(200.00f);
    	session.save(p);
    	System.out.println("product is saved");
    	transaction.commit();
    	session.close();
    }
}
