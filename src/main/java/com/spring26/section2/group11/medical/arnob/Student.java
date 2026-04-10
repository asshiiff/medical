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
    private int age;

    public Student(String studentName, int age, String password) {
        this.studentName = studentName;
        this.age = age;
        this.password = password;
    }

    public Student(String studentName, int studentId, String rank, int marks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.rank = rank;
        this.marks = marks;
    }

    public Student(int studentId, int marks, String grade) {
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }


    public Student(int studentId, int marks) {
        this.studentId = studentId;
        this.marks = marks;
    }

    public Student(String subject, int marks, int total, String rank) {
        this.subject = subject;
        this.marks = marks;
        this.total = total;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
