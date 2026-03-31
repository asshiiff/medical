package com.spring26.section2.group11.medical.ashraful;

public class Invigilator {
    private int invigilatorId;
    private String invigilatorName;
    private String invigilatorPassword;
    private String invigilatorEmail;

    public Invigilator(int invigilatorId, String invigilatorName, String invigilatorEmail, String invigilatorPassword) {
        this.invigilatorId = invigilatorId;
        this.invigilatorName = invigilatorName;
        this.invigilatorEmail = invigilatorEmail;
        this.invigilatorPassword = invigilatorPassword;
    }

    public int getInvigilatorId() {
        return invigilatorId;
    }

    public void setInvigilatorId(int invigilatorId) {
        this.invigilatorId = invigilatorId;
    }

    public String getInvigilatorName() {
        return invigilatorName;
    }

    public void setInvigilatorName(String invigilatorName) {
        this.invigilatorName = invigilatorName;
    }

    public String getInvigilatorPassword() {
        return invigilatorPassword;
    }

    public void setInvigilatorPassword(String invigilatorPassword) {
        this.invigilatorPassword = invigilatorPassword;
    }

    public String getInvigilatorEmail() {
        return invigilatorEmail;
    }

    public void setInvigilatorEmail(String invigilatorEmail) {
        this.invigilatorEmail = invigilatorEmail;
    }

    @Override
    public String toString() {
        return "Invigilator{" +
                "invigilatorId=" + invigilatorId +
                ", invigilatorName='" + invigilatorName + '\'' +
                ", invigilatorPassword='" + invigilatorPassword + '\'' +
                ", invigilatorEmail='" + invigilatorEmail + '\'' +
                '}';
    }
}
