package com.spring26.section2.group11.medical.arnob;

public class Course {
    private String course;
    private String answerKey;


    public Course(String course, String answerKey) {
        this.course = course;
        this.answerKey = answerKey;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", answerKey='" + answerKey + '\'' +
                '}';
    }
}
