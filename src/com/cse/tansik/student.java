package com.cse.tansik;

public abstract class student extends User {
	private subject[] subjects;
	private Branch[] branches;
	private String nationalID;
	private float degree;
	private  int year;
	public abstract void SelectBranche (String name );
	public abstract void deSelectBranche (String name);
	public abstract boolean saveData ();
	public abstract boolean sendFeedback ();
    public abstract boolean SelectSubject (String name ,float degree );
    public abstract void getBranche ();
    	

}
