package com.spring26.section2.group11.medical.ashraful;

public class Candidate {
    private int candidateId;
    private String candidateName;
    private boolean candidateAttendance;
    private String candidateStatus;
    private int candidateScore;
    private String candidateExam;
    private String candidateSeat;
    private String application;

    public Candidate(String application) {
        this.application = application;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", candidateAttendance=" + candidateAttendance +
                ", candidateStatus='" + candidateStatus + '\'' +
                ", candidateScore=" + candidateScore +
                ", candidateExam='" + candidateExam + '\'' +
                ", candidateSeat='" + candidateSeat + '\'' +
                ", application='" + application + '\'' +
                '}';
    }
}
