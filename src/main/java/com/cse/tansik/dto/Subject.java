package com.cse.tansik.dto;

public abstract class Subject {
    private String name;
    private float Degree;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDegree(float Degree) {
        this.Degree = Degree;
    }

    public float getDegree() {
        return Degree;
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

        if (this.id == subject2.id && this.name == subject2.name && this.Degree == subject2.Degree)
            return false;
        return true;
    }
}
