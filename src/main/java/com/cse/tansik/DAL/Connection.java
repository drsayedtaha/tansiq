package com.cse.tansik.DAL;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Connection function serves all the DAL
 * 12/2/2018 
 * Author: Abdullah khaled
 */
public class Connection {
    
    private static String query,username,password,service;

    public static void setQuery(String query) {
        Connection.query = query;
    }

    public static void setUsername(String username) {
        Connection.username = username;
    }

    public static void setPassword(String password) {
        Connection.password = password;
    }

    public static void setService(String service) {
        Connection.service = service;
    }

    public static ResultSet connect(){
           
                String url = "jdbc:thin:@//localhost:1521:"+service;
                   
                try(java.sql.Connection con = DriverManager.getConnection(url,username,password);
                    Statement statement = con.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    ){
                        return rs;
                    }
                    catch(SQLException ex){
                        System.out.println("An error while connecting to database "+ex);
                    }
                return null;
                }
        
}
