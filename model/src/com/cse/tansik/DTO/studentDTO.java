package com.cse.tansik.DTO;

import com.cse.tansik.DTO.Department;

import  java.util.*;

import javax.security.auth.Subject;

public class studentDTO  {
    private Subject[] subjects;


    private ArrayList<requestDTO> requests=new ArrayList<requestDTO>();
    
    private String nationalID;
    
    private float degree;
    private int year;
    private Department dep;

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
        return null;
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

    public void setRequests(ArrayList<requestDTO> requests) {
        this.requests = requests;
    }

    public ArrayList<requestDTO> getRequests() {
        return requests;
    }
}
