package com.cse.tansik.BAL;
import java.util.List;

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

public interface GMBAO extends {
  List< Admin>  getAllAdmins();
  List<Student>  getAllStudent();
  boolean editUser(User user);
  boolean addAdmin(Admin admin);
  boolean removeAdmin(Admin admin);
  

}
