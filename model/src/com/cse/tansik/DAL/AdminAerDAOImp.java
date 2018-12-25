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
import com.cse.tansik.util.getconrction;

public class AdminAerDAOImp implements AdminAerDAO {

	/**
	 * THERE'S NO DATABASE IN THIS LAP :D
	 * and this url and user name and password coppied it's valued from lecture 14 :D
	 */
	
	String url = getconrction.url;
	String username = getconrction.username;
	String password = getconrction.password;
	Admin admin = new Admin();
	EduYear eduLevel = new EduYear() ;
	/**
	 * it save a new admin and return value -1 or 0 or 1
	 */
	@Override
	public Integer save(Admin admin) {
		
		
		Integer res = -1 ;
		String dmlStat = "INSERT INTO USERS (ID , USER_NAME , FIRST_NAME , MIDDLE_NAME , LAST_NAME , PASSWORD  , EMAIL , ROLE ) Values (?,?,?,?,?,?,?,?) ;"
+" INSERT INTO ADMIN_EDU_YEAR (USER_ID , EDU_LEVEL) Values (?,?) ;";
//+" INSERT INTO EDU_LEVEL (ID , UNIVERSITY , DEPARTMENT , FACULTY , YEAR , DEPARTMENT_ID ) Values (?,?,?,?,?,?) ";
			try (Connection con =DriverManager.getConnection (url, username, password);
					PreparedStatement stmt = con.prepareStatement (dmlStat);
				){
				// set the corresponding parameter
				
				// Insert into ADMIN table 
					stmt.setInt(1, admin.getId());
					stmt.setString(2, admin.getUserName());
					stmt.setString(3, admin.getFirstName());
					stmt.setString(4, admin.getSecondName());
					stmt.setString(5, admin.getLastName());
					stmt.setString(6, admin.getPassword());
					stmt.setString(7, admin.getEmail());
					stmt.setInt(8, admin.getRole());
					
				//Insert into ADMIN _EDU_YEAR
					stmt.setInt(9, admin.getId());
					stmt.setInt(10, eduLevel.getId());
					/*
				//Insert into EDU_LEVEL 	
					stmt.setInt(11, eduLevel.getId());
					stmt.setString(12, eduLevel.getUniversity());
					stmt.setString(13, eduLevel.getDepartment());
					stmt.setString(14, eduLevel.getFaculty());
					stmt.setInt(15, eduLevel.getYear());
					stmt.setInt(16, eduLevel.getDepartmentId());
					*/
//					result = stmt.executeUpdate ();
				} 
			catch(SQLException ex) {
			    ex.printStackTrace();
			}
		 return res ;
	}
	/**
	 * this method update an ADMIN saved already in the database
	 */
	@Override
	public Boolean update(Admin admin) {
	    String dmlState = "UPDATE ADMIN SET ( USER_NAME , FIRST_NAME , SECOND_NAME , LAST_NAME , PASSWORD  , EMAIL , ROLE ) WHERE ID = ? "
	    		+ " Values (?,?,?,?,?,?,?,?); UPDATE EDU_LEVEL SET (UNIVERSITY , DEPARTMENT , FACULTY , YEAR , DEPARTMENT_ID ) WHERE ID = ? \"\r\n" + 
				"			+ \" Values (?,?,?,?,?,?)";
	    try (Connection con =DriverManager.getConnection (url, username, password);
	        	PreparedStatement stmt = con.prepareStatement (dmlState);
	        		){
	        					// set the corresponding parameter
	    							stmt.setInt(1, admin.getId());
	    						
	    							stmt.setString(2, admin.getUserName());
	    							stmt.setString(3, admin.getFirstName());
	    							stmt.setString(4, admin.getSecondName());
	    							stmt.setString(5, admin.getLastName());
	    							stmt.setString(6, admin.getPassword());
	    							stmt.setString(7, admin.getEmail());
	    							stmt.setInt(8, admin.getRole());
	    						//Update into EDU_LEVEL
	    							stmt.setInt(9, admin.getId());
	    							stmt.setString(10, eduLevel.getUniversity() );
	    							stmt.setString(11, eduLevel.getDepartment());
	    							stmt.setString(12, eduLevel.getFaculty());
	    							stmt.setInt(13, eduLevel.getYear());
	    							stmt.setInt(14 , eduLevel.getDepartmentId());
	    							
	        						stmt.executeUpdate ();
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
	 return true ;
}
	        		

	@Override
	public Boolean delete(Integer id) {
		String dmlState = "DELETE FROM ADMIN WHERE id = ?" + "DELETE FROM EDU_LEVEL WHERE id = ?" + "DELETE FROM ADMIN_EDU_YEAR WHERE id = ?" ;
		 
        try (Connection con =DriverManager.getConnection (url, username, password);
				PreparedStatement stmt = con.prepareStatement (dmlState); 
        		){
        	
            // set the corresponding parameter
            stmt.setInt(1, admin.getId());
            stmt.setInt(2, admin.getId());
            stmt.setInt(3, admin.getId());
            // execute the delete statement
            stmt.executeUpdate ();
 
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
	

	
}
