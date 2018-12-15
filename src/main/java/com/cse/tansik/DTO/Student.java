package com.cse.tansik.DTO;

import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Subject> subjects = new ArrayList();
    private Department dep;
/**
 * replace by a hash map in calculation admin methode
*/
//    private Department Department;




    private ArrayList< Request> requests=new ArrayList();

    private int ID;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    private String nationalID;
    
    private float degree;
    private int year;



 
    public void setDepartment(Department dep) {
        try {
            this.dep = (Department)dep.clone();
        } catch (CloneNotSupportedException e) {
        }
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

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    
    //getTotalMark By abdullah khaled
    public  int getTotalMark(){
      int t_m =0;
      for(int i =0 ;i<subjects.size();i++){
          t_m+=subjects.get(i).getdegree();
          }
      return t_m;
    }
    
}
