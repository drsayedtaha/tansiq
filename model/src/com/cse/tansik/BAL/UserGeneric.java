package com.cse.tansik.BAL;

import com.cse.tansik.DAL.AdminDAO;
import com.cse.tansik.DAL.*;
import com.cse.tansik.DAL.GMDAO;
import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.Student;

public class UserGeneric <T>{
    private GMDAO gmDAO = DAOfactory.createGMDAO();
    private AdminDAO admindao = DAOfactory.createAdminDAO();
    
    private T t;
    
    public boolean add(T t){
        if(t instanceof Student)
        {
            admindao.addStudent((Student)t);
        return true;}
        else if(t instanceof Admin){
            gmDAO.addAmin((Admin)t);
            return true;
        }
            return false;
    }
    
    
}
