package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        try (Session session = factory.openSession()) {
            // Fetching Student with ID 101
            Student st = session.get(Student.class, 101);

                //System.out.println("Fetched Student: " + st);
            if (st != null) {
                System.out.println("Fetched Address: " + st.getName() + ", " + st.getCity());
            } else {
                System.out.println("Student with ID 101 not found.");
            }


            // Fetching Address with a known ID (e.g., 1)
            // Address address = session.get(Address.class, 1);
            // if (address != null) {
            // System.out.println("Fetched Address: " + address.getStreet() + ", " + address.getCity());
            //} else {
            // System.out.println("Address with ID not found.");
            //}
            //} catch (Exception e)
            //{
            // e.printStackTrace();
            // }

            factory.close();
        }
    }
}