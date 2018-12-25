package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Student;

import java.sql.Date;
import java.util.List;

public interface AdminDAO extends UserDAO  {
    //osama --24-12
    public void addstudentsDataBase(String path , int eduLevelid);

    
    
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