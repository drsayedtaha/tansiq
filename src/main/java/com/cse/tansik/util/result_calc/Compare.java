package result_calc;
import com.cse.tansik.DTO.*;

import java.sql.Array;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


import result_calc.DAL;
import util.ConnectionDB;

/**
 * Algorithm By hussien Mostafa Saeid an Abbullah khaled
 * Code by Hussien Mostafa saeid
 *
 * */
public class Compare {
    DAL dal=new DAL(1);

   /**
   *statifies if student qualified for department
   *@param stutdent student wanted to check about
   *@param dep to copmare student'rqquest to its prerequistes 
   *
   *
   */ 
   
    public  boolean qualifiedForDep(Student s ,Department dep)
    {

        for (Subject sub :s.getSubjects())
        {             System.out.println(sub.getId());
           // dep.getPreq().getSubjects().get(0);
            if ((dep.getPreq()!=null))
            for(Subject subjPreq :dep.getPreq().getSubjects())
            {   if(dep.getPreq().getSubjects().isEmpty()){return true;}
                System.out.println("s"+sub.getId()+"  "+sub.getdegree()+"preq"+subjPreq.getId()+"  "+subjPreq.getdegree());
            if (sub.getId()==(subjPreq.getId()))
            {System.out.println(sub.getdegree()+"   "+subjPreq.getdegree());
                if(!(sub.getdegree()>=subjPreq.getdegree()))
                    return false;
                }
            }
        }
    return true;
}
/**
get all Students with same or higher degree
*/
    public  ArrayList<Student> getAllStudentsWithSameOrHigherDegree(float degree,ArrayList <Student>list)
    {
        ArrayList <Student> students=new ArrayList();
        for (Student studentIt: list )
        {
        if (studentIt.getDegree()>=degree)
             students.add(studentIt);
            }
        try{  return (ArrayList<Student>)students.clone();
            }
        catch(Exception e)
        {
            return null;
            }
        }
    public  ArrayList<Student> getAllstudentsWithsameOrHigherRequest(float degree,ArrayList <Student>list)
    {
        ArrayList <Student> students=new ArrayList();
        for (Student studentIt: list )
        {
            for(int i=0; i < studentIt.getRequests().size();i++ ) {
                if(studentIt.getRequests().indexOf(studentIt.getDepartment())>i)
                    students.add(studentIt);
                }
            }
        return null;
        }
     /**
     *try to distribute students
     */
           HashMap <Department,ArrayList<Student>>  distributeLevel(int eduYear)
     {
       
        ArrayList<Department> departments =getDepslevel(eduYear);   
        setDeps(departments);
        List<Student> allStudentsDB=dal.getStudents();
        HashMap <Department,ArrayList<Student>> allStudents=new HashMap <Department,ArrayList<Student>> ();
        for(Department dep :departments)
        {
        allStudents.put(dep, new ArrayList<Student>());
//            System.out.println( dep.getId()+""+dep.getPreq().getSubjects().get(0).getdegree()+dep.getSize());
        }
        for (Student student : allStudentsDB) {
             System.out.println("id = " + student.getID() + ", grade = " + student.getDegree());
             int count=0; 
             for(Request requestItr:student.getRequests())
             {  System.out.println(requestItr.getOrder());
                Department depIterator=departments.get(requestItr.getDep().getId()-1) ;
                 if (depIterator!=null)//making sure to reach end of list
                  //S//ystem.out.println(requestItr.getOrder());
                   //System.out.println("NULL");
                     if((depIterator.getSize()<depIterator.getMaxCapcity()))                  
                         if(qualifiedForDep(student, depIterator))
                         {System.out.println(depIterator.getSize()<depIterator.getMaxCapcity());  
                         depIterator.setSize(depIterator.getSize()+1);//making sure that department size is incremnted when student is added
                             System.out.println("Student "+student.getID()+" qualified in"+" "+depIterator.getName()+"and "+(depIterator.getMaxCapcity()-depIterator.getSize())+"Students are left");
                             student.setDepartment(depIterator);
                             allStudents.get(depIterator).add(student);                   
                             break;
                             }            
             }
         }
         return allStudents;
     }   
     
     
     
    HashMap <Department,ArrayList<Student>>  distributeYear(int eduYear)
    {
    DAL dal=new DAL();
    ArrayList<Department> departments =getDepsYear(eduYear);
    setDeps(departments);
    List<Student> allStudentsDB=dal.getStudents();
    HashMap <Department,ArrayList<Student>> allStudents=new HashMap <Department,ArrayList<Student>> ();
    for(Department dep :departments)
    {
    allStudents.put(dep, new ArrayList<Student>());
    //            System.out.println( dep.getId()+""+dep.getPreq().getSubjects().get(0).getdegree()+dep.getSize());
    }
    for (Student student : allStudentsDB) {
      System.out.println("id = " + student.getID() + ", grade = " + student.getDegree());
      int count=0; 
      for(Request requestItr:student.getRequests())
      {  System.out.println(requestItr.getOrder());
         Department depIterator=departments.get(requestItr.getDep().getId()-1) ;
          if (depIterator!=null)//making sure to reach end of list
           //S//ystem.out.println(requestItr.getOrder());
            //System.out.println("NULL");
              if((depIterator.getSize()<depIterator.getMaxCapcity()))                  
                  if(qualifiedForDep(student, depIterator))
                  {System.out.println(depIterator.getSize()<depIterator.getMaxCapcity());  
                  depIterator.setSize(depIterator.getSize()+1);//making sure that department size is incremnted when student is added
                      System.out.println("Student "+student.getID()+" qualified in"+" "+depIterator.getName()+"and "+(depIterator.getMaxCapcity()-depIterator.getSize())+"Students are left");
                      student.setDepartment(depIterator);
                      allStudents.get(depIterator).add(student);                   
                      break;
                      }            
      }
    }
    return allStudents;
    }
}
