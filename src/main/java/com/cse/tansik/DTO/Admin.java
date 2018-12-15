package com.cse.tansik.DTO;

import java.util.ArrayList;

public class Admin extends User {
	ArrayList<EduYear> eduYears=new ArrayList();

    public void setEduYears(ArrayList<EduYear> eduYears) {
        try{
            this.eduYears = (ArrayList<EduYear>)eduYears.clone();
            }
        catch(Exception e)
        { }
    }

    public ArrayList<EduYear> getEduYears() {
        try{
          return (ArrayList<EduYear>)eduYears.clone();
            }
        catch(Exception e)
        { return null; }
    }
}
