package com.cse.tansik;

public abstract class University {
        private String name;
        private int id;
    	public abstract int getId();
    	
    
	private Faculty [] faculties;
    public abstract boolean setUniversity(String name);

    public abstract String getUniversityName();
}
