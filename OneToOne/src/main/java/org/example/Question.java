package org.example;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @Column(name = "question_id")
    private int questionId;

    private String question;

    @OneToOne
    @JoinColumn(name = "answer_id", referencedColumnName = "answer_id")
    private Answer answer;

    // Getters and setters
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
