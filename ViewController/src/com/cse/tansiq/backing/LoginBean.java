/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.tansiq.backing;
import com.cse.tansik.DTO.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ZAS
 */

@ManagedBean(name="loginBean")
@ViewScoped

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
    
    public String login(){
        if(userName.length()!=0&&password.length()!=0)
               {
                       return "goto_admin_info";                   
                   }
               
               else{
                       error();
            return null;
                   }


    }
    public void error() {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "UserName or password cannot be empty"));
          
            }
}
