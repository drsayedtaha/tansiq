package com.cse.tansik.DAL;

import com.cse.tansik.DTO.*;

public interface StudentDAO extends UserDAO{

    
    /*
    *   get student department after
    *   coordination finshes
    */
    Department getDepartment(Student student);

}
