package tansik;

abstract class user 
{
	 String name;
	 String password;
	 University University;
         public faculty faculty;
	 int id;
         String Password;

public  abstract boolean logIn(String table) ;
public abstract  boolean logOut() ;
public abstract boolean setUniversity(University university) ;
public abstract boolean setFaculty(University faculty); 
public abstract boolean getUniversity() ;
public abstract boolean getFaculty(); 

}
