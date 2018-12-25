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


    

   
    public  boolean qualifiedForDep(Student s ,Department dep)
    {
        for (Subject sub :s.getSubjects())
        {             System.out.println(sub.getId());
           // dep.getPreq().getSubjects().get(0);
            if ((dep.getPreq()!=null))
            for(Subject subjPreq :dep.getPreq().getSubjects())
            {   if(dep.getPreq().getSubjects().isEmpty()){return true;}
                //System.out.println("s"+sub.getId()+"  "+sub.getdegree()+"preq"+subjPreq.getId()+"  "+subjPreq.getdegree());
            if (sub.getId()==(subjPreq.getId()))
            {System.out.println(sub.getdegree()+"   "+subjPreq.getdegree());
                if(!(sub.getdegree()>=subjPreq.getdegree()))
                    return false;
                }
            }
        }
    return true;
}
        public   HashMap <Department,ArrayList<Student>>  distributeLevel(int eduYear)
     {
        ArrayList<Department> departments =getDepslevel(eduYear);   
        setDeps(departments);
        List<Student> allStudentsDB=dal.getStudents();
        HashMap <Department,ArrayList<Student>> allStudents=new HashMap <Department,ArrayList<Student>> ();
        for(Department dep :departments)
        {       allStudents.put(dep,new ArrayList<Student>());
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
    ArrayList<Department> getDepslevel(int level)
     {
        ConnectionDB.setQuery("select department.* ,EDU_LEVEL_DEPARTMENT.* from DEPARTMENT ,EDU_LEVEL_DEPARTMENT where EDU_LEVEL_DEPARTMENT.EDU_LEVEL_ID= "+ level + "and department.id=EDU_LEVEL_DEPARTMENT.DEPARTMENT_ID order by EDU_LEVEL_DEPARTMENT.department_id");
        ResultSet res=ConnectionDB.connect();
        
        ArrayList<Department>  deps =new ArrayList<Department>();
        if (res!=null)
            try {
                while (res.next()) 
                {
                    Department dep =new Department();            
                    dep.setId(res.getInt( "DEPARTMENT_ID"));
                    dep.setMaxCapcity(res.getInt( "MAx_cap"));
                    dep.setMinCapcity(res.getInt( "Min_CAp"));
                    dep.setSize(0);
                    dep.setName(res.getString("NAME"));
                    deps.add(dep); 
     //               System.out.println("________ IDDEP "+dep.getId()+"   "+dep.getMaxCapcity()+"  "+dep.getMinCapcity()+"_________");
                }
            } catch (SQLException e) {
            }
    return deps;
    }
    ArrayList<Department> setDeps(ArrayList<Department>deps)
     {
        for (Department dep :deps)
        {
            Prequistes preq =new Prequistes();
            ArrayList<Subject> subjects=new  ArrayList<Subject>();
            String query="select Dep_prereq.* , PREREQUISITE.*  from DEP_PREREQ , PREREQUISITE where PREREQUISITE.ID=DEP_PREREQ.PREREQ_ID and DEP_PREREQ.DEP_ID="+dep.getId()+" ORDER by PREREQUISITE.SUBJECT";
            ConnectionDB.setQuery(query);
            ResultSet res=ConnectionDB.connect();            
                            try {
                //   System.out.println("hsmsm"+dep.getId());
                    while (res.next()) 
                    {
                        System.out.println("hsmsm");
                        Subject subj=new Subject();
                        subj.setId(res.getInt( "SUBJECT"));
                        subj.setdegree(res.getFloat( "MIN_MARK_SUBJECT"));
                        
                        subjects.add(subj);
                    }
                } catch (SQLException e) {
                                System.out.println(e+query);
                }
            preq.setSubjects(subjects);
            dep.setPreq(preq);
        }
        
    return deps;
    }
   
}
