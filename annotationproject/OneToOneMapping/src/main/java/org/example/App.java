package org.example;

import org.example.Answer;
import org.example.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App

    {
        public static void main( String[] args )
        {
            System.out.println( "Hello World!" );

            Configuration cfg=new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory= cfg.buildSessionFactory();
            //creating question object
            Question q1=new Question();
            q1.setQuestionId(121);
            q1.setQuestion("What is java?");
            Question q2=new Question();
            q2.setQuestionId(131);
            q2.setQuestion("java is platform independant or not?");
            //creating answer object
            Answer a1=new Answer();
            a1.setAnswerId(101);
            a1.setAnswer("java is programming language");

            Answer a2=new Answer();
            a2.setAnswerId(102);
            a2.setAnswer("java is platform independant");
            q1.setAnswer(a1);
            q2.setAnswer(a2);
            Session session= factory.openSession();
            Transaction tr= session.beginTransaction();
            session.save(q1);
            session.save(q2);
            session.save(a1);
            session.save(a2);
            tr.commit();
            Question newQ=(Question)session.get(Question.class,121);
            System.out.println(newQ.getQuestion());
            System.out.println(newQ.getAnswer());
            session.close();
            factory.close();
        }
}

