package com.cse.tansik.DAL;


import com.cse.tansik.DTO.Message;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Messagedao {
    
    private static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static String username = "hr";
    private static String password = "hr";

    boolean addMessage(Message message){
        String query = "insert into messages (from_user_id ,to_user_id ,report) values( "
                       +message.getFrom().getId()+" , "
                        +message.getTo().getId()+" , ' "
                        +message.getContent()+" ' ) "  ;
     
                    
        System.out.println(query );
             
     
        
        java.sql.Connection myConn;
        try {
            myConn = DriverManager.getConnection(url, "hr", "hr");
            Statement myStmt = myConn.createStatement();
            ResultSet myRes = myStmt.executeQuery(query) ;
        return true;
        } catch (SQLException e) {
            
System.out.println(e);
        }
        return false;
        }
        boolean updateMessage(Message message){
            String query = "update messages (from_user_id ,to_user_id ,report) values( "
                           +message.getFrom().getId()+" , "
                            +message.getTo().getId()+" , ' "
                            +message.getContent()+" ' ) "  ;
         
                        
            System.out.println(query );
                 
         
            
            java.sql.Connection myConn;
            try {
                myConn = DriverManager.getConnection(url, "hr", "hr");
                Statement myStmt = myConn.createStatement();
                ResultSet myRes = myStmt.executeQuery(query) ;
            return true;
            } catch (SQLException e) {
                
        System.out.println(e);
            }
            return false;
    }
            boolean deleteMessage(Message message){
                String query = "delete messages (from_user_id ,to_user_id ,report) values( "
                               +message.getFrom().getId()+" , "
                                +message.getTo().getId()+" , ' "
                                +message.getContent()+" ' ) "  ;
             
                            
                System.out.println(query );
                     
             
                
                java.sql.Connection myConn;
                try {
                    myConn = DriverManager.getConnection(url, "hr", "hr");
                    Statement myStmt = myConn.createStatement();
                    ResultSet myRes = myStmt.executeQuery(query) ;
                return true;
                } catch (SQLException e) {
                    
            System.out.println(e);
                }
                return false;
        }}

  