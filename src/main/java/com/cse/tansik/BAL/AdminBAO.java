package com.cse.tansik.BAL;


import com.cse.tansik.DTO.*;
import java.util.*;
import java.util.List;

public interface AdminBAO extends UserBAO
{
    Student getData(User user);
    boolean setRequsetsForStudent (List<Request> requests,Student student);
    boolean sendMessage(String text, Student student);
    Message getMessage();
    boolean setDate(Date start ,Date end);
    Student getStudent(String userName ,String Password);
    boolean editStudent(Student student);
   List< Student> getAllStudents();
    boolean editPrequistes(Prequistes preq,Department dep);
    List<Prequistes>  getPrequsites(Department dep); 
    Department getDep(EduYear year ,String name);
   List<Department> getDeps (EduYear year);
    Admin getData();
    boolean setData();
    
}
