package com.cse.tansik;

import com.cse.tansik.BAL.BAOfactory;
import com.cse.tansik.BAL.GMBAO;
import com.cse.tansik.DAL.DAOfactory;
import com.cse.tansik.DAL.GMDAO;
import com.cse.tansik.DTO.User;

import com.cse.tansik.DTO.EduYear;

import com.cse.tansik.DTO.Page;
import com.cse.tansik.DTO.University;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


public class Main_test_gm_getdata {


    static void print_all_page_bal(){
        ArrayList<Page> pages = new ArrayList<Page>();
        pages = gmbao.get_all_pages(); 
        for (Page page : pages){
            System.out.print(page.toString()+"\n");    
        }
        System.out.print("end of pages"+"\n"+"\n");    

    }

    static void print_all_page_bal_admin(){
        ArrayList<Page> pages = new ArrayList<Page>();
        pages = gmbao.get_all_admin_pages(); 
        for (Page page : pages){
            System.out.print(page.toString()+"\n");    
        }
        System.out.print("end of pages"+"\n"+"\n");    

    }

    static void print_all_page_bal_student(){
        ArrayList<Page> pages = new ArrayList<Page>();
        pages = gmbao.get_all_student_pages(); 
        for (Page page : pages){
            System.out.print(page.toString()+"\n");    
        }
        System.out.print("end of pages"+"\n"+"\n");    

    }

    static void print_all_page(){
        ArrayList<Page> pages = new ArrayList<Page>();
        pages = gm.get_all_Pages(); 
        for (Page page : pages){
            System.out.print(page.toString()+"\n");    
        }
        System.out.print("end of pages"+"\n"+"\n");    

    }

    static void print_all_page(int role){
        ArrayList<Page> pages = new ArrayList<Page>();
        pages = gm.get_all_Pages(role); 
        for (Page page : pages){
            System.out.print(page.toString()+"\n");    
        }
        System.out.print("end of pages"+"\n"+"\n");    

    }
 
    static void print_all_users(){
        ArrayList<User> users = new ArrayList<User>();
        users = gm.getUsers(); 
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");    

    }

//    static void print_all_users(int role){
//        ArrayList<User> users = new ArrayList<User>();
//        users = gm.getUsers(role); 
//        for (User user : users){
//            System.out.print(user.toString()+"\n");    
//        }
//        System.out.print("end of users"+"\n"+"\n");    
//
//    }


//    static void print_all_users(int role,int edu_year){
//        ArrayList<User> users = new ArrayList<User>();
//        users = gm.getUsers(role,edu_year); 
//        for (User user : users){
//            System.out.print(user.toString()+"\n");    
//        }
//        System.out.print("end of users"+"\n"+"\n");    
//    }


    static void print_users_by_bal(){
        ArrayList<User> users = new ArrayList<User>();
        users = gmbao.getUsers();
        
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");    

    }

    static void print_admins_by_bal(){

        ArrayList<User> users = new ArrayList<User>();
        users = gmbao.getUsers(GMBAO.admin_role);
        
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");    



    }

    static void print_students_by_bal(){
        
        ArrayList<User> users = new ArrayList<User>();
        users = gmbao.getUsers(GMBAO.student_role);
        
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");      
        
    }
    
    static void print_students_withedu_by_bal(){
        
        ArrayList<User> users = new ArrayList<User>();
        EduYear eduYear = new EduYear();
        eduYear.setFaculty("computer");
        users = gmbao.getUsers(-1,eduYear);
        
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");      
        
    }
    
    static void print_students_withid_by_bal(){
        
        ArrayList<User> users = new ArrayList<User>();
        EduYear eduYear = new EduYear();
        eduYear.setFaculty("computer");
        users = gmbao.getUsers(GMBAO.admin_role,eduYear,2);
        
        for (User user : users){
            System.out.print(user.toString()+"\n");    
        }
        System.out.print("end of users"+"\n"+"\n");      
        
    }
    
    static void print_eduyear(){
        
        ArrayList<EduYear> eduYears= new ArrayList<>();
        eduYears = gmbao.getEduYear();
        
        for (EduYear eduyear : eduYears){
            System.out.print(eduyear.toString()+"\n");    
        }
        System.out.print("end of eduyear"+"\n"+"\n");      
        
    }
    


    static GMDAO gm = DAOfactory.createGMDAO();


    static GMBAO gmbao = BAOfactory.createGMBAO();

    public static void main(String[] args) {
        
        ///////        test gmbal
        print_users_by_bal();
        print_admins_by_bal();
        print_students_by_bal();
        print_students_withedu_by_bal();
        print_students_withid_by_bal();
        //
        print_eduyear();
        
        
//        print_all_users();
//        print_all_users(0);
//        print_all_users(1);
//        print_all_users(1,1);
//        print_all_users(0,1);
//
//        print_all_users(-1,1);  //no role specified
//        

//        print_all_page();
//        print_all_page(0);

//        print_all_page_bal();
//        print_all_page_bal_admin();
//        print_all_page_bal_student();
//        
    
    }
}
