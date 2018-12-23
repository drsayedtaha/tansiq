package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Page;
import com.cse.tansik.DTO.User;

import java.util.List;

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
  public void setUsersFilter(int role);
  public  void setUsersFilter(EduYear edu_year);
  public  void setUsersFilter(User user);
  public void resetFilter();

  public ArrayList<EduYear> getEduYear();


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
  
  
    

//  ArrayList<Admin> getAllAdmins();  
//  ArrayList<Student> getAllStudents();
//  
//  merged in get users just pass the role

    public void addAmin(Admin admin);
}
