package tansik;

public abstract  class AdminServer extends user {
	public abstract boolean addAdmin (faculty f,String name) ;
	public abstract boolean removeAdmin (faculty f,String name) ;
	public abstract admin getAdmin (faculty f,String name) ;
    public abstract boolean saveData ();

	
	

}
