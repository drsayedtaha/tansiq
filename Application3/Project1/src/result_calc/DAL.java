package result_calc;

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
import java.util.List;

import util.ConnectionDB;

public class DAL {
       private  String URL ;
       private  String USER_NAME ;
       private  String password ;
       private List<Student> students = new ArrayList<Student>();
       public static final int SUBJECTS =0;
       public static final int REQUESTS =0;
       DAL(Integer edu_level){
                ConnectionDB.fastPrepare("hr", "1523", "ORCL00", "hr");
                //creating students list
               String query = "SELECT DISTINCT * FROM STUDENT WHERE EDU_LEVEL = " + edu_level+" ORDER BY STUDENT.TOTAL_MARK";
               try{
                   ConnectionDB.setQuery(query);
                   ResultSet res=ConnectionDB.connect();
                   if (res!=null)
                  while (res.next()){
                      Student stdnt = new Student();
                      stdnt.setID(res.getInt("USER_ID"));
                      stdnt.setDegree(res.getInt("total_mark"));
                      students.add(stdnt);      
                       //System.out.println("*******+"+stdnt.getID()); 
                      }
               }
               catch(SQLException ex){
                  System.out.println(ex+"  "+query);
                  }
               setResultsToStudets(students);
               setRequestsForStudets(students);
           }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getStudents(int degree) {
        return students;
    }
    public void setResultsToStudets(List<Student> list){
           for(int i = 0 ; i<students.size() ; i++){
                String query = "SELECT SUBJECT_ID , \"MARK\" FROM STUDENT_SUBJECT WHERE STUDENT_ID="+students.get(i).getID()+" order by SUBJECT_ID";
                    try{
                        ConnectionDB.setQuery(query);
                        ResultSet res=ConnectionDB.connect();
                          int j =0;
                          int k=0;
                        if (res!=null)
                        while(res.next()){
                            Subject sbj = new Subject();
                            sbj.setId(res.getInt("SUBJECT_ID"));
                            sbj.setdegree(res.getInt("MARK"));
                            students.get(i).getSubjects().add(j++,sbj);
                                                        }  
                        //System.out.println("while ended");
                      }   catch(SQLException ex){
                           ex.printStackTrace();
                        }
                   }
         
           }
    
    public void setRequestsForStudets(List<Student> list){
           
           for(int i = 0 ; i<students.size() ; i++){
                String query = "SELECT DEP_ID , \"ORDER\" FROM STUDENTS_REQUESTS WHERE STUDENT_ID="+students.get(i).getID()+"order by \"ORDER\"";
                    try{
                          ConnectionDB.setQuery(query);
                          ResultSet res=ConnectionDB.connect();
                          int j =0;
                          int k=0;
                        if (res!=null)
                        while(res.next()){
                            Department department = new Department();
                            Request req = new Request();
                            department.setId(res.getInt("DEP_ID"));
                            req.setDep(department);
                            req.setOrder(res.getInt("ORDER"));
                            students.get(i).getRequests().add(j++,req);
                            //for testing purpose
                     //       System.out.println("_REQ"+j+students.get(i).getRequests().get(k++).getOrder()+"\n"
                             //                  +students.get(i).getID()+"_REQ");
                            
                            }  
                        //System.out.println("while ended");
                      }   catch(SQLException ex){
                           ex.printStackTrace();
                        }
                   }         
           }
}