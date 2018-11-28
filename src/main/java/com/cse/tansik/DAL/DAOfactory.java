/*
 * filename:DAOfactory
 * 
 * autor: 
 * 
 * created by :
 * 
 * 
 * 
 */





package com.cse.tansik.DAL;

public class DAOfactory {
    public DAOfactory() {
        super();
    }
    
    public AdminDAO createAdminDAO(){
        return new AdminDAOimp();
    }
    
    public GMDAO createGMDAO(){
        return new GMDAOimp();
    }
    
    public StudentDAO createStudentDAO(){
        return new StudentDAOimp();
    }
    
    public UserDAO createUserDAO(){
        return new UserDAOimp();
    }
}
