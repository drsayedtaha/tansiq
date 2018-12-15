package com.cse.tansik.DAL;

import com.cse.tansik.BAL.StudentBAO;
import com.cse.tansik.BAL.StudentBAOImpl;
import com.cse.tansik.BAL.UserBAO;
import com.cse.tansik.BAL.UserBAOImpl;
import com.cse.tansik.DTO.*;

import java.util.Collections;
import java.util.List;

public class GMDAOImpl implements GMDAO {
    UserDAO userDAO=new UserDAOImpl();
    StudentDAO StudentDAO=new StudentDAOImpl();


    @Override
    public List getAllAdmins() {
        // TODO Implement this method
        return Collections.emptyList();
    }

    public List<Student> getAllStudents() {
        return Collections.emptyList();
    }

    public boolean addUser(User user) {
        return false;
    }

    public boolean deleteUser(User user) {
        return false;
    }

    public List<User> getAlUsers() {
        return Collections.emptyList();
    }

    public void addAmin(Admin admin) {
    }
}
