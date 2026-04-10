package com.spring26.section2.group11.medical.ashif;

public class Exam {
    private String description;
    private String event;
    private String type;
    private String invigilator;
    private String examCenter;
    private String exam;
    private String question;
    private int totalScore;
    private int marks;
    private String rank;
    private String previousData;
    private String questionPaper;

    public Exam(String description, String event, String type) {
        this.description = description;
        this.event = event;
        this.type = type;
    }

    public Exam(String invigilator, String examCenter) {
        this.invigilator = invigilator;
        this.examCenter = examCenter;
    }

    public Exam(String question) {
        this.question = question;
    }


    public Exam(int totalScore, int marks, String rank) {
        this.totalScore = totalScore;
        this.marks = marks;
        this.rank = rank;
    }


    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(String invigilator) {
        this.invigilator = invigilator;
    }

    public String getExamCenter() {
        return examCenter;
    }

    public void setExamCenter(String examCenter) {
        this.examCenter = examCenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "description='" + description + '\'' +
                ", event='" + event + '\'' +
                ", type='" + type + '\'' +
                ", invigilator='" + invigilator + '\'' +
                ", examCenter='" + examCenter + '\'' +
                ", exam='" + exam + '\'' +
                ", question='" + question + '\'' +
                ", totalScore=" + totalScore +
                ", marks=" + marks +
                ", rank='" + rank + '\'' +
                ", previousData='" + previousData + '\'' +
                ", questionPaper='" + questionPaper + '\'' +
                '}';
    }
}