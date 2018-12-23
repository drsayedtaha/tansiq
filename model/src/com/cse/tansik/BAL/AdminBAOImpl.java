//abdo ragab //24-12
//TODO fix compilation error or recreat the implementaion class beacause of compilation error


//package com.cse.tansik.BAL;
//
//
////        HashMap<String,List<Student>> Student = new HashMap<String,List<Student>>();
//
//import com.cse.tansik.DTO.*;
//import com.cse.tansik.DAL.*;
//
//import java.util.Collections;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//
//public class AdminBAOImpl implements AdminBAO {
//    
//    private UserDAO userdal;
//    private AdminDAO admindao; 
//
//    
//    /*
//     *
//     * set student requests when the admin need if some problems done
//     *
//     * parameters requests and student_id
//     *
//     *
//     * return request
//     */
//    @Override
//    public boolean setRequsetsForStudent(List<Request> requests, Student student) {
//        // TODO Implement this method
//
//        return false;
//    }
//
//    @Override
//    /** 
//     *
//     * send message to student when the want to contact with student
//     *
//     * parameters message
//     *
//     *
//     * return null
//     */
//    public boolean sendMessage(Message message) {
//        // TODO Implement this method
//        return false;
//    }
//
//    @Override
//    /**
//     *
//     * send message to student when the want to contact with student
//     *
//     * parameters message
//     *
//     *
//     * return null
//     */
//    public Message getMessage(Message message) {
//        // TODO Implement this method
//        return null;
//    }
//
//    @Override
//    /*
//     *
//     * set The beginning of the period of receiving the wishes of the students and
//     * the deadline
//     *
//     * parameters date of start ,date of the end
//     *
//     *
//     * return null
//     */
//    public boolean setDate(Date start, Date end) {
//        // TODO Implement this method
//        return false;
//    }
//
//
//    @Override
//    /*
//     * //add getstudent to admin dal
//     *
//     * get student data by user id
//     *
//     * parameters user return student object with all data
//     * 
//     */
//    
////abdo raga //24-12   
////TODO removed because compilation error
////    public Student getStudent(User user) {
////        // check if ssn is valid
////        if (len(user.getId()) != 14) {
////            // throw error
////        }
////
////        // get student by id
////        Student student = new Student();
////        student = userdal.getStudent(user.getId());
////        return student;
////    }
//
//
////    @Override
//    /*
//     *
//     * edit student information
//     *
//     * parameters student
//     *
//     *
//     * return student
//     */
//    //abdo raga //24-12   
//    //TODO removed because compilation error
////    public Student editStudent(Student student) {
////        //check if studet is exist 
////        //if true delete it and and new data
////        //if not throw exeption
////        return student;
////    }
//
//
////abdo raga //24-12   
////TODO removed because compilation error
////--    @Override
////--    public List<Student> getAllStudents() {
////--        
////--        return AdminDAO.getAllStudents();
////--    }
//
////abdo raga //24-12   
////TODO removed because compilation error
////--    @Override
//    public boolean editPrequistes(Prequistes preq, Department dep) {
//        //check if existance of prerequests 
//        //if i does delete it then add new prequiste
//        //if not just add it
//        HashMap<Student,Integer> CSE_REQUESTS =new HashMap<Student,Integer>();
//        
//
//        return false;
//    }
//
//
//    //abdo raga //24-12   
//    //TODO removed because compilation error
////    @Override
////    public List<Prequistes> getPrequsites(Department dep) {
////        List<Prequistes> Prequistes=AdminDAO.getPrequsites(dep);
////        return Prequistes;
////    }
////
////    @Override
////    public Department getDepartment(EduYear year, String name) {
////        /*
////         * if the department (isExist()) //AdminDAO { update department ; } else if new
////         * department { addDepartment() //AdminDAO }
////         */
////        return null;
////    }
////
////    @Override
////    public List<Department> getDeps(EduYear year) {
////        /*
////         * get the list of dapartments which saved in the database return
////         * 
////         * 
////         */
////        List<Department> departments= getAllDepartments(EduYear eduYear); //AdminDAO
////        
////        return departments;
////    }
////
////    @Override
////    public Admin getData() {
////        // It takes the list of students info to save it in the database
////        return null;
////    }
////
////    @Override
////    public boolean setData() {
////        /*
////         * if the student exist in the database { update data; return true; } else if
////         * new student { save new student; return true; } else return false;
////         */
////    }
//
//
//
//
////abdo raga //24-12   
////TODO added to fix compilation error remove any function u user
//
//
//    @Override
//    public boolean addDepartments(List<Department> Department) {
//        // TODO Implement this method
//        return false;
//    }
//
//    @Override
//    public boolean addRequest(List<Request> requests) {
//        // TODO Implement this method
//        return false;
//    }
//
//    @Override
//    public boolean editStudent(Student student) {
//        // TODO Implement this method
//        return false;
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        // TODO Implement this method
//        return Collections.emptyList();
//    }
//
//    @Override
//    public List<Department> getDespartments(EduYear year) {
//        // TODO Implement this method
//        return Collections.emptyList();
//    }
//
//    @Override
//    public List<Prequistes> getPrequsites(Department dep) {
//        // TODO Implement this method
//        return Collections.emptyList();
//    }
//
//    @Override
//    public Request getRequsetsForStudent(Student student) {
//        // TODO Implement this method
//        return null;
//    }
//
//    @Override
//    public Student getStudent(User user) {
//        // TODO Implement this method
//        return null;
//    }
//
//    @Override
//    public String login(String name, String password) {
//        // TODO Implement this method
//        return null;
//    }
//
//    @Override
//    public HashMap<Student, String> solveWishes(EduYear eduyear) {
//        // TODO Implement this method
//        return null;
//    }
//}
