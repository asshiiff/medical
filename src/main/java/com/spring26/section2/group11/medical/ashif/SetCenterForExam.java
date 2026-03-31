package com.spring26.section2.group11.medical.ashif;

public class SetCenterForExam {

    private String centerName;
    private int centerId;
    private int examId;

    public SetCenterForExam(String centerName, int centerId, int examId) {
        this.centerName = centerName;
        this.centerId = centerId;
        this.examId = examId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    @Override
    public String toString() {
        return "SetCenterForExam{" +
                "centerName='" + centerName + '\'' +
                ", centerId=" + centerId +
                ", examId=" + examId +
                '}';
    }
}
