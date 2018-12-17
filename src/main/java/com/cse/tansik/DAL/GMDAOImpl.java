package com.cse.tansik.DAL;

import com.cse.tansik.DTO.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GMDAOImpl implements GMDAO {
    private static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static String username = "hr";
    private static String password = "hr";

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
        return send_user_query(" and 1=1 ");
    }
    
    

    public ArrayList<User> getUsers(int role) {
        
            String query_add = " and u.role = "+role;
        return send_user_query(query_add);

    }
    
    
    public ArrayList<User> getUsers(int role , int edu_year_id) {
        String query_add;
        if(role >=0)
        query_add = " and u.role = "+role;                
        else
        query_add = " and 1=1 " ;
// remove 1=1
        query_add += " and e.id = "+edu_year_id;
        return send_user_query(query_add);

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

    
    private ArrayList<User> send_user_query(String query_add){
        
        String query =
            "select * from users u  " + "inner join student s " + "on u.id = s.user_id " + "inner join edu_level e " +
            "on s.edu_level =e.id where 1=1 ";
        
        query += query_add;
        
    ArrayList<User> users = new ArrayList<User>();

    try (Connection myConn = DriverManager.getConnection(url, "hr", "hr");
         Statement myStmt = myConn.createStatement();
         ResultSet myRes = myStmt.executeQuery(query)) {

        users = extract_users_from_Rs(myRes);

        }
    catch (Exception ex) {
        ex.printStackTrace();
    }

    return users;
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

                //                        university need to be added to edu_year
                //                        University university = new University();
                //                        university.setName(myRes.getString("LAST_NAME"));

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
}
