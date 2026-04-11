package com.spring26.section2.group11.medical.arnob;

import java.time.LocalDate;

public class Oldexam {
    private String subject;
    private String semester;
    private LocalDate date;

    public Oldexam(String subject, String semester, LocalDate date) {
        this.subject = subject;
        this.semester = semester;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Oldexam{" +
                "subject='" + subject + '\'' +
                ", semester='" + semester + '\'' +
                ", date=" + date +
                '}';
    }
}
