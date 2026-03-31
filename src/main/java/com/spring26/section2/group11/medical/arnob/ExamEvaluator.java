package com.spring26.section2.group11.medical.arnob;

public class ExamEvaluator {
    private int evaluatorID;
    private String evaluatorName;
    private String password;
    private String assignedSubject;


    public ExamEvaluator(int evaluatorID, String evaluatorName, String password, String assignedSubject) {
        this.evaluatorID = evaluatorID;
        this.evaluatorName = evaluatorName;
        this.password = password;
        this.assignedSubject = assignedSubject;
    }

    public int getEvaluatorID() {
        return evaluatorID;
    }

    public void setEvaluatorID(int evaluatorID) {
        this.evaluatorID = evaluatorID;
    }

    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAssignedSubject() {
        return assignedSubject;
    }

    public void setAssignedSubject(String assignedSubject) {
        this.assignedSubject = assignedSubject;
    }

    @Override
    public String toString() {
        return "ExamEvaluator{" +
                "evaluatorID=" + evaluatorID +
                ", evaluatorName='" + evaluatorName + '\'' +
                ", password='" + password + '\'' +
                ", assignedSubject='" + assignedSubject + '\'' +
                '}';
    }
}
