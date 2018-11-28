package com.cse.tansik.BAL;


//        HashMap<String,List<Student>> Student = new HashMap<String,List<Student>>();

import com.cse.tansik.DTO.*;
import com.cse.tansik.DAL.*;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class AdminBAOImpl implements AdminBAO {
    public AdminBAOImpl() {
        super();
    }

    private userDAL userdal;
    private AdminDAO 

    
    /*
     *
     * set student requests when the admin need if some problems done
     *
     * parameters requests and student_id
     *
     *
     * return request
     */
    @Override
    public request setRequsetsForStudent(List<Request> requests, Student student) {
        // TODO Implement this method

        return request;
    }

    @Override
    /*
     *
     * send message to student when the want to contact with student
     *
     * parameters message
     *
     *
     * return null
     */
    public void sendMessage(String text) {
        // TODO Implement this method
        return null;
    }

    @Override
    /*
     *
     * send message to student when the want to contact with student
     *
     * parameters message
     *
     *
     * return null
     */
    public Message getMessage(message message) {
        // TODO Implement this method
        return null;
    }

    @Override
    /*
     *
     * set The beginning of the period of receiving the wishes of the students and
     * the deadline
     *
     * parameters date of start ,date of the end
     *
     *
     * return null
     */
    public void setDate(Date start, Date end) {
        // TODO Implement this method
        return null;
    }


    @Override
    /*
     * //add getstudent to admin dal
     *
     * get student data by user id
     *
     * parameters user return student object with all data
     * 
     */

    public Student getStudent(User user) {
        // check if ssn is valid
        if (len(user.id) != 14) {
            // throw error
        }

        // get student by id
        Student student = new Student();
        student = userdal.getStudent(user.id);
        return student;
    }


    @Override
    /*
     *
     * edit student information
     *
     * parameters student
     *
     *
     * return student
     */

    public student editStudent(Student student) {
        //check if studet is exist 
        //if true delete it and and new data
        //if not throw exeption
        return student;
    }



    @Override
    public List<Student> getAllStudents() {
        
        return AdminDAO.getAllStudents();;
    }

    @Override
    public boolean editPrequistes(Prequistes preq, Department dep) {
        //check if existance of prerequests 
        //if i does delete it then add new prequiste
        //if not just add it
        HashMap<Student,Integer> CSE_REQUESTS =new HashMap<Student,Integer>;
        

        return false;
    }

    @Override
    public List<Prequistes> getPrequsites(Department dep) {
        List<Prequistes> Prequistes=AdminDAO.getPrequsites(dep);
        return Prequistes;
    }

    @Override
    public Department getDepartment(EduYear year, String name) {
        /*
         * if the department (isExist()) //AdminDAO { update department ; } else if new
         * department { addDepartment() //AdminDAO }
         */
        return null;
    }

    @Override
    public List<Department> getDeps(EduYear year) {
        /*
         * get the list of dapartments which saved in the database return
         * 
         * 
         */
        List<Department> departments= getAllDepartments(EduYear eduYear); //AdminDAO
        
        return departments;
    }

    @Override
    public Admin getData() {
        // It takes the list of students info to save it in the database
        return null;
    }

    @Override
    public boolean setData() {
        /*
         * if the student exist in the database { update data; return true; } else if
         * new student { save new student; return true; } else return false;
         */
    }

    @Override
    public User login(String name, String password) {
        // TODO Implement this method
        return null;
    }

    @Override
    public boolean addRequest(List<Request> requests) {
        // TODO Implement this method
        return false;
    }
}
