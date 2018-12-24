package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class Class1 {
        private static ArrayList<String> titles= new ArrayList<>();
        private static ArrayList<Integer> eduYearIds= new ArrayList<>();
        private static List<String> choises;
    public static void main(String[] args) {
        
        try(
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","hr","hr");
                        Statement sttmnt = con.createStatement();
                        ResultSet rs= sttmnt.executeQuery("SELECT EDU_LEVEL.ID,EDU_LEVEL.FACULTY,EDU_LEVEL.YEAR,EDU_LEVEL.DEPARTMENT_ID,DEPARTMENT.NAME FROM EDU_LEVEL\n" + 
                                        "inner JOIN DEPARTMENT ON EDU_LEVEL.DEPARTMENT_ID=DEPARTMENT.ID ORDER BY EDU_LEVEL.ID\n" + 
                                        "")){
                System.out.println("success");
                while(rs.next()) {
                        titles.add("Faculty: "+rs.getString("FACULTY")+" Department: "+rs.getString("NAME")+" Year: "+rs.getString("YEAR"));
                }
                        
        }catch(SQLException e) {
                e.printStackTrace();
        }
        //result = titles.get(0);
        
        
        }
    
}
