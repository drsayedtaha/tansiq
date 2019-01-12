package dal;

import dto.AdminDTO;
import dto.StudentDTO;
import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

public class AdminDALImpl {
    
    public AdminDTO login(UserDTO user){
        AdminDTO admin = new AdminDTO(user);
        ArrayList<Integer> eduLevels = new ArrayList<>();
        admin.setId(user.getId());
        try(
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","hr","hr");
            Statement statemnet = con.createStatement();
            ResultSet result = statemnet.executeQuery("SELECT EDU_LEVEL FROM ADMIN_EDU_YEAR WHERE USER_ID="+admin.getId());
            ){
            System.out.println(admin.getId());
            while(result.next()){
                eduLevels.add(result.getInt("EDU_LEVEL"));
                }
            admin.setEduLevels(eduLevels);
            }
        catch(SQLException ex){
            ex.printStackTrace();
            }
        System.out.println("addtion ends successfuly");
        System.out.println(admin.getEduLevels().get(0));
        return admin;
        }
    
}
