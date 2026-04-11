package com.spring26.section2.group11.medical.ashraful;

public class Candidate {
    private int candidateId;
    private String candidateName;
    private boolean candidateAttendance;
    private String candidateStatus;
    private double candidateScore;
    private String candidateExam;
    private String candidateSeat;
    private String application;
    private double cgpa;
    private boolean applicationStatus;

    public Candidate(String candidateName, double candidateScore) {
        this.candidateName = candidateName;
        this.candidateScore = candidateScore;
    }

    public Candidate(int candidateId, String candidateName, String candidateStatus) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateStatus = candidateStatus;
    }

    public Candidate(String candidateName, int candidateId) {
        this.candidateName = candidateName;
        this.candidateId = candidateId;
    }

    public Candidate(String application, String candidateName, double cgpa, boolean applicationStatus) {
        this.application = application;
        this.candidateName = candidateName;
        this.cgpa = cgpa;
        this.applicationStatus = applicationStatus;
    }

    public Candidate(String candidateName, int candidateId, boolean candidateAttendance) {
        this.candidateName = candidateName;
        this.candidateId = candidateId;
        this.candidateAttendance = candidateAttendance;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public boolean isCandidateAttendance() {
        return candidateAttendance;
    }

    public void setCandidateAttendance(boolean candidateAttendance) {
        this.candidateAttendance = candidateAttendance;
    }

    public String getCandidateStatus() {
        return candidateStatus;
    }

    public void setCandidateStatus(String candidateStatus) {
        this.candidateStatus = candidateStatus;
    }

    public double getCandidateScore() {
        return candidateScore;
    }

    public void setCandidateScore(double candidateScore) {
        this.candidateScore = candidateScore;
    }

    public String getCandidateExam() {
        return candidateExam;
    }

    public void setCandidateExam(String candidateExam) {
        this.candidateExam = candidateExam;
    }

    public String getCandidateSeat() {
        return candidateSeat;
    }

    public void setCandidateSeat(String candidateSeat) {
        this.candidateSeat = candidateSeat;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(boolean applicationStatus) {
        this.applicationStatus = applicationStatus;
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
                ", cgpa=" + cgpa +
                ", applicationStatus=" + applicationStatus +
                '}';
    }
}
