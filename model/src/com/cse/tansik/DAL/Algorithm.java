package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Student;

import com.sun.rowset.RowSetFactoryImpl;

import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


/**
 * this is a dummy function was made just to implement the algorithm stuff
 * i donno if this is gonna remain like that but i will create and edit it anyway
 */
public class Algorithm {
    //Finals
    private final String URL = "jdbc:oracle:thin@localhost:1521:orcl";
    private final String USERNAME = "hr";
    private final String PASSWORD = "1234";

    public void getStudentInAssendingOrder(){

        try (JdbcRowSet myJdbcRowSet =RowSetProvider.newFactory().createJdbcRowSet();){
            myJdbcRowSet.setUrl(URL);
            myJdbcRowSet.setUsername(USERNAME);
            myJdbcRowSet.setPassword(PASSWORD);
            myJdbcRowSet.setCommand("SELECT * FROM USERS FULL OUTER JOIN STUDENT ON USERS.ID =STUDENT.USER_ID " +
                                    "ORDER BY STUDENT.TOTAL_MARK DESC");
            while(myJdbcRowSet.next()){
                    System.out.println("ID :"+myJdbcRowSet.getInt("ID"));
                    System.out.println("NAME :"+myJdbcRowSet.getString("FIRST_NAME"));
                    System.out.println("MARK :"+myJdbcRowSet.getInt("ID"));
                    
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
}
