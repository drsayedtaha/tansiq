package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Message;


import com.cse.tansik.DTO.User;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


public interface AdminBAO extends  {
    // remove beacause of dublication in getstudent
    // Student getStudentData(User user);
    //
    public boolean setRequsetsForStudent(List<Request> requests, Student student);
    
    public Request getRequsetsForStudent(Student student);

    /**
     *
     * @param text
     * @param student
     * @return
     * 
     */
    boolean sendMessage(Message message);
    Message getMessage(Message message);
    /**
     *note by AbdAlla AboElmagd && Mostafa Gamal
     * this method create the start&end Date of tansiq
     * @param start
     * @param end
     * @return boolean
     */

    public boolean setDate(Date start, Date end);

    public Student getStudent(User user); 

    public boolean editStudent(Student student);
    
    public List<Student> getAllStudents();



    public boolean editPrequistes(Prequistes preq, Department dep);
    public List<Prequistes> getPrequsites(Department dep);

    public boolean addDepartments(List<Department> Department);

    public List<Department> getDespartments(EduYear year);
    
    
    /**
     *string is key of 
     * @param
     * @return
     */
    public HashMap<Student,String>  solveWishes(EduYear eduyear);
    
}
