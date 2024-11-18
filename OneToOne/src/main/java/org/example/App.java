package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Hibernate Configuration and SessionFactory setup
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        // Creating question and answer objects
        Question q1 = new Question();
        q1.setQuestionId(122);
        q1.setQuestion("What is java?");

        Answer a1 = new Answer();
        a1.setAnswerId(102);
        a1.setAnswer("Java is a programming language");


        // Set bidirectional relationship
        q1.setAnswer(a1);
        a1.setQuestion(q1);

        // Open session and begin transaction
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();

        // Saving entities
        session.save(a1); // Save the Answer first
        session.save(q1); // Then save the Question

        // Commit transaction
        tr.commit();

        // Fetching and printing a question
       // Question newQ = session.get(Question.class, );
        //System.out.println(newQ.getQuestion());
        //System.out.println(newQ.getAnswer().getAnswer());

        // Closing session and factory
        session.close();
        factory.close();
    }
}
