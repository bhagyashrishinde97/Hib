package org.example;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;

    private String answer;

    @OneToOne(mappedBy = "answer", cascade = CascadeType.ALL)
    private Question question;

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
