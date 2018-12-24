 package result_calc;
 import result_calc.*; 
import com.cse.tansik.DTO.*;
import java.sql.*;
import oracle.jdbc.*;
import java.util.*;
import DAL.DAlWeb;
/**
 * Algorithm By hussien Mostafa Saeid an Abbullah khaled 
 * Code by Hussien Mostafa saeid
 * 
 * */
public class Class1 {
    
    public static void main(String[] args) {
    Class1 class1 = new Class1();
   Compare v =new Compare();
   v.setDeps(v.getDepsYear(1));
   DAL d =new DAL();
   ArrayList<Student> s =new ArrayList<Student>();
        s = (ArrayList<Student>)d.getStudents();
   d.setRequestsForStudets(s);
   d.setResultsToStudets(s);
   //HashMap<Student >     
   for(Student s0 :s)
   {System.out.println(s0.getID()+" "+"s0.get ");}
    System.out.println("***");
        v.distributeLevel(1);
    }    
}