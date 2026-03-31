package com.spring26.section2.group11.medical.ashif;

public class ExamController {
    private String examName;
    private int examId;
    private String examDate;
    private int examTime;

    public ExamController(String examName, int examId, String examDate, int examTime) {
        this.examName = examName;
        this.examId = examId;
        this.examDate = examDate;
        this.examTime = examTime;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public int getExamTime() {
        return examTime;
    }

    public void setExamTime(int examTime) {
        this.examTime = examTime;
    }

    @Override
    public String toString() {
        return "ExamController{" +
                "examName='" + examName + '\'' +
                ", examId=" + examId +
                ", examDate='" + examDate + '\'' +
                ", examTime=" + examTime +
                '}';
    }
}
