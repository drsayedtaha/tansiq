/**
 * Edited By : AbdAlla - AboElMagd
 * 
 */
package com.cse.tansik.DTO;

import java.util.Date;

public class EduYear {
    int id, departmentId;
    int year;
    Date startDate;
    Date endDate;
    String department, faculty, university;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

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
