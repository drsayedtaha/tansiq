/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.tansik.view;
import com.cse.tansik.DTO.*;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author ZAS
 */
@ManagedBean
public class LoginBean {
    private String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }    public void setPassword(String password) {
        this.password = password;
    }
    
    public void isExist(){
        System.out.println("welcome "+ getUserName());
    }
}
