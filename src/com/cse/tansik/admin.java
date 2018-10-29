package tansik;

public abstract class admin extends user 
{
	
	private branch[] branches;

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
	public abstract boolean setSubject(subject subject, float degree) 
	;
	public abstract boolean setBranches(branch[]branches) 
	;
    public abstract boolean saveData ();


}
