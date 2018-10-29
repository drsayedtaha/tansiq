package tansik;

public class admin extends user 
{
	
	private branch[] branches;
	public boolean addSubject(String name,float Degree) 
	{
	 return true;
	}
	public void addBranches (branch [] branches) 
	{}
	public void setCloseTime (String date) 
	{}
	public void AddStudent (student Student) 
	{}
	public boolean setSubject(subject subject, float degree) 
	{
		//for each sub in branch.sub[] ...set subj
	 return true;
	
	}
	public boolean setBranches(branch[]branches) 
	{
		this.branches=branches;
	 return true;
	
	}
	

}
