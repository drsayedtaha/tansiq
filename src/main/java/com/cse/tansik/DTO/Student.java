package com.cse.tansik.DTO;

public class Student extends User {
    private Subject[] subjects;
    private Department Department;
    private Request[] requests;
    private String nationalID;
    private float degree;
    private int year;

    public void setSubjects(Subject[] subjects) {
        // copying info
        // this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setDepartment(Department Department) {
        // copying info
        // this.Department = Department;
    }

    public Department getDepartment() {
        return Department;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    public float getDegree() {
        return degree;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
