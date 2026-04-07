package com.spring26.section2.group11.medical.ashif;

public class QuestionSetter {
    private int questionSetterId;
    private String questionSetterName;
    private String questionSetterPassword;

    public QuestionSetter(int questionSetterId, String questionSetterName, String questionSetterPassword) {
        this.questionSetterId = questionSetterId;
        this.questionSetterName = questionSetterName;
        this.questionSetterPassword = questionSetterPassword;
    }

    public int getQuestionSetterId() {
        return questionSetterId;
    }

    public void setQuestionSetterId(int questionSetterId) {
        this.questionSetterId = questionSetterId;
    }

    public String getQuestionSetterName() {
        return questionSetterName;
    }

    public void setQuestionSetterName(String questionSetterName) {
        this.questionSetterName = questionSetterName;
    }

    public String getQuestionSetterPassword() {
        return questionSetterPassword;
    }

    public void setQuestionSetterPassword(String questionSetterPassword) {
        this.questionSetterPassword = questionSetterPassword;
    }


    @Override
    public String toString() {
        return "QuestionSetter{" +
                "questionSetterId=" + questionSetterId +
                ", questionSetterName='" + questionSetterName + '\'' +
                ", questionSetterPassword='" + questionSetterPassword + '\'' +
                '}';
    }
}
