import com.cse.tansik.DAL.Driver_dao;
import com.cse.tansik.DTO.*;

import java.sql.*;

import java.sql.SQLException;

//Driver seen in the same package



public class request {

    public request() {

        super();
    }

   private int id;

   private Department dep;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public Department getDep() {
        return dep;
    }

    public static void main (String[] args) {

        //call my method..

    }
      
    boolean addRequest(Department dep , int order) {

    String command = "insert into STUDENTS_REQUESTS ( DEP_ID , STUDENT_ID , ORDER)" + "values ("+dep.getId()+","+ order+")";

        try {

            Statement st;
            st = Driver_dao.getConnection().createStatement();
            st.executeUpdate(command);
        } catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        
        return true;
}
    boolean editRequest (Department dep , int order) {
        String command = "Update STUDENTS_REQUESTS ( DEP_ID , STUDENT_ID , ORDER)" + "values ("+dep.getId()+" , " +order +")";    
        try {

            Statement st;
            st = Driver_dao.getConnection().createStatement();
            st.executeUpdate(command);
        } catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
       return false;
    }

}
        
    