package com.cse.tansik.admin.dal;

import java.sql.Date;

import com.cse.tansik.dto.*;

public interface AdminDAO {

    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    list<Student> getStudent (EduYear eduYear);

    
    boolean addDepartment(Department department);
    boolean deleteDepartment(Department department);
    list<Department> getDepartments(EduYear eduYear);

    boolean setDate(EduYear eduYear,Date startDate,Date endDate);

} 