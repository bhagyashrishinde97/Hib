package org.example;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int QuestionId;
    private String Question;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public void setAnswers(List<Answer> answerList) {
    }

    public Answer[] getAnswers() {


    }
}
}