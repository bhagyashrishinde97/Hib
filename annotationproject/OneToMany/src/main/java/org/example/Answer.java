package org.example;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnswerId;

    private String Answer;
    @ManyToOne
    @JoinColumn(name="question_id")
    private Answer answer;

    public int getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(int answerId) {
        AnswerId = answerId;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }


    public void setQuestion(Question q1) {
    }
}


