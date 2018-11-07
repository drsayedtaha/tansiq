package com.cse.tansik;

abstract class User 
{	
	 String name;
	 String password;
	 University University;
         public Faculty faculty;
	 private int id;
    	public abstract int getId();
    	
         String Password;

public  abstract boolean logIn(String table) ;
public abstract  boolean logOut() ;
public abstract boolean setUniversity(University university) ;
public abstract boolean setFaculty(University faculty); 
public abstract boolean getUniversity() ;
public abstract boolean getFaculty(); 

}
