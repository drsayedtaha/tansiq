package com.cse.tansik.BAL;

import java.util.List;

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

import java.util.ArrayList;

public interface GMBAO {

  /**
   * aouthor :abdelrhman ragab hashem date : 12/2 returns a list of all admins in
   * the DB if the DataBase is found and the view will update its pages (the page
   * that will have the result) according to that list
   *
   * @param void no need for params
   * @return List<Users>
   * 
   */

  public ArrayList<com.cse.tansik.DTO.User> getAllAdmins();

  /**
   * aouthor :abdelrhman ragab hashem date : 12/2 returns a list of all students
   * in the DB if the DataBase is found and the view will update its pages (the
   * page that will have the result) according to that list
   *
   * @param void no need for params
   * @return List<Users>
   * 
   */
  public ArrayList<com.cse.tansik.DTO.User> getAllStudent();

  /**
   * aouthor :abdelrhman ragab hashem date : 12/2
   * 
   * 
   * returns a list of all users in the DB
   * 
   * if the DataBase is found and the view will update its pages (the page that
   * will have the result) according to that list
   *
   * @param void no need for params
   * @return List<Users>
   * 
   */
  public ArrayList<com.cse.tansik.DTO.User> getALLUsers();

  /**
   * author : abdelrahman ragab hashem date 12/3
   * 
   * 
   * get all pages from db based in role of viewers
   * 
   * @return
   */

  public ArrayList<Page> get_all_pages();

  public ArrayList<Page> get_all_admin_pages();

  public ArrayList<Page> get_all_student_pages();

  boolean editUser(User user);

  boolean addAdmin(Admin admin);

  boolean removeAdmin(Admin admin);

}
