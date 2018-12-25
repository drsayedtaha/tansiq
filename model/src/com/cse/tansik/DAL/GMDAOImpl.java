package com.cse.tansik.DAL;


import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Page;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GMDAOImpl implements GMDAO {

    public static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public static String username = "TANSIQ";
    public static String password = "TANSIQ";

    private String user_query =
        "select * from users u  " + "inner join student s " + "on u.id = s.user_id " 
        + "inner join edu_level e " +
        "on s.edu_level =e.id  ";
   
   
   
    public void resetFilter(){
        user_query =
                "select * from users u  " + "inner join student s " + "on u.id = s.user_id " 
                + "inner join edu_level e " +
                "on s.edu_level =e.id  ";
        filtered = false;
    }
   
   
    private boolean filtered;
    
    
    
    @Override
    public boolean isExist(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean addUser(User user) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        // TODO Implement this method
        return false;
    }



    @Override
    public ArrayList<User> getUsers() {
        return send_user_query();
    }
    
    
    //if role =-1 do notthing
    public void setUsersFilter(int role) {
        if(role<0)
            return;
        if (!filtered)
            user_query += " where u.role = "+role;    
        else
            user_query += " and u.role = "+role;    
     
        filtered = true;
                
    }
    
    
    
    //nothin if faculty empty
    //no year filter if year<0
    //no dep filter if depempty true
    public void setUsersFilter(EduYear edu_year){
        if(edu_year.getFaculty().isEmpty())
            return;
        if (!filtered)
            user_query += " where e.FACULTY = '" + edu_year.getFaculty()+"' ";
        else
            user_query += " and e.FACULTY = '" + edu_year.getFaculty()+"' ";
             
        if(edu_year.getYear()>=0)
            user_query += " and e.YEAR = " + edu_year.getYear();
        if(!edu_year.getDepartment().isEmpty())            
            user_query += " and e.DEPARTMENT";
        filtered = true;
        }
    
    public void setUsersFilter(User user){
        if (user.getId()<0)
            return;
            if (!filtered)
            user_query += " where u.id = " + user.getId();
        else
            user_query += " and u.id = " + user.getId();
    
        }
        
    
    
    public ArrayList<Page> get_all_Pages(){
        return send_page_query(" ");
    }
    
    public ArrayList<Page> get_all_Pages(int role){
        return send_page_query(" where role =  "+role);
    }
    

/**
     *aouthor abdelrhman ragab hashem
     * 
     * 4/12
     *send query to get all data from data base based in role or eduyear
     * 
     * 
     * 
     * @param query_add
     * @return
     */

    
    private ArrayList<User> send_user_query(){
        //TODO remove 1=1 -- done miss testing
        
    ArrayList<User> users = new ArrayList<User>();

    try (Connection myConn = DriverManager.getConnection(url, username, password);
         Statement myStmt = myConn.createStatement();
         ResultSet myRes = myStmt.executeQuery(user_query)) {

        users = extract_users_from_Rs(myRes);

        }
    catch (Exception ex) {
        ex.printStackTrace();
    }

    return users;
    }    


    private ArrayList<EduYear> send_eduyear_query(){
     
    ArrayList<EduYear> eduyears = new ArrayList<>();

    try (Connection myConn = DriverManager.getConnection(url, username, password);
         Statement myStmt = myConn.createStatement();
         ResultSet myRes = myStmt.executeQuery(eduyear_query)) {

        eduyears = extract_eduyears_from_Rs(myRes);

        }
    catch (Exception ex) {
        ex.printStackTrace();
    }

    return eduyears;
    }    

    private String eduyear_query= "select * from edu_level";

    public ArrayList<EduYear> getEduYear(){
        return send_eduyear_query();
    }
    
    
    private ArrayList<EduYear> extract_eduyears_from_Rs(ResultSet myRes) throws SQLException{
        ArrayList<EduYear> eduyears = new ArrayList<>();
        while (myRes.next()){
            EduYear eduyear = new EduYear();
            
            eduyear.setYear(myRes.getInt("year"));
            eduyear.setFaculty(myRes.getString("faculty"));
            eduyears.add(eduyear);            
        }
    
    
        return eduyears;    
    }
    
    
    
    
    
    
    
    
//TODO make connect generic
    private ArrayList<Page> send_page_query(String query_add){
        
        ArrayList<Page> pages = new ArrayList<Page>();
        String query =
            "select * from user_website";
        
        query += query_add;
        
    try (Connection myConn = DriverManager.getConnection(url, "hr", "hr");
         Statement myStmt = myConn.createStatement();
         ResultSet myRes = myStmt.executeQuery(query)) {

        pages = extract_pages_from_Rs(myRes);

        }
    catch (Exception ex) {
        ex.printStackTrace();
    }

    return pages;
    }    





    
private ArrayList<User> extract_users_from_Rs(ResultSet myRes) throws SQLException{
            //TODO use null and set the value inside while
                ArrayList<User> users = new ArrayList<User>();
                while (myRes.next()) {
                User user = new User();
                user.setId(myRes.getInt("ID"));
                user.setEmail(myRes.getString("EMAIL"));
                user.setUserName(myRes.getString("USER_NAME"));
                user.setFirstName(myRes.getString("FIRST_NAME"));
                user.setSecondName(myRes.getString("MIDDLE_NAME"));
                user.setLastName(myRes.getString("LAST_NAME"));
                user.setRole(myRes.getInt("ROLE"));
                EduYear eduyear = new EduYear();
 
                eduyear.setYear(myRes.getInt("year"));
                eduyear.setFaculty(myRes.getString("faculty"));
                user.setEduyear(eduyear);
                users.add(user);

                }
                return users;
}


    private ArrayList<Page> extract_pages_from_Rs(ResultSet myRes) throws SQLException{
             //TODO use null and set inside while
                    ArrayList<Page> pages= new ArrayList<Page>();
                    while (myRes.next()) {
                    Page page = new Page();
                    page.setUrl(myRes.getString("website"));
                    page.setRole(myRes.getInt("ROLE"));
                    EduYear eduyear = new EduYear();

                    pages.add(page);

                    }
                    return pages;
    }




    @Override
    public boolean isExist(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean isExist(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteStudent(Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public Student getStudent(String string) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List getAllStudents(EduYear eduYear) {

        return Collections.emptyList();
    }

    @Override
    public boolean addDepartment(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deleteDepartment(Department department) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List getAllDepartments(EduYear eduYear) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean setDateEduYear(EduYear eduYear) {
        // TODO Implement this method
        return false;
    }

    @Override
    public EduYear getDateEduYear(EduYear eduYear) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List getPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List addPrequiste(Department department) {
        // TODO Implement this method
        return null;
    }

    @Override
    public void addAmin(Admin admin) {
        // TODO Implement this method
    }

    @Override
    public boolean isExist(String username, String password) {
        // TODO Implement this method
        return false;
    }

    @Override
    public User getUser(String username, String password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean addMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletMessage(Message message) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Message> getMessages(User user) {
        // TODO Implement this method
        return Collections.emptyList();
    }

    @Override
    public boolean addRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean deletRequest(Request request, Student student) {
        // TODO Implement this method
        return false;
    }

    @Override
    public List<Request> getAllRequests(Student student) {
        // TODO Implement this method
        return Collections.emptyList();
    }


    
    @Override
    public void addstudentsDataBase(String path, int eduLevelid) {
        // TODO Implement this method

    }
}
