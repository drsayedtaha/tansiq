package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;

import com.cse.tansik.DTO.User;

import java.sql.ResultSet;

import java.util.Collections;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {
  
    @Override
    public boolean isExist(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean isExist(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteStudent(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Student getStudent(String string) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List getAllStudents(EduYear eduYear) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean addDepartment(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteDepartment(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List getAllDepartments(EduYear eduYear) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean setDateEduYear(EduYear eduYear) {
        // TODO Implement this method
        return false;
    }

    @Override
    public EduYear getDateEduYear(EduYear eduYear) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List getPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List addPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean isExist(String username, String password) {
        // TODO Implement this method
        return false;
    }

    @Override
    public User getUser(String username, String password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean addMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Message> getMessages(User user) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean addRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Request> getAllRequests(Student student) {
        // TODO Implement this method
        return Collections.emptyList();
    }


}
