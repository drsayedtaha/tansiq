package com.cse.tansik.DAL;

import java.sql.Date;
import java.util.List;
import com.cse.tansik.DTO.*;

public interface AdminDAO extends UserDAO  { 
    boolean isExist (Student student);
    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    Student getStudent(String id);    //added for admin if he need one student by id
    List<Student> getAllStudents (EduYear eduYear);

    
    boolean isExist(Department department);    
    boolean addDepartment(Department department);
    boolean deleteDepartment(Department department);
    List<Department> getAllDepartments(EduYear eduYear);

    boolean setDateEduYear(EduYear eduYear);  
    EduYear getDateEduYear(EduYear eduYear);
    
    List<Prequistes> getPrequiste(Department department);
    List<Prequistes> addPrequiste(Department department);

} 