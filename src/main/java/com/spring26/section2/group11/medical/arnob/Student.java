package com.spring26.section2.group11.medical.arnob;

import java.time.LocalDate;

public class Student {
    private int  studentId;
    private String studentName;
    private String department;
    private String semester;
    private String password;
    private String exam;
    private String subject;
    private int marks;
    private String rank;
    private String grade;
    private String status;
    private int amount;
    private int total;
    private String time;
    private String room;

    public Student(String subject, int marks, int total, String rank) {
        this.subject = subject;
        this.marks = marks;
        this.total = total;
        this.rank = rank;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Student(int studentId, String status, int amount) {
        this.studentId = studentId;
        this.status = status;
        this.amount = amount;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", semester='" + semester + '\'' +
                ", password='" + password + '\'' +
                ", exam='" + exam + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                ", rank='" + rank + '\'' +
                ", grade='" + grade + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", total=" + total +
                ", time='" + time + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
