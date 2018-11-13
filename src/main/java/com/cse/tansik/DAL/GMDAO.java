package com.cse.tansik.DAL;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.cse.tansik.dto.Admin;
import com.cse.tansik.dto.Student;
import com.cse.tansik.dto.*;

public interface GMDAO extends  AdminDAO    {
  List< Admin>  getAllAdmins();
  List<Student>  getAllStudent();
  boolean addUser(User user);
  boolean deleteUser(User user);
   
}
