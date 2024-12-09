package com.om.DemoHibernate;

import javax.management.loading.PrivateClassLoader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        Alien a = new Alien();
        a.setAid(101);
        a.setName("Om");
        a.setColour("Black");
        
        Configuration con = new Configuration().configure();
        
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        session.save(a);
    }
}
