package com.cse.tansik.DTO;


public class Department implements Cloneable {
    private String name;
    private int id;
    private Prequistes preq;
    private int maxCapcity;
    private int minCapcity;
    private int size;
    public Department()
    {size=0;
     maxCapcity=0;
     minCapcity=0;
        }
    @Override
    public boolean equals(Object o) {
        Department dep2 = (Department) (o);

        if (this.id == dep2.id && this.name == dep2.name)
            return false;
        return true;
    }

    public String toString() {
        return name + " " + id ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEduYear(EduYear eduYear) {
        // copying info
        // this.eduYear = eduYear;
    }


    public void setPreq(Prequistes preq) {
        this.preq = preq;
    }

    public Prequistes getPreq() {
        return preq;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMaxCapcity(int maxCapcity) {
        this.maxCapcity = maxCapcity;
    }

    public int getMaxCapcity() {
        return maxCapcity;
    }

    public void setMinCapcity(int minCapcity) {
        this.minCapcity = minCapcity;
    }

    public int getMinCapcity() {
        return minCapcity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
