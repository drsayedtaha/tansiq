package com.cse.tansik.BAL;
import com.cse.tansik.dto.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public interface UserBAO {
public User login (String name ,String password);

   
    public boolean addRequest (<List>Request requests);

}
 