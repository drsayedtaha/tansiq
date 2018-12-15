package com.cse.tansik.DAL;

import java.util.List;
import com.cse.tansik.DTO.*;

public interface GMDAO  {
  List<Admin> getAllAdmins();
  List<Student> getAllStudents();

  
  boolean addUser(User user);
  boolean deleteUser(User user);
  List<User> getAlUsers();



    public void addAmin(Admin admin);
}
