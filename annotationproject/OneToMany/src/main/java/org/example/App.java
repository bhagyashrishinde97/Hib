package org.example;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Hello world!
// *
// */
//public class App {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//
//        SessionFactory factory = cfg.buildSessionFactory();
//        //creating Question
//        Question q1 = new Question();
//        //q1.setQuestionId(121);
//        q1.setQuestion("What is java?");
//        //creating Answer;
//
//        Answer a1 = new Answer();
//        //a1.setAnswerId(101);
//        a1.setAnswer("java is a programming language");
//        a1.setQuestion(q1);
//
//        Answer a2 = new Answer();
//        //a2.setAnswerId(102);
//        a2.setAnswer("with help of java we create software");
//        a2.setQuestion(q1);
//
//        Answer a3 = new Answer();
//        //a3.setAnswerId(103);
//        a3.setAnswer("we use java frameworks ");
//        a3.setQuestion(q1);
//
//        List<Answer> answerList= new ArrayList<>();
//        answerList.add(a1);
//        answerList.add(a2);
//        answerList.add(a3);
//
//        q1.setAnswer((List<Answer>) answerList);
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(q1);
//        tx.commit();
//        Question newQ = session.get(Question.class,q1.getQuestionId());
//        System.out.println(newQ.getQuestion());
//        for (Answer ans : newQ.getAnswers()) {
//            System.out.println("Answer: " + ans.getAnswer());
//        }
//        session.close();
//        factory.close();
//        {
//            System.out.println(a1.getAnswer());
//        }
//
//    }
//}


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

    public class App {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();

            // Creating a Question
            Question q1 = new Question();
            q1.setQuestion("What is Java?");

            // Creating Answers
            Answer a1 = new Answer();
            a1.setAnswer("Java is a programming language.");
            a1.setQuestion(q1);

            Answer a2 = new Answer();
            a2.setAnswer("With Java, we can create software.");
            a2.setQuestion(q1);

            Answer a3 = new Answer();
            a3.setAnswer("Java has a rich ecosystem of frameworks.");
            a3.setQuestion(q1);

            // Setting Answers to Question
            List<Answer> answerList = new ArrayList<>();
            answerList.add(a1);
            answerList.add(a2);
            answerList.add(a3);
            q1.setAnswers(answerList);

            // Saving Question and Answers to the database
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(q1);
            tx.commit();

            // Retrieving and displaying the question and its answers
            Question newQ = session.get(Question.class, q1.getQuestionId());
            if (newQ != null) {
                System.out.println("Question: " + newQ.getQuestion());
                for (Answer ans : newQ.getAnswers()) {
                    System.out.println("Answer: " + ans.getAnswer());
                }
            }

            // Closing session and factory
            session.close();
            factory.close();
        }
    }
