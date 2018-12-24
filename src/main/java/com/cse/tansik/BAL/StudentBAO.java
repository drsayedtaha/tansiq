package com.cse.tansik.BAL;
import com.cse.tansik.DTO.*;

import java.util.List;

public interface StudentBAO extends UserBAO {
    public boolean addRequest (List<Request> requests);
        boolean sendMessage(String text, Student admin);
        Message getMessage();
    
}
