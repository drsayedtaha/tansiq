package com.cse.tansik.util;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.Subject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
/**
 * Algorithms class
 * By Hussin mustapha & abdullah khaled
 * 
 * The result of this function is:
 * ArrayList of students with subjects' marks and requests recorded
 */
public class Algorithms {
    /*
     * FOR TESTING PURPOUS 
     * URL ="jdbc:oracle:thin:@//localhost:1521/orcl"
     * USER_NAME = "hr"
     * PASSWORD ="1234"
     */
    
    //this arrayList is the result mentioned before
    private static ArrayList<Student> students = new ArrayList<>();

    /*
     * in this function i will inseet students uniquly and add subjects as an elements of the private 
     * requests arraylist
     */
    public static void recordStudentsWithSubjects(String URL , String USER_NAME , String PASSWORD){
        //this query fetches all colums from student/subject table
        String query = "SELECT * FROM STUDENT_SUBJECT";
        //normal connection starting subroutine
        try(            Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                         Statement statement = con.createStatement();
                         ResultSet res = statement.executeQuery(query);) {
            //loops till ResultSet cursor points to null
            while(res.next()){
                /*
                 * here i'm trying not to dublicate a student and subject in other words add all
                 * subjects of the same student together
                */
                //creating a new temporarily subject object becouse anonymous object for some reason 
                //coudn't be created here any way this will be reserved in memory till
                Subject sbj = new Subject();
                //setting sbject's properties
                sbj.setId(res.getInt("SUBJECT_ID"));
                sbj.setdegree(res.getInt("MARK"));
                /*if the upcomming id is unique
                create a new student add this subject to it and his id too
                */
                if(uniqueId(students,res.getInt("STUDENT_ID"))){
                    Student std = new Student();
                    std.setID(res.getInt("STUDENT_ID"));
                    //add this subject to studen't arrylist
                    std.getSubjects().add(sbj);
                    students.add(std);
                   
                }else{    
                    //if it's not find it's id as index and add this subject to it's arraylist
                    students.get(findIndexOfIdInArrayList(res.getInt("STUDENT_ID"))).getSubjects().add(sbj);
                    }
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //check if this id is unique
    private static boolean  uniqueId( ArrayList<Student> students , int id){
        for(int i =0 ; i<students.size() ;i++){
            if(id == students.get(i).getID()){
                return false;
                }
            }
        return true;
        }
    //finding index
    private static int findIndexOfIdInArrayList(int id){
        for(int i=0 ; i<students.size();i++){
            if(students.get(i).getID()==id)
            return i;
            }
        return -1;
        }
    //assign requests to their students
    public static void addRequestToStudents(String URL , String USER_NAME , String PASSWORD){
          //a query to fetch student request table
            String query = "SELECT * FROM STUDENT_REQUEST";
            //normal connection starting subroutine

            try(            Connection con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
                             Statement statement = con.createStatement();
                             ResultSet res = statement.executeQuery(query);) {
            //assign requests to their students
                while(res.next()){
                    //creating a temporarily object request and department
                        Request request = new Request();
                        Department department = new Department();
                        //department receive  it's id
                        department.setId(res.getInt("DEP_ID"));
                    //setting request's department
                        request.setDep(department);
                    //set dapartment's order no need to check it becouse the cursor is in the same place
                        request.setOrder(res.getInt("ORDER"));
                    //adding request to student
                        students.get(findIndexOfIdInArrayList(res.getInt("STUDENT_NAME"))).getRequests().add(request);
                    }
                
            }catch(SQLException ex){
                ex.printStackTrace();
                }
        }
}
