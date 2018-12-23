package com.cse.tansik.DTO;

import java.util.Date;
import java.util.List;

public class EduYear {
    int id;
    int year;
    // abdo ragab 4/12
    // neded to save data from database and re print it
    String faculty;
    
    String Department;
    
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
        return this.id + " " + this.getYear();
    }

}
