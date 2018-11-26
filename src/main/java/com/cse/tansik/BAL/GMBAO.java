package com.cse.tansik.BAL;
import java.util.List;

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

public interface GMBAO extends  AdminBAO    {
  List< Admin>  getAllAdmins();
  List<Student>  getAllStudent();
   boolean editUser(User user);
   GMDAO gmDAO =new GMDAO();



}
