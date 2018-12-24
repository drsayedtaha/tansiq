package result_calc;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import util.Connection;
import com.cse.tansik.DTO.Subject;
import result_calc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class StudentDAL {
       private  String URL ;
       private  String USER_NAME ;
       private  String password ;
       private List<Student> students = new ArrayList<Student>();
       public static final int SUBJECTS =0;
       public static final int REQUESTS =0;
       DAL(String URL ,String USER_NAME ,String password){
                this.URL = URL;
                this.USER_NAME =USER_NAME;
                this.password = password;
                //creating students list
               String query = "SELECT DISTINCT STUDENT_ID FROM STUDENT_SUBJECT";
              Connection.setQuery(query);
                  try{
                  ResultSet res = Connection.connect();
                  
                  while (res.next()){
                      Student stdnt = new Student();
                      stdnt.setID(res.getInt("STUDENT_ID"));
                      students.add(stdnt);
                      }
               }
               catch(SQLException ex){
                  ex.printStackTrace();
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

    public void setResultsToStudets(List<Student> list){
           
           for(int i = 0 ; i<students.size() ; i++){
                String query = "SELECT SUBJECT_ID , \"MARK\" FROM STUDENT_SUBJECT WHERE STUDENT_ID="+students.get(i).getID();
                    try(ResultSet res = Connection.connect();){
                          int j =0;
                          int k=0;
                        while(res.next()){
                            Subject sbj = new Subject();
                            sbj.setId(res.getInt("SUBJECT_ID"));
                            sbj.setdegree(res.getInt("MARK"));

                            students.get(i).getSubjects().add(j++,sbj);
                            //for testing purpose
                            System.out.println(students.get(i).getSubjects().get(k++).getdegree()+"\n"
                                               +students.get(i).getID());
                            }  
                        System.out.println("while ended");
                      }   catch(SQLException ex){
                           ex.printStackTrace();
                        }
                   }
               
         
           }
    
    public void setRequestsForStudets(List<Student> list){
           for(int i = 0 ; i<students.size() ; i++){
                String query = "SELECT DEP_ID , \"ORDER\" FROM STUDENTS_REQUESTS WHERE STUDENT_ID="+students.get(i).getID();
                    try(ResultSet res = Connection.connect();){
                          int j =0;
                          int k=0;
                        while(res.next()){
                            Department department = new Department();
                            Request req = new Request();
                            department.setId(res.getInt("DEP_ID"));
                            req.setDep(department);
                            req.setOrder(res.getInt("ORDER"));

                            students.get(i).getRequests().add(j++,req);
                            //for testing purpose
                            System.out.println(j+students.get(i).getRequests().get(k++).getOrder()+"\n"
                                               +students.get(i).getID());
                            
                            }  
                        System.out.println("while ended");
                      }   catch(SQLException ex){
                           ex.printStackTrace();
                        }
                   }
               
         
           }
    
}