package com.cse.tansik.BAL;

import com.cse.tansik.DTO.*;

import java.util.List;

public interface UserBAO {

     /**
      * check if username and password is exist in database
      * and return homepage for user
      * 
      * @param userName student or admin user name
      * @param password 
      * @return string of home page to be redirected to based in authontication
      */
    public String login (String name ,String password);
    public boolean addRequest (List<Request> requests);
}
