package com.cse.tansik.DAL;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;
import com.cse.tansik.util.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.sql.*;

import com.cse.tansik.DTO.User;

import java.sql.ResultSet;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * File Name:
 *
 */
public class AdminDAOImpl implements AdminDAO {
  

    private static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private static String username = "TANSIQ";
    private static String password = "TANSIQ";

  
  
    Student student = new Student();
    private static boolean isTest = true;

    /**
     * This method ....................
     *
     * @param student
     * @return
     */
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

    /**
     * implemented by osama this method add the information of the student in
     * database
     *
     * @param student
     * @return
     */
    
    public void addstudentsDataBase(String path,int eduLevelid) {
        //read file as string 
        
        String text = readFile(path, null);

        String[] lines = text.split("\n");
        String []subjectName = lines[0].split(";");
        //insert into subject table
//        for (int s = 6;subjectName.length >=s ;s++ ){
//            ConnectionUtil.excuteNoneQuery("insert into subject (name,edu_level1) values ("+subjectName[s]+","+ student.getYear()+")");
//        }
        
        ConnectionUtil.excuteNoneQuery("insert into subject (name,EDU_LEVEL_ID1) values ("+subjectName[6]+","+ student.getYear()+")");
        ConnectionUtil.excuteNoneQuery("insert into subject (name,EDU_LEVEL_ID1) values ("+subjectName[7]+","+ student.getYear()+")");
        ConnectionUtil.excuteNoneQuery("insert into subject (name,EDU_LEVEL_ID1) values ("+subjectName[8]+","+ student.getYear()+")");
        ConnectionUtil.excuteNoneQuery("insert into subject (name,EDU_LEVEL_ID1) values ("+subjectName[9]+","+ student.getYear()+")");
        ConnectionUtil.excuteNoneQuery("insert into subject (name,EDU_LEVEL_ID1) values ("+subjectName[10]+","+ student.getYear()+")");

        
        
        
        

     
        
        for (int x = 1; x < lines.length; x++) {

            String[] cols = lines[x].split(";");
            //inser into users table
            ConnectionUtil.excuteNoneQuery("insert into users (USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME) values('" + cols[3] + "','" + cols[4] + "','" + cols[5] + "',0,'" + cols[0] + "','" + cols[1] + "','" + cols[2] + "')");

            try {
                ResultSet rs = ConnectionUtil.excuteQuery("select max(ID) from users");
                if (rs.next()) {
                    int id = rs.getInt("ID");
                    //insert into  student table
                    ConnectionUtil.excuteNoneQuery("insert into student (USER_ID,EDU_LEVEL) values(" + id + "," + student.getYear() + ")");

                    //insert into student_subject table
                    ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT,SUBJECT,MARK) values(" + id + "," + 1 + "," + cols[6] + ")");
                    ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT,SUBJECT,MARK) values(" + id + "," + 2 + "," + cols[7] + ")");
                    ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT,SUBJECT,MARK) values(" + id + "," + 3 + "," + cols[8] + ")");
                    ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT,SUBJECT,MARK) values(" + id + "," + 4 + "," + cols[9] + ")");
                    ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT,SUBJECT,MARK) values(" + id + "," + 5 + "," + cols[10] + ")");
                   //INSERT INTO ROLEs table 
                    ConnectionUtil.excuteNoneQuery("insert into roles (user_id , role_id ,roles) values (" + id +","+0+","+1231321+") ");//roles is unknown
                }
            } catch (Exception e) {
                e.printStackTrace();
                
            }
    }

    }

    static String readFile(String path, Charset encoding) {

        if (isTest) {
            return "firstname;middalname;lastname;username;password;email;edulevel;subject1;subject2;subject3;subject4;subject5\n" + 
            "osama;mohamed;ali;osama123;123;os@g.c;1;60;50;90;30;20\n";
        }
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, encoding);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Override
//    public boolean addStudent(Student student) {
//        ConnectionUtil.getConnection();
//        //insert into  users table
//        ConnectionUtil.excuteNoneQuery("insert into users (USER_NAME,PASSWORD,EMAIL,ROLE,FIRST_NAME,MIDDLE_NAME,LAST_NAME,NATIONAL_ID) values('" + student.getUserName() + "','" + student.getPassword() + "','" + student.getEmail() + "',0,'" + student.getFirstName() + "','" + student.getSecondName() + "','" + student.getLastName() + "')");
//        ResultSet res = ConnectionUtil.excuteQuery("select max(ID) from users");
//        try {
//            if (res.next()) {
//                int id = res.getInt("ID");
//                //insert into  student table
//                ConnectionUtil.excuteNoneQuery("insert into student (USER_ID,EDU_LEVEL) values(" + id + "," + student.getYear() + ")");
//                //insert into student_subject table
//                ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT_ID,SUBJECT_ID,MARK) values(" + id + "," + student.getSubjects()[0].getId() + "," + student.getSubjects()[0].getDegree() + ")");
//                ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT_ID,SUBJECT_ID,MARK) values(" + id + "," + student.getSubjects()[1].getId() + "," + student.getSubjects()[1].getDegree() + ")");
//                ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT_ID,SUBJECT_ID,MARK) values(" + id + "," + student.getSubjects()[2].getId() + "," + student.getSubjects()[2].getDegree() + ")");
//                ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT_ID,SUBJECT_ID,MARK) values(" + id + "," + student.getSubjects()[3].getId() + "," + student.getSubjects()[3].getDegree() + ")");
//                ConnectionUtil.excuteNoneQuery("insert into student_subject (STUDENT_ID,SUBJECT_ID,MARK) values(" + id + "," + student.getSubjects()[4].getId() + "," + student.getSubjects()[4].getDegree() + ")");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }

    /**
     * implemented by osama this method delete the information of the student
     * from database
     *
     * @param student
     * @return
     */
    @Override
    public boolean deleteStudent(Student student
    ) {
        ConnectionUtil.getConnection();

        ConnectionUtil.excuteNoneQuery("");
        return false;
    }

    @Override
    public Student getStudent(String string) {
        // TODO Implement this method
        return null;
    }

    @Override
    public List getAllStudents(EduYear eduYear) {
        // TODO Implement this method
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
    public boolean addStudent(Student student) {
        // TODO Implement this method
        return false;
    }
}
