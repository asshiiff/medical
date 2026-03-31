package com.spring26.section2.group11.medical.arnob;

public class Student {
    private int  studentID;
    private String studentName;
    private String department;
    private int semester;
    private String password;

    public Student(int studentID, String studentName, String department, int semester, String password) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
        this.semester = semester;
        this.password = password;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", semester=" + semester +
                ", password='" + password + '\'' +
                '}';
    }
}
