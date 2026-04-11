package com.spring26.section2.group11.medical.ashif;

import java.awt.*;

public class Exam {
    private String description;
    private String event;
    private int type;
    private String invigilator;
    private String examCenter;
    private String exam;
    private int question;
    private double totalScore;
    private double marks;
    private int rank;
    private String report;
    private String questionPaper;
    private String category;
    private Label emptyLabel;

    public Exam(String description, String event, int type) {
        this.description = description;
        this.event = event;
        this.type = type;
    }

    public Exam(String invigilator, String examCenter) {
        this.invigilator = invigilator;
        this.examCenter = examCenter;
    }



    public Exam(String exam, String report, String description) {
        this.exam = exam;
        this.report = report;
        this.description = null;
    }


    public Exam(int question) {
        this.question = question;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Exam(double totalScore, int marks, int rank) {
        this.totalScore = totalScore;
        this.marks = marks;
        this.rank = rank;
    }

    public Exam(String exam, double totalScore) {
        this.exam = exam;
        this.totalScore = 0;
    }

    public Exam(String exam, int question) {
        this.exam = exam;
        this.question = question;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Exam(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }




}