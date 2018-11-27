package com.cse.tansik.BAL;


import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;

import java.util.*;
import java.util.List;

public interface AdminBAO extends UserBAO {
    // remove beacause of dublication in getstudent
    // Student getStudentData(User user);
    //
    boolean setRequsetsForStudent(List<Request> requests, Student student);

    boolean sendMessage(String text, Student student);
    Message getMessage();

    boolean setDate(Date start, Date end);

    Student getStudent((User user); // implement
    boolean editStudent(Student student);
    List<Student> getAllStudents();



    boolean editPrequistes(Prequistes preq, Department dep);
    List<Prequistes> getPrequsites(Department dep);

    // add addDespartments
    boolean addDepartments(List<Department> Department);

    // remove gitdepartment cause it is not useful
    // Department getDespartment(EduYear year ,String name);
    List<Department> getDespartments(EduYear year);

}
