package com.cse.tansik.DAL;

import java.util.List;
import com.cse.tansik.DTO.*;

public interface GMDAO extends AdminDAO {
  List<Admin> getAllAdmins();
  List<Student> getAllStudents();

  
  boolean isExist (User user);
  boolean addUser(User user);
  boolean deleteUser(User user);
  List<User> getAlUsers();

}
