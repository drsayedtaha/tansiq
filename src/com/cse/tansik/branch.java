package com.cse.tansik;

public abstract class Branch {
	 subject [] subjects;
    int maxCapcity;
    int minCapcity;
    int year;
    private int id;
    	public abstract int getId();
    	public abstract boolean setBranch(String Fname,String name ,int maxCapcity, int minCapcity) ;
    public abstract int getBranchCapcityMax ( );
    public abstract int getBranchCapcityMIN ( );
    public abstract String getBranchname ( );
       

}
