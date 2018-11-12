package com.cse.tansik.dto;

public abstract class Department {
    private String name;
    private int id;
    private EduYear eduYear ;
    private Prequistes preq;
    @Override;
    public boolean equals(Object o)
    {
        Department dep2=(Department)(o);
        
        if (this.id==dep2.id&&this.name==dep2.name)
        return false;
        }
    public String toString()
    {
        return name+" "+id+" "+eduYear.toString();
     }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEduYear(EduYear eduYear) {
      //copying info
      //  this.eduYear = eduYear;
    }

    public EduYear getEduYear() {
        return eduYear;
    }

    public void setPreq(Prequistes preq) {
        this.preq = preq;
    }

    public Prequistes getPreq() {
        return preq;
    }
}
