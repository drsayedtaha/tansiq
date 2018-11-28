package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.List;

public class StudentBAOImpl implements StudentBAO {
    public StudentBAOimpl() {
        super();
    }

    @Override
    public boolean addRequest(List<Request> requests) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean sendMessage(String text, Student admin) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Message getMessage() {
        // TODO Implement this method
        return null;
    }

    @Override
    public User login(String name, String password) {
        // TODO Implement this method
        return null;
    }
}
