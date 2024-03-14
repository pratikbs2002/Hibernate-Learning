package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        Cricketer cricketer = new Cricketer();
//        cricketer.setId(21);
//        cricketer.setName("Pratik Suthar");
//        cricketer.setNumber("8");
//
//        Configuration configuration = new Configuration().configure().addAnnotatedClass(Cricketer.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction ts = session.beginTransaction();

        //Insert into Database.......
//      session.save(cricketer);


        //load data from the database...........
//        Cricketer c = session.get(Cricketer.class,11);
//        Cricketer c = session.load(Cricketer.class,11);
//        System.out.println(c);
//        System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Number: " + c.getNumber());


        //list out data using hql.........
//        Query<Cricketer> query = session.createQuery("from Cricketer", Cricketer.class);
//        List<Cricketer> cricketers = query.getResultList();
//        for (Cricketer c : cricketers) {
//            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Number: " + c.getNumber());
//        }

        // Update data of the database ..............
//        Cricketer c =session.get(Cricketer.class, 1);
//        c.setNumber("999");
//        session.save(c);


        // Delete Data from the database........
//        Cricketer c =session.get(Cricketer.class, 1);
//        session.delete(c);
//        ts.commit();



        Cricketer cricketer = new Cricketer();
        cricketer.setId(34);
        cricketer.setName("Pratik Suthar");
        cricketer.setNumber("8");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Cricketer.class).addAnnotatedClass(Car.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();

        for(int i = 10; i < 12; i++)
        {
            Car car = new Car();
            car.setId(i+1);
            car.setName("BMW");
            car.setCricketer(cricketer);
            cricketer.getCar().add(car);
            session.save(car);
        }
        session.save(cricketer);

        ts.commit();
        session.close();
        sessionFactory.close();
    }
}