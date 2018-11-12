package com.cse.tansik.BAL;

import com.cse.tansik.dto.Student;
import com.cse.tansik.dto.User;
import com.cse.tansik.dto.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public interface AdminBAO extends UserBAO
{
    Student getData(User user);
    boolean setRequsets (List<Request> requests);
    boolean sendMessage();
    Message getMessage();
    boolean setDate(Date start ,Date end);
    Student getStudent(String userName ,String Password);
    boolean editStudent(Student student);
   List< Student> getAllStudents();
    boolean editPrequistes(Prequistes preq,Department dep);
    List<Prequistes>  getPrequsites(Department dep); 
    Department getDep(EduYear year ,String name);
   List<Department> getDeps (EduYear year);
    
    
}
