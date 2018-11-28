package com.cse.tansik.BAL;

import com.cse.tansik.DAL.AdminDAO;
import com.cse.tansik.DAL.DAOfactory;
import com.cse.tansik.DAL.GMDAO;
import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.Student;

public class UserGeneric <T>{
    DAOfactory DAOfact = new DAOfactory();
    private GMDAO gmDAO = DAOfact.createGMDAO();
    private AdminDAO admindao = DAOfact.createAdminDAO();
    
    private T t;
    
    public boolean add(T t){
        if(t instanceof Student)
            admindao.addStudent(t);
        else if(t instanceof Admin){
            gmDAO.addAmin((Admin)t);
        }
            
    }
    
    
}
