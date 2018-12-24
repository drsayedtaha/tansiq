package com.cse.tansik.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {

    private static Connection conn = null;
    private static ConnectionUtil obj = null;

    private static ConnectionUtil getInstance() {
        if (obj == null) {
            obj = new ConnectionUtil();

        }
        return obj;
    }

    public static Connection getConnection() {

        try {
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test", "hr", "123");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //run sql statment that return resultset (select)
    public static ResultSet excuteQuery(String query) {
        Statement statment = null;
        try {

            getConnection();
            statment = conn.createStatement();
            ResultSet res = statment.executeQuery(query);

            return res;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {conn.close();} catch (SQLException ex) { ex.printStackTrace();}
           
            
            try { statment.close();} catch (SQLException ex) {  ex.printStackTrace();}
          
        }
        return null;
    }

    //run sql statment that dosn't return resultset (insert , delete, update)
    public static void excuteNoneQuery(String query) {

        Statement statment = null;
        try {
            getConnection();
            statment = conn.createStatement();
           
            statment.executeQuery(query);
          
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
              try {conn.close();} catch (SQLException ex) { ex.printStackTrace();}
           
            try { statment.close();} catch (SQLException ex) {  ex.printStackTrace();} 
        }
    }
}






//
//package com.cse.tansik.util;
//
//import java.sql.DriverManager;
//import java.sql.Connection;
//
//public class ConnectionUtil {
//
//    static Connection conn=null;
//    private ConnectionUtil(){}
//    public static Connection getConnection(){
//    
//        try {
//          if (conn==null){
//          conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test", "hr", "123");
//                         }
//       
//            }
//        catch(Exception e){
//        e.printStackTrace();
//    
//             }
//    return conn;
//    };
//    
//}
//    
//    
//    
//    
//    
//    
//    
//    
//    
////    private final java.sql.Connection connection;
////
////    /**
////     *
////     */
////    public  ConnectionUtil() {this.url = "jdbc:oracle:thin:@localhost:1521:test";
//// }
////  
////
////   
////    
////    public Connection creatConnection()throws SQLException{
////        return DriverManager.getConnection(url, username, password);
////    }
////         
////
////
////
////    public static Connection getConnection() {
////        return connection;
////    }}
//
