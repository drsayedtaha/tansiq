package com.cse.tansik.BAL;

import com.cse.tansik.DTO.*;

import java.util.List;

public interface UserBAO {

     
    public String login (String name ,String password);
    public boolean addRequest (List<Request> requests);
}
