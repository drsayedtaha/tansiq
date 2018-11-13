package com.cse.tansik.DAL;

import java.sql.Date;
import java.util.List;
import com.cse.tansik.dto.*;

public interface AdminDAO extends UserDAO  { 

    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    List<Student> getStudent (EduYear eduYear);

    
    boolean addDepartment(Department department);
    boolean deleteDepartment(Department department);
    List<Department> getDepartments(EduYear eduYear);

    boolean setDate(EduYear eduYear,Date startDate,Date endDate);

} 