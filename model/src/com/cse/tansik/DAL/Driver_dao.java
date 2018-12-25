package com.cse.tansik.DAL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Driver_dao{
public static void main (String[] args) throws Exception {
    getConnection();
    }
public static Connection getConnection() throws Exception {
try {
String driver  = "com.mysql.jdbc.Driver";
String url ="jdbc:oracle:thin:@localhost:1523:orclorcl218";
String username = "hr";
String password = "hr";

            Connection conn = DriverManager.getConnection(url,username,password);
    Statement st = conn.createStatement();
    
    ////////
System.out.println ("connected!");
    return conn;
}
catch (Exception e) {
System.out.println(e);
}
return null;
} 
}