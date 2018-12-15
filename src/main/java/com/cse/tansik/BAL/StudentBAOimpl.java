package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.List;

public class StudentBAOImpl implements StudentBAO {
    public StudentBAOImpl() {
        super();
    }


    public boolean addRequest(List<Request> requests) {
        return false;
    }

    public boolean sendMessage(String text, Student admin) {
        return false;
    }

    public Message getMessage() {
        return null;
    }

    public String login(String name, String password) {
        return null;
    }
}
