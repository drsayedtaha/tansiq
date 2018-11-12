package com.cse.tansik.student.dal;

import com.cse.tansik.dto.*;

public interface StudentDAO {

    /*
    *get/set student requests
    */

    boolean addRequest(Request request);
    boolean deletRequest(Request request);
    list<Request> getRequests(User user);

    /*
    *   get student department after 
    *   coordination finshes
    */
    Department getDepartment(Student student);

}