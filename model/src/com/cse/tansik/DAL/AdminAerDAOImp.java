/**
  * author : AbdAlla - AboElMagd
 * 
 */
package com.cse.tansik.DAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.EduYear;

public class AdminAerDAOImp implements AdminAerDAO {

	/**
	 * THERE'S NO DATABASE IN THIS LAP :D
	 * and this url and user name and password coppied it's valued from lecture 14 :D
	 */
    private String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private String username = "TANSIQ";
    private  String password = "TANSIQ";
    Admin admin = new Admin();
	EduYear eduLevel = new EduYear();
	static Integer id = 10 ;
	/**
	 * it save a new admin and return value -1 or 0 or 1
	 */
	@Override
	public Integer save(Admin admin) {
		id++ ;
		admin.setId(id);
		eduLevel.setId(id);
		
		Integer result = -1 ;
		String dmlStatAdmin = "INSERT INTO USERS (ID , USER_NAME , FIRST_NAME , MIDDLE_NAME , LAST_NAME , PASSWORD  , EMAIL , ROLE )"
			+ " Values (?,?,?,?,?,?,?,?) " ;
		String dmlStatAEY = "INSERT INTO ADMIN_EDU_YEAR (USER_ID , EDU_LEVEL)"  
			+ " Values (?,?)" ; 
		String dmlStatEdu = "INSERT INTO EDU_LEVEL (ID , UNIVERSITY , DEPARTMENT , FACULTY , YEAR , DEPARTMENT_ID )" 
			+ " Values (?,?,?,?,?,?)";
			try (Connection con =DriverManager.getConnection (url, username, password);
					PreparedStatement stmt1 = con.prepareStatement (dmlStatAdmin);
					PreparedStatement stmt2 = con.prepareStatement (dmlStatAEY);
					PreparedStatement stmt3 = con.prepareStatement (dmlStatEdu);
				){
				// set the corresponding parameter
				
				// Insert into ADMIN table 
					stmt1.setInt(1, admin.getId());
					stmt1.setString(2, admin.getUserName());
					stmt1.setString(3, admin.getFirstName());
					stmt1.setString(4, admin.getSecondName());
					stmt1.setString(5, admin.getLastName());
					stmt1.setString(6, admin.getPassword());
					stmt1.setString(7, admin.getEmail());
					stmt1.setInt(8, admin.getRole());
					
				//Insert into ADMIN _EDU_YEAR
					stmt2.setInt(9, admin.getId());
					stmt2.setInt(10, eduLevel.getId());
					
				//Insert into EDU_LEVEL 	
					stmt3.setInt(11, eduLevel.getId());
					stmt3.setString(12, eduLevel.getUniversity());
					stmt3.setString(13, eduLevel.getDepartment());
					stmt3.setString(14, eduLevel.getFaculty());
					stmt3.setInt(15, eduLevel.getYear());
					stmt3.setInt(16, eduLevel.getDepartmentId());
					
					stmt1.executeUpdate ();
					stmt2.executeUpdate ();
					stmt3.executeUpdate ();
					result = stmt1.executeUpdate ();
				} 
			catch(SQLException ex) {
				while(ex != null) {
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("Error Code:" + ex.getErrorCode());
				System.out.println("Message:" + ex.getMessage());
				Throwable t = ex.getCause();
				while(t != null) {
				System.out.println("Cause:" + t);
				t = t.getCause();
				}
				ex = ex.getNextException();
				}
			}
		 return result ;
	}
	/**
	 * this method update an ADMIN saved already in the database
	 */
	@Override
	public Boolean update(Admin admin) {
	    String dmlStatAdmin = "UPDATE USERS SET (USER_NAME , FIRST_NAME , MIDDLE_NAME , LAST_NAME , PASSWORD  , EMAIL , ROLE ) WHERE ID = ? "
				+ " Values (?,?,?,?,?,?,?) " ;
			String dmlStatEdu = "UPDATE EDU_LEVEL SET (UNIVERSITY , DEPARTMENT , FACULTY , YEAR , DEPARTMENT_ID ) WHERE ID = ? " 
				+ " Values (?,?,?,?,?)" ;
	    try (Connection con =DriverManager.getConnection (url, username, password);
	    		PreparedStatement stmt1 = con.prepareStatement (dmlStatAdmin);
				PreparedStatement stmt2 = con.prepareStatement (dmlStatEdu);
	        		){
	        					// set the corresponding parameter
	    							stmt1.setInt(1, admin.getId());
	    					
	    							stmt1.setString(2, admin.getUserName());
	    							stmt1.setString(3, admin.getFirstName());
	    							stmt1.setString(4, admin.getSecondName());
	    							stmt1.setString(5, admin.getLastName());
	    							stmt1.setString(6, admin.getPassword());
	    							stmt1.setString(7, admin.getEmail());
	    							stmt1.setInt(8, admin.getRole());
	    						//Update into EDU_LEVEL
	    							stmt2.setInt(9, admin.getId());
	    							stmt2.setString(10, eduLevel.getUniversity() );
	    							stmt2.setString(11, eduLevel.getDepartment());
	    							stmt2.setString(12, eduLevel.getFaculty());
	    							stmt2.setInt(13, eduLevel.getYear());
	    							stmt2.setInt(14 , eduLevel.getDepartmentId());
	    							
	        						stmt1.executeUpdate ();
	        						stmt2.executeUpdate ();
	        		 }
	    catch(SQLException ex) {
			while(ex != null) {
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("Error Code:" + ex.getErrorCode());
			System.out.println("Message:" + ex.getMessage());
			Throwable t = ex.getCause();
			while(t != null) {
			System.out.println("Cause:" + t);
			t = t.getCause();
			}
			ex = ex.getNextException();
			}
			return false ;				// TO return false if there's error
		}
	 return true ;
}
	        		

	@Override
	public Boolean delete(Integer id) {
		
		String dmlState1="SELECT EDU_LEVEL WHERE USER_ID = ?" ;
		
		String dmlState2 = "DELETE FROM ADMIN WHERE ID = ?" ;
		String dmlState3 = "DELETE FROM EDU_LEVEL WHERE USER_ID = ?" ;
		String dmlState4 = "DELETE FROM ADMIN_EDU_YEAR WHERE ID = ?" ;
		
        try (Connection con =DriverManager.getConnection (url, username, password);
				PreparedStatement stmt1 = con.prepareStatement (dmlState1);
        		PreparedStatement stmt2 = con.prepareStatement (dmlState2);
        		PreparedStatement stmt3 = con.prepareStatement (dmlState3);
        		PreparedStatement stmt4 = con.prepareStatement (dmlState4);
        		PreparedStatement stmt = con.prepareStatement (dmlState1);
        		ResultSet rs = stmt.executeQuery (dmlState1) 
        		){
        	
            // set the corresponding parameter
        	
		while (rs.next()) {
			eduLevel.setId((rs.getInt("ID")));
		}
            stmt1.setInt(1, admin.getId());
            stmt2.setInt(2, admin.getId());
            stmt3.setInt(3, eduLevel.getId());
            // execute the delete statement
            stmt1.executeUpdate ();
            stmt2.executeUpdate ();
            stmt3.executeUpdate ();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return true ; 
    }

	@Override
	public List<Admin> listAll() {
		List<Admin> listAll = new ArrayList<Admin>();
		String query = "SELECT * FROM USER";
		try (Connection con =DriverManager.getConnection (url, username, password);
				PreparedStatement stmt = con.prepareStatement (query);
				ResultSet rs = stmt.executeQuery (query)) {
			while (rs.next()) {
				admin.setId(rs.getInt("ID"));
				admin.setUserName(rs.getString("UserName"));
				admin.setFirstName(rs.getString("FirstName"));
				admin.setSecondName(rs.getString("SecondName"));
				admin.setLastName(rs.getString("LastName"));
				admin.setPassword(rs.getString("Password"));
				admin.setEmail(rs.getString("Email"));
				admin.setRole(rs.getInt("Role"));
				
				eduLevel.setFaculty(rs.getString("Faculty"));
				eduLevel.setYear(rs.getInt("Year"));
				eduLevel.setDepartment(rs.getString("Departemt"));
				eduLevel.setUniversity(rs.getString("Departemt"));
				eduLevel.setDepartmentId(rs.getInt("DepartemtID"));
				
				System.out.println("Admin ID: " + admin.getId() + "FirstName: " + admin.getFirstName() + "Second Name: " + admin.getSecondName() + "Last Name: " +admin.getLastName()+ "User Name: " + admin.getUserName() + "Password: " + admin.getPassword()+ "Email: " + admin.getEmail() + "Role: " + admin.getRole() + "Faculty:"+ eduLevel.getFaculty() + "Univercity: " + eduLevel.getUniversity() + "Year: " + eduLevel.getYear() + "Departemt" + eduLevel.getDepartment() +  "Departemt ID" + eduLevel.getDepartmentId() );
				listAll.add( admin );
			} // end of while
		} catch (SQLException e) {
		System.out.println("SQL Exception: " + e);
		} // end of try-with-resources
				return listAll ;
	}
/**
 *  NOT MY WORK :D
 */
	/*
	@Override
	public List<Admin> searchBy(String key, Integer searchType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> searchBy(Map<String, Integer> searchMap) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
