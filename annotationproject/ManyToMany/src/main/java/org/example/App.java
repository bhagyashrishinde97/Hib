package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating Employee Object
        Employee e1=new Employee();
        e1.setEmpName("Adity");
        Employee e2=new Employee();
        e2.setEmpName("Akshay");
//   creating projects objects
        Project p1=new Project();
        p1.setProjectName("Student Manangement");
        Project p2=new Project();
        p2.setProjectName("library Management");
        List<Employee> employeeList=new ArrayList<>();
        List<Project> projectList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        projectList.add(p1);
        projectList.add(p2);
        e1.setProjects(projectList);
        e2.setProjects(projectList);

        p1.setEmployeeList(employeeList);
        p2.setEmployeeList(employeeList);

        // Open Hibernate session, begin transaction, and save entities
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();
        factory.close();
    }
}



