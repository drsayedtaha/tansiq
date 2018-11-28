package com.cse.tansik.DAL;

import com.cse.tansik.DTO.User;

import java.util.Collections;
import java.util.List;

public class GMDAOImpl implements GMDAO {
    public GMDAOimp() {
        super();
    }

    @Override
    public List getAllAdmins() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public List getAllStudents() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean isExist(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean addUser(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List getAlUsers() {
        // TODO Implement this method
        return Collections.emptyList();
    }

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
    public student getStudent(String string) {
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
    public list getPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }

    @Override
    public list addPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }
}
