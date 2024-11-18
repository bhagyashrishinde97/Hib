package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("Project Started");

        // Configure Hibernate
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Build SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();
       // System.out.println("Factory created: " + factory);

        // Check if the factory is closed (optional)
        //System.out.println("Is factory closed? " + factory.isClosed());

        // Creating a new Student object

        Student st = new Student();
        st.setId(101);
        st.setName("Aditi");
        st.setCity("Pune");


        // Creating a new Address object
        Address add = new Address();

        add.setStreet("Street1");
        add.setCity("Pune");
        add.setOpen(true);
        add.setAddedDate(new Date());
        add.setX(1234.234);

        //FileInputStream fis=new FileInputStream("src/main/org.example/jakub-neskora-A9tqu5iCFCQ-unsplash.jpg");
        //byte[] data=new byte[fis.available()];
        // fis.read(data);
        // add.getImage();
        //try {
        //FileInputStream fileInputStream = new FileInputStream("src/main/org.example/jakub-neskora-A9tqu5iCFCQ-unsplash.jpg");
        // Your file handling code here
        // } catch (FileNotFoundException e) {
        //  System.out.println("File not found: " + e.getMessage());
        // }
//        try (FileInputStream fis = new FileInputStream("src/main/org.example/jakub-neskora-A9tqu5iCFCQ-unsplash.jpg")) {
//            byte[] data = new byte[fis.available()];
//            fis.read(data);
//            add.setImage(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


       /* // Open a session and begin transaction
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();

        // Save objects to the database
        session.save(st);

        session.save(add);



        // Commit the transaction and close the session
        tr.commit();
        session.close();
        factory.close();

        System.out.println("Transaction committed and session closed. Done!");
    }
}*/
        try (Session session = factory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.save(st);
            session.save(add);
            tr.commit();
            System.out.println("Data saved successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        factory.close();
        System.out.println("Transaction committed and session closed. Done!");
    }
}
