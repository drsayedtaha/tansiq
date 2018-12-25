/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.tansik.BAL;

import com.cse.tansik.DAL.*;
import com.cse.tansik.DTO.*;




/**
 *
 * @author ZAS
 */
public class LoginBaoImp implements  LoginBao {


 User user = new User();
 LoginDao logindao = new LoginDao();


    @Override
    public User login(String userName,String password)
    {
        user = logindao.login(userName);
     if (user.getPassword()==password) {
    	return user;    	
     }
          else {
     return null;
    	 }

    } 

  
    
    
    
}


