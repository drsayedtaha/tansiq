package com.cse.tansik.DAL;

import java.util.List;

import com.cse.tansik.DTO.*;

import java.sql.ResultSet;

public interface UserDAO {
    public boolean isExist(String username, String password);
    public User getUser(String username, String password);

    boolean addMessage(Message message);
    boolean deletMessage(Message message);
    List<Message> getMessages(User user);

    //student request for department
    boolean addRequest(Request request, Student student);
    boolean deletRequest(Request request, Student student);
    List<Request> getAllRequests(Student student);

}
