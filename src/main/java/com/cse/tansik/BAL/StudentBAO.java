package com.cse.tansik.BAL;
import com.cse.tansik.dto.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public interface StudentBAO extends UserBAO {
    public boolean addRequest (List<Request> requests);
        boolean sendMessage(String text, Student admin);
        Message getMessage();
    
}
