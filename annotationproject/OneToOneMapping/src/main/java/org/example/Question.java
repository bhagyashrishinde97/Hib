package org.example;

import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name="question_id")
    private int QuestionId;
    private String Question;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id") // Specifies the foreign key column in the Question table

    private Answer answer;


    public Question()
    {
        super();
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public int getQuestionId() {
        return QuestionId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int questionId) {
        QuestionId = questionId;
    }

    public void setQuestionId(int questionId,String Question,Answer answer) {
        this.QuestionId = questionId;
        this.Question=Question;
        this.answer=answer;
    }

    public Iterable<? extends Answer> getAnswers() {
    }
}