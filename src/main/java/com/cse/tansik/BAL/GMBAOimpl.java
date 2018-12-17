package com.cse.tansik.BAL;

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

import com.cse.tansik.DAL.GMDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class GMBAOImpl implements GMBAO {
   
    private DAOfactory facto = new DAOfactory();
    private GMDAO gmDAO = facto.createGMDAO();
        
    @Override
    public ArrayList<com.cse.tansik.DTO.User> getALLUsers() {
        return gmDAO.getUsers();
    }
   
    @Override
    public ArrayList<Page> get_all_pages() {
        return gmDAO.get_all_Pages();
    }
   
    @Override
    public ArrayList<Page> get_all_admin_pages() {
        return gmDAO.get_all_Pages(1);
    }
   
    @Override
    public ArrayList<Page> get_all_student_pages() {
        return gmDAO.get_all_Pages(0);
   
    }
   
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
          {  //gmDAO.editUser(user);
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
                
    public ArrayList<User> getAllAdmins() {
        // if (no exception arises )       
        return gmDAO.getUsers(1);
        // else
        /*
         * { //handle the exception that arises if DataBase not found return empty list
         * if exception happens (no data base) return Collections.emptyList();
         * 
         * }
        */
    }

    @Override
    public ArrayList<User> getAllStudent() {

        // if (no exception arises )       
        return gmDAO.getUsers(0);
        // else
        // handle the exception that arises if DataBase not found
        // return empty list if exception happens (no data base)                
        
 }

   

 
    @Override
    /**
    *edit student requests and save it in DataBase , in case of student isnot exist error will be displayed
    *@param user a DTO carries data of  student admin will inquire about  
    *@param requests list of student's requests  
    */
 
    public boolean setRequsetsForStudent(List<Request> requests, Student student) {
        Student s;
        try {
            s = (Student)student.clone();
          //  s.setRequests(requests);

        } catch (CloneNotSupportedException e) {
        }
        if (gmDAO.isExist(student))//if the student exists
        {   try
            {
            //AdminBAO.editUser(s);//save edited data 
            return true;
            }
            catch(Exception e )
            {
                //handling , type will be updated
            }
        }
        
        return false;
    }
    /** 
     * sends message to student in order to reply to their questions 
     * sends message to admins  in order to send orders
     * @param  text message will be sent
     * @param student student will recieve message
    */ 

    public boolean sendMessage(String text, User user) {
        if(!gmDAO.isExist(user))
        //exception will be handeled  and returm false in case of unsucess
        return false;
        //gmDAO.sendMessage(text,user);
        return true ;
    }

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


    public Request getRequsetsForStudent(Student student) {
        return null;
    }

    public boolean sendMessage(Message message) {
        return false;
    }

    public Message getMessage(Message message) {
        return null;
    }

    public Student getStudent(User user) {
        return null;
    }

    public boolean editStudent(Student student) {
        return false;
    }

    public List<Student> getAllStudents() {
        return Collections.emptyList();
    }

    public boolean editPrequistes(Prequistes preq, Department dep) {
        return false;
    }

    public List<Prequistes> getPrequsites(Department dep) {
        return Collections.emptyList();
    }

    public boolean addDepartments(List<Department> Department) {
        return false;
    }

    public List<Department> getDespartments(EduYear year) {
        return Collections.emptyList();
    }

    public HashMap<Student, String> solveWishes(EduYear eduyear) {
        return null;
    }

    public String login(String name, String password) {
        if (gmDAO.isExist(name, password)){
      User user=  DAOfact.createUserDAO();
            switch (user.getRole()){
            case 0 : return "student_home";
            case 1 : return "admin_home";
            case 2 : return "gm_home";
                }
        }
        else{
            //throw exeption of user not found
        }
        
        return null;
        }

    public boolean addRequest(List<Request> requests) {
        return false;
    }
}


