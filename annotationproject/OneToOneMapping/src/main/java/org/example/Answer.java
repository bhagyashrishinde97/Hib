package org.example;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @Column(name="answer_id")
    private int AnswerId;

    private String Answer;
    @OneToOne(mappedBy = "answer", cascade = CascadeType.ALL)
    private Question question;
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

public Question getQuestion() {
    return question;
}

public void setQuestion(Question question) {
    this.question = question;
}


}
