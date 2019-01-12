package dal;

import dto.StudentDTO;

import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDALImpl {
    public StudentDTO login(UserDTO user){
        StudentDTO student = new StudentDTO(user);
        
        student.setId(user.getId());
        try(
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","hr","hr");
            Statement statemnet = con.createStatement();
            ResultSet result = statemnet.executeQuery("SELECT TOTAL_MARK FROM STUDENT WHERE USER_ID="+student.getId());
            ){
            while(result.next()){
                student.setTotalMark(result.getInt("TOTAL_MARK"));
                }
            }
        catch(SQLException ex){
            ex.printStackTrace();
            }
        return student;
        }
}
