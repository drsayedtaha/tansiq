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
    
    
    public AdminDAO createAdminDAO(){
        return new AdminDAOImpl();
    }
    
    public GMDAO createGMDAO(){
        return new GMDAOImpl();
    }
    
    public StudentDAO createStudentDAO(){
        return new StudentDAOImpl();
    }
    
    public UserDAO createUserDAO(){
        return new UserDAOImpl();
    }
}