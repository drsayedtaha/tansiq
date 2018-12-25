package util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.*;
/**
 * Connection function serves all the DAL
 * 12/2/2018 
 * Author: Abdullah khaled
 */
public class ConnectionDB {
    
    private static String query,username,password,service;
    private static String port="1521";
    public static void setQuery(String query) {
        ConnectionDB.query = query;
    }
    
    public static void setPort(String port) {
        ConnectionDB.port=port;
    }

    public static void setUsername(String username) {
        ConnectionDB.username = username;
    }

    public static void setPassword(String password) {
        ConnectionDB.password = password;
    }

    public static void setService(String service) {
        ConnectionDB.service = service;
    }
public ConnectionDB()
{}
    public static ResultSet connect(){
           
                String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
                java.sql.Connection con=null;   
                Statement statement=null;
                ResultSet rs=null;
                try
                {
                con = DriverManager.getConnection(url,"TANSIQ","TANSIQ");
                System.out.println("Connected");

                statement = con.createStatement();
                rs = statement.executeQuery(query);       
     //           System.out.println("Query ");
                return rs;
                  }  
                    catch(SQLException ex){
                        System.out.println("An error while connecting to database "+ex+"\n"+query);
                    }
        try 
        {
            if(con!=null)
            con.close();
        } catch (SQLException e) {
        }
        try 
        {
            if(statement!=null)
            statement.close();
        } catch (SQLException e) {
        }
    
        return null;
                }
    public static void  preparedQuery (String q)
    {
        setQuery(q);
            String url = "jdbc:oracle:thin:@localhost:"+port+":"+service;
            java.sql.Connection con=null;   
            Statement statement=null;
            ResultSet rs=null;
            try
            {
            con = DriverManager.getConnection(url,username,password);
            }
            catch (SQLException ex)
            {System.out.println(ex);}
        }      
        public static void fastPrepare(String pass, String port ,String Service ,String Username)
        {
        ConnectionDB.setPassword(pass);
        ConnectionDB.setPort(port);
        ConnectionDB.setUsername(Username);
        ConnectionDB.setService(Service);
        }
}