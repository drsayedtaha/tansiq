package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.Collections;
import java.util.List;

public class GMBAOImp implements GMBAO {
    public GMBAOImp() {
        super();
    }
    UserBAO userBAO=new UserBAOImpl();
    StudentBAO StudentBAO=new StudentBAOImpl();
    AdminBAO adminBAO=new AdminBAOImp();
    public List<Admin> getAllAdmins() {
        return Collections.emptyList();
    }

    public List<Student> getAllStudent() {
        return Collections.emptyList();
    }

    public boolean editUser(User user) {
        return false;
    }

    public boolean addAdmin(Admin admin) {
        return false;
    }

    public boolean removeAdmin(Admin admin) {
        return false;
    }
}
