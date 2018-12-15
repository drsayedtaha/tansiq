package com.cse.tansik.DAL;

import com.cse.tansik.BAL.StudentBAO;
import com.cse.tansik.BAL.StudentBAOImpl;
import com.cse.tansik.BAL.UserBAO;
import com.cse.tansik.BAL.UserBAOImpl;
import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;

import com.cse.tansik.DTO.User;

import java.sql.ResultSet;

import java.util.Collections;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {

    UserDAO userBAO=new UserDAOImpl();
    StudentDAO StudentDAO=new StudentDAOImpl();

    public boolean addStudent(Student student) {
        return false;
    }

    public boolean deleteStudent(Student student) {
        return false;
    }

    public Student getStudent(String id) {
        return null;
    }

    public List<Student> getAllStudents(EduYear eduYear) {
        return Collections.emptyList();
    }

    public boolean addDepartment(Department department) {
        return false;
    }

    public boolean deleteDepartment(Department department) {
        return false;
    }

    public List<Department> getAllDepartments(EduYear eduYear) {
        return Collections.emptyList();
    }

    public boolean setDateEduYear(EduYear eduYear) {
        return false;
    }

    public EduYear getDateEduYear(EduYear eduYear) {
        return null;
    }

    public List<Prequistes> getPrequiste(Department department) {
        return Collections.emptyList();
    }

    public List<Prequistes> addPrequiste(Department department) {
        return Collections.emptyList();
    }
}
