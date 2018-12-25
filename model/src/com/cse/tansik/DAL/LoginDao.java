/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package com.cse.tansik.DAL;

import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.User;
import com.cse.tansik.util.getconrction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
 


import java.beans.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.View;


/**
 *
 * @author ZAS
 */
public class LoginDao {


    

	
    public User login (String userName) {

        User login_user = new User();
        String query = "SELECT * FROM Users where USER_NAME = " + "'"+userName+"'";
        try (Connection con = 
             DriverManager.getConnection (getconrction.url, getconrction.username, getconrction.password);
             java.sql.Statement stmt = con.createStatement ();
             ResultSet rs = stmt.executeQuery (query)) {
            while (rs.next()) {
                

                login_user.setId(rs.getInt("ID"));
                login_user.setEmail(rs.getString("EMAIL"));
                login_user.setUserName(rs.getString("USER_NAME"));
                login_user.setFirstName(rs.getString("FIRST_NAME"));
                login_user.setSecondName(rs.getString("MIDDLE_NAME"));
                login_user.setLastName(rs.getString("LAST_NAME"));
                login_user.setRole(rs.getInt("ROLE"));
//                EduYear eduyear = new EduYear();
//
//                eduyear.setYear(rs.getInt("year"));
//                eduyear.setFaculty(rs.getString("faculty"));
//                login_user.setEduyear(eduyear);
            }
    


    }       
        catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login_user;
    }
//    
//    
//if (login_user.getRole()== 1)//admin
//    query = "SELECT * FROM ADMIN_EDU_YEAR e_y inner join EDU_LEVEL E on e_y.USER_ID = "+login_user.getId()+" where E.id=e_y.EDU_LEVEL";
//else if(login_user.getRole() == 0)//stident
//    query = "SELECT * FROM STUDENT s inner join EDU_LEVEL E on s.USER_ID = "+login_user.getId()+" where E.id=s.EDU_LEVEL";
//else if(login_user.getRole() == 2)//gm
//    return login_user;
//    
//
//    }
//    
//    try (Connection con = 
//         DriverManager.getConnection (getconrction.url, getconrction.username, getconrction.password);
//         java.sql.Statement stmt = con.createStatement ();
//            ResultSet rs = stmt.executeQuery (query)){
//
//    
//        }
//        catch (SQLException ex) {
//            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    private EduYear excuteeduyear(Reasltset rs){
//        
// {
//            while (rs.next()) {
//                
//
//                }
//            
//             }
//        catch (SQLException ex) {
//            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
//        }

//    }
    
}
