package com.cse.tansik;

public abstract class AdminServer extends User {
	public abstract boolean addAdmin (Faculty f,String name) ;
        public abstract boolean SetAdmin (Faculty f,String name) ;
	public abstract boolean removeAdmin (Faculty f,String name) ;
	public abstract com.cse.tansik.Admin getAdmin (Faculty f,String name) ;
    public abstract boolean saveData ();

	
	

}
