package com.cse.tansik.DTO;

public class Subject {
    private String name;
    private int degree;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setdegree(int degree) {
        this.degree = degree;
    }

    public int getdegree() {
        return degree;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        Subject subject2 = (Subject) (o);

        if (this.id == subject2.id && this.name == subject2.name && this.degree == subject2.degree)
            return false;
        return true;
    }
}
