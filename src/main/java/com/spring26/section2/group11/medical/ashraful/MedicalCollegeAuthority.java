package com.spring26.section2.group11.medical.ashraful;

public class MedicalCollegeAuthority {
    private int medicalCollegeAuthority;
    private String medicalCollegeAuthorityName;
    private String medicalCollegeAuthorityPassword;
    private String medicalCollegeAuthorityEmail;

    public MedicalCollegeAuthority(int medicalCollegeAuthority, String medicalCollegeAuthorityName, String medicalCollegeAuthorityPassword, String medicalCollegeAuthorityEmail) {
        this.medicalCollegeAuthority = medicalCollegeAuthority;
        this.medicalCollegeAuthorityName = medicalCollegeAuthorityName;
        this.medicalCollegeAuthorityPassword = medicalCollegeAuthorityPassword;
        this.medicalCollegeAuthorityEmail = medicalCollegeAuthorityEmail;
    }

    public int getMedicalCollegeAuthority() {
        return medicalCollegeAuthority;
    }

    public void setMedicalCollegeAuthority(int medicalCollegeAuthority) {
        this.medicalCollegeAuthority = medicalCollegeAuthority;
    }

    public String getMedicalCollegeAuthorityName() {
        return medicalCollegeAuthorityName;
    }

    public void setMedicalCollegeAuthorityName(String medicalCollegeAuthorityName) {
        this.medicalCollegeAuthorityName = medicalCollegeAuthorityName;
    }

    public String getMedicalCollegeAuthorityPassword() {
        return medicalCollegeAuthorityPassword;
    }

    public void setMedicalCollegeAuthorityPassword(String medicalCollegeAuthorityPassword) {
        this.medicalCollegeAuthorityPassword = medicalCollegeAuthorityPassword;
    }

    public String getMedicalCollegeAuthorityEmail() {
        return medicalCollegeAuthorityEmail;
    }

    public void setMedicalCollegeAuthorityEmail(String medicalCollegeAuthorityEmail) {
        this.medicalCollegeAuthorityEmail = medicalCollegeAuthorityEmail;
    }

    @Override
    public String toString() {
        return "MedicalCollegeAuthority{" +
                "medicalCollegeAuthority=" + medicalCollegeAuthority +
                ", medicalCollegeAuthorityName='" + medicalCollegeAuthorityName + '\'' +
                ", medicalCollegeAuthorityPassword='" + medicalCollegeAuthorityPassword + '\'' +
                ", medicalCollegeAuthorityEmail='" + medicalCollegeAuthorityEmail + '\'' +
                '}';
    }
}
