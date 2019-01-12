package dal;
import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDALImpl implements UserDAL {
    
    @Override
    public UserDTO login(String username ,String password) {
        // TODO Implement this method
        UserDTO user = new UserDTO();
        try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","hr","hr");
            Statement statement = con.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM USERS WHERE USERS.USER_NAME='"+username+"' AND USERS.PASSWORD='"+password+"'");
            ){
            if(res.next()){
                    System.out.println("Welcome!..");
                    user.setFirstName(res.getString("FIRST_NAME"));  
                      System.out.println("add first name");
                    user.setLastName(res.getString("LAST_NAME")); 
                          System.out.println("add last name");

                    user.setMiddleName(res.getString("MIDDLE_NAME"));   
                          System.out.println("add middle name");

                    user.setId(res.getInt("ID"));  
                          System.out.println("add id ");

                    user.setRole(res.getInt("Role"));     
                          System.out.println("add role "); 
                    
                }
            else{
                System.out.println("Username or password are invalid");
                return null;
                }
           
            }
        catch(SQLException e){
            e.printStackTrace();
            }
        return user;
    }

   
}
