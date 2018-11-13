package com.cse.tansik.DAL;

import com.cse.tansik.dto.*;
import java.util.List;

public interface StudentDAO extends UserDAO{

    /*
    *get/set student requests
    */

    boolean addRequest(Request request);
    boolean deletRequest(Request request);

    /*
    *   get student department after
    *   coordination finshes
    */

}
