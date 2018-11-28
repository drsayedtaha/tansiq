package com.cse.tansik.BAL;

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;



public class GMBAOImpl implements GMBAO {
   
    private GMDAO = DAOfactory();   
   
   
   
   
    @Override
    /**
    * check if the user is found in database and if no errors or the user not exist returns true 
    * @param  user DTO object represnts data required to be saved
    * @return true when succeeded in saving data
    */
   
    public boolean editUser(User user) 
    
    {
    if (gmDAO.isExist(user)) 
          try
          {  gmDAO.editUser(user);
         return true;
        } 
         catch (Exception e)
         {
        //handle excepetion
            return false;
         
        }

}
    /**
     * adds new admin to database
     * @param Admin data of admin will be added
     */
    public boolean addAdmin(Admin admin) {
    try {
        //adding admin
        }
        catch(Exception e)
        {//handle exception
            return false;}
    }
    /**
     * remove admin to database
     * @param Admin data of admin will be removed
     */
    public boolean removeAdmin(Admin admin) {
        try {if(!gmDAO.isExist(admin))
            return false;
            
            //remove admin 
            return true;
            }
            catch(Exception e)
            {//handle exception
                return false;}
        }
    
    @Override
//returns a list of all admins in the DB if the DataBase is found and the view will update its pages (the page that will have the result) according to that list  
    public List<Admin> getAllAdmins() {
                
            
                
        // if (no exception arises )       
                return gmDAO.getAllAdmins();
        //else 
        /*
        {
            //handle the exception that arises if DataBase not found
            return empty list if exception happens (no data base)                
           return Collections.emptyList();

        }
        */
    }

    @Override
    public List<Student> getAllStudent() {
/**
 * returns a list of all students in the DB if the DataBase is found and the view will update its pages (the page that will have the result) according to that list  
 *
 * @param void no need for params
 * @return List<Student> 
 *        
 *  */  
        // if (no exception arises )       
                return gmDAO.getAllStudent();
        //else 
                //handle the exception that arises if DataBase not found
        // return empty list if exception happens (no data base)                
        
        return Collections.emptyList();
    
 }

   

 
    @Override
    /**
    *edit student requests and save it in DataBase , in case of student isnot exist error will be displayed
    *@param user a DTO carries data of  student admin will inquire about  
    *@param requests list of student's requests  
    */
 
    public boolean setRequsetsForStudent(List<Request> requests, Student student) {
        Student s = student.clone(); 
        s.requests=requests;
        if (gmDAO.isExist(student))//if the student exists
        {   try
            {
            AdminBAO.editUser(s);//save edited data 
            return true;
            }
            catch(Exception e )
            {
                //handling , type will be updated
            }
        }
        
        return false;
    }
    @Override
    /** 
     * sends message to student in order to reply to their questions 
     * sends message to admins  in order to send orders
     * @param  text message will be sent
     * @param student student will recieve message
    */ 

    public boolean sendMessage(String text, User user) {
        if(!G.isExist(user))
        //exception will be handeled  and returm false in case of unsucess
        return false;
        G.sendMessage(text,student);
        return true ;
    }

    @Override
    public Message getMessage() {
        // TODO Implement this method
        return null;

    }
    
    @Override
    /**
     * Setting the period that students will be allowed to enter their requests (they will be prevented from entering their requests after that period)
     * 
     * @param  start date of Starting the process of cordinting the Departments
     * @param  end date of ending the process of cordinting the Departments
    */
    public boolean setDate(Date start, Date end) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Student getStudent(String userName, String Password) {
        if(!gmDAO.isExist(userName))
        return null;
        try
        {
            //try to get user data
            //return data ;

        }
        catch(Exception e)
     
        {
            //Exception will be updated
            //handling
        }
    }

   

   
}
