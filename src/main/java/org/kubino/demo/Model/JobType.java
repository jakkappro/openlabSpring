package org.kubino.demo.Model;

public enum JobType {

    TEACHER("Teacher"),
    PROGRAMMER("Programmer"),
    DRIVER("Driver");

    private final String value;

    JobType(String value) {
        this.value = value;
    }



    public String getValue() {
        return value;
    }
}


