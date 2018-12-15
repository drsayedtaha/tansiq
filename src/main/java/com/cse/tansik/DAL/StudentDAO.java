package com.cse.tansik.DAL;

import com.cse.tansik.DTO.*;

public interface StudentDAO {

    
    /*
    *   get student department after
    *   coordination finshes
    */
    Department getDepartment(Student student);

}
