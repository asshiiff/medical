package com.spring26.section2.group11.medical.arnob;

public class Handelrequest {

    private String subject;
    private int studentId;
    private int requestMarks;
    private String status;
    private String reason;

    public Handelrequest(String subject, int studentId, int requestMarks, String status, String reason) {
        this.subject = subject;
        this.studentId = studentId;
        this.requestMarks = requestMarks;
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

    public int getRequestMarks() {
        return requestMarks;
    }

    public void setRequestMarks(int requestMarks) {
        this.requestMarks = requestMarks;
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
                ", requestMarks=" + requestMarks +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
