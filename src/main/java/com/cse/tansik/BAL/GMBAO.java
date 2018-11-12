package com.cse.tansik.BAL;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.cse.tansik.dto.Admin;
import com.cse.tansik.dto.Student;
import com.cse.tansik.dto.*;

public interface GMBAO extends  AdminBAO    {
  List< Admin>  getAllAdmins();
  List<Student>  getAllStudent();
   boolean editUser(User user);
   



}
