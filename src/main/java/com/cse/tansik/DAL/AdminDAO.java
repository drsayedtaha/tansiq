package com.cse.tansik.DAL;

import java.sql.Date;
import java.util.List;
import com.cse.tansik.DTO.*;

public interface AdminDAO extends UserDAO  { 
    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    List<Student> getAllStudents (EduYear eduYear);

    
    boolean addDepartment(Department department);
    boolean deleteDepartment(Department department);
    List<Department> getAllDepartments(EduYear eduYear);

    boolean setDate(EduYear eduYear,Date startDate,Date endDate);

    
} 