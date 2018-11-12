package com.cse.tansik.dto;

public class University {
    private String name;
    private int id;
    private EduYear[] eduYears;

    public boolean equals(Object o)
    {
        University u=(University)(o);
        
        return (this.name==u.name&&this.id==u.id);
        
        }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFaculties(EduYear[] faculties) {
        this.eduYears = faculties;
    }

    public EduYear[] getFaculties() {
        return eduYears;
    }
}
