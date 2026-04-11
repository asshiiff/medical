package com.spring26.section2.group11.medical.arnob;

public class Handelrequest {

    private String subject;
    private int studentId;
    private int marks;
    private String status;
    private String reason;

    public Handelrequest(String subject, int studentId, int marks, String status, String reason) {
        this.subject = subject;
        this.studentId = studentId;
        this.marks = marks;
        this.status = status;
        this.reason = reason;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Handelrequest{" +
                "subject='" + subject + '\'' +
                ", studentId=" + studentId +
                ", marks=" + marks +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
