package com.cse.tansik.DTO;

import java.util.ArrayList;
import java.util.Date;


public  class EduYear {
    int id;
    int year;
    ArrayList<Department>  Dep=new ArrayList();
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

    public void setDep(ArrayList<Department> Dep) {
        this.Dep = (ArrayList<Department>)Dep.clone();
    }

    public ArrayList<Department> getDep() {
        try{
        return (ArrayList<Department>)Dep.clone();
        }
        catch(Exception e){return null;}
    }
}
