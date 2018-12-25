package com.cse.tansik.DAL;


import com.cse.tansik.DTO.Message;

import com.cse.tansik.DTO.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connection_2 {
        
    public static java.sql.Connection connection (){
        try{
            String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
                String username = "hr";
                String password = "hr";
                java.sql.Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("connect");
            return con;
            }
        catch (Exception e){
            System.out.println(e);}
        return null;
        }
    

        
        public static void main(String[] args) {
            
        User user = new User();
        user.setId(1);

        User user2 = new User();
        user.setId(1);

        Message messag = new Message();
        
        messag.setFrom(user);
        messag.setTo(user);
        messag.setContent("from main");
        
       Messagedao mess = new Messagedao();
       mess.addMessage(messag);
    }

}