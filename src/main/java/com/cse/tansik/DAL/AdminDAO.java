package com.cse.tansik.DAL;

import java.sql.Date;
import java.util.List;
import com.cse.tansik.DTO.*;

public interface AdminDAO extends UserDAO  { 
    boolean isExist (Student student);
    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    student getStudent(String id);
    List<Student> getAllStudents (EduYear eduYear);

    
    boolean isExist(Department department);    
    boolean addDepartment(Department department);
    boolean deleteDepartment(Department department);
    List<Department> getAllDepartments(EduYear eduYear);

    boolean setDateEduYear(EduYear eduYear);  
    EduYear getDateEduYear(EduYear eduYear);
    
    
} 