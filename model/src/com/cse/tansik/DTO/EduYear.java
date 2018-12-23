package com.cse.tansik.DTO;

import java.util.Date;
import java.util.List;

public class EduYear {
    int id;
    int year;

    // public void setDepartment(String Department) {
    //     this.Department = Department;
    // }

    // public String getDepartment() {
    //     return Department;
    // }

    // public void setStartDate(Date startDate) {
    //     this.startDate = startDate;
    // }

    // public Date getStartDate() {
    //     return startDate;
    // }

    // public void setEndDate(Date endDate) {
    //     this.endDate = endDate;
    // }

    // public Date getEndDate() {
    //     return endDate;
    // }
    // abdo ragab 4/12
    // neded to save data from database and re print it
    String faculty;

    // String Department;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    Date startDate;
    Date endDate;
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        EduYear EduYear = (EduYear) (o);

        if (this.id == EduYear.id && this.year == EduYear.getYear())
            return true;

        return false;
    }

    @Override
    public String toString() {
        return this.id + " " + this.getYear()+ " "+this.faculty;
    }

}
