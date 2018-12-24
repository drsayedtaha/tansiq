package com.cse.tansik;

import com.cse.tansik.DTO.Student;
import com.cse.tansik.util.Algorithms;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String URL= "jdbc:oracle:thin:@//localhost:1521/orcl";
        String USER_NAME="hr";
        String PASSWORD="1234";
 
        Algorithms.recordStudentsWithSubjects(URL, USER_NAME, PASSWORD);
        Algorithms.addRequestToStudents(URL, USER_NAME, PASSWORD);
        
        ArrayList<Student> stnds =Algorithms.getStudents();
        
        
            }
}
