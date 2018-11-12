package com.cse.tansik.user.dal;

import java.util.List;

import com.cse.tansik.dto.*;

public interface UserDAO {
    public boolean isExist(String username, String password);
    public User getUser(String username, String password);

    boolean addMessage(Message message);
    boolean deletMessage(Message message);
    List<Message> getMessages(User user);

}