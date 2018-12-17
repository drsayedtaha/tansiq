package com.cse.tansik.DAL;

import java.util.List;
import com.cse.tansik.DTO.*;

import java.util.ArrayList;

public interface GMDAO extends AdminDAO {
  
  
  boolean isExist (User user);
  boolean addUser(User user);
  boolean deleteUser(User user);

  //TODO try making a generic add
  //TODO add try and catch
  
  
    /**
     *author abdelrahman ragab hashem
     * date 4/12
     *
     * getalluser return a list of all users from database with complete data
     * based in  role , edu level
     *
     * @return
     */
  public ArrayList<User> getUsers();
  public ArrayList<User> getUsers(int role);
  public  ArrayList<User> getUsers(int role,int edu_year);



    /**
     *author abdelrahman ragab hashem
     * date 4/12
     * 
     * git all pages based in role 
     * @return
     */
  public ArrayList<Page> get_all_Pages();
  public ArrayList<Page> get_all_Pages(int role);


//  ArrayList<Page> getPage();  
//  ArrayList<Page> getPage(int role);
  
  
    
/*  edits in interface
  //  ArrayList<Admin> getAllAdmins();  
  //  ArrayList<Student> getAllStudents();
  //  
  //  merged in get users just pass the role
*/
    public void addAmin(Admin admin);
}
