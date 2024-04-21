package com.tunahankarakok;

public class Student {

    private Integer idNumber;
    private String firstName;
    private String lastName;

    //POJO - Model(Kalıp)


    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(Integer idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
