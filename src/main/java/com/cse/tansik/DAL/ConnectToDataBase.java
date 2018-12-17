package com.cse.tansik.DAL;

import java.net.URL;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;

public class ConnectToDataBase {
    public static <E> List<E> ConnectToDataBaseAndReturnAList(String url , String username ,String password, String query){
            
            try {
                java.sql.Connection con = DriverManager.getConnection(url, username, password);
                Statement stmnt = con.createStatement();
                // USING FULL JOIN TO GET ALL INFO OF STUDENT
                ResultSet res = stmnt.executeQuery(query);
                //TODO ask for someway to return an object from the previous statement
                while(res.next()){
                    
                    }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
