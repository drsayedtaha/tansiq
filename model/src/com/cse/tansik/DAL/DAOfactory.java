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
    
    
    public static AdminDAO createAdminDAO(){
        return new AdminDAOImpl();
    }
    
    public static GMDAO createGMDAO(){
        return new GMDAOImpl();
    }
    
    public static StudentDAO createStudentDAO(){
        return new StudentDAOImpl();
    }
    
    public static UserDAO createUserDAO(){
        return new UserDAOImpl();
    }
}