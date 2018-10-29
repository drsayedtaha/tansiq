 package com.cse.tansik; 
public abstract class branch {
	 subject [] subjects;
    int maxCapcity;
    int minCapcity;
    
	public abstract boolean setBranch(String Fname,String name ,int maxCapcity, int minCapcity) ;
    public abstract int getBranchCapcityMax ( );
    public abstract int getBranchCapcityMIN ( );
    public abstract String getBranchname ( );
       

}
