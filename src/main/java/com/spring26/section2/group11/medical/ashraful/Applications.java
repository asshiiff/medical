package com.spring26.section2.group11.medical.ashraful;

public class Applications {
    private String applications;

    public Applications(String applications) {
        this.applications = applications;
    }

    public String getApplications() {
        return applications;
    }

    public void setApplications(String applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "Applications{" +
                "applications='" + applications + '\'' +
                '}';
    }
}
