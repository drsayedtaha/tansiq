package com.cse.tansik;

public abstract class subject {
 private String name;
 private float Degree ;
 private int id;
    	public abstract int getId();
    	   
public abstract boolean setSubject(String name, float requiredDegree);

    public abstract String getSubjectName();
    public abstract float getSubjectdegree();

}