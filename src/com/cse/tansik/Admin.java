package com.cse.tansik;

public abstract class Admin extends User 
{
	
	private Branch[] branches;

    public boolean addSubject(String name,float Degree) 
	{
	 return true;
	}
	public void addBranche (String Fname,String name ,int maxCapcity, int minCapcity) 
	{}
	public void setCloseTime (String date) 
	{}
	public void AddStudent (student Student) 
	{}
    public void RemoveStudent (student Student) 
    {}
	public abstract boolean setSubject(subject subject, float degree) 
	;
	public abstract boolean setBranches(Branch[]branches) 
	;
    public abstract boolean saveData ();


}
