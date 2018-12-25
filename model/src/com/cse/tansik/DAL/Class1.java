//package client;
//
//import java.sql.DriverManager; 
//
//    import com.cse.tansik.DTO.Department;
//    import com.cse.tansik.DTO.EduYear;
//    import com.cse.tansik.DTO.Message;
//    import com.cse.tansik.DTO.Request;
//    import com.cse.tansik.DTO.Student;
//
//    import com.cse.tansik.DTO.User;
//
//    import java.sql.DriverManager;
//    import java.sql.ResultSet;
//
//    import java.sql.Statement;
//
//    import java.sql.Connection;
//    import java.sql.DriverManager;
//    import java.sql.ResultSet;
//    import java.sql.SQLException;
//    import java.sql.Statement;
//
//    import java.util.ArrayList;
//    import java.util.Collections;
//    import java.util.List;
//    import oracle.jdbc.*;
//    import java.util.Collections;
//    import java.util.List;
//
//    public class DepartmentDao {
//        
//        private static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
//        private static String username = "hr";
//        private static String password = "hr";
//
//    }
//    @Override
//    public boolean addDepartment(Department department) {
//        String query="INSERT INTO DEPARTMENT(ID , NAME  )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getID());
//         stmt.setString(2,Department.getNAME());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//    public boolean deleteDepartment(Department department) {
//        String query="DELETE = DEPARTMENT(ID , NAME  )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getID());
//         stmt.setString(2,Department.getNAME());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }    public boolean updateDepartment(Department department) {
//        String query="update = DEPARTMENT(ID , NAME  )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getID());
//         stmt.setString(2,Department.getNAME());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//    
//   public boolean  EduYear ( EduYear   eduYear ) {
//        String query="INSERT INTO EDU_LEVEL (ID , YEAR, DEPARTMENT_ID ,FACULTY  )" 
//                                      + "VALUES(?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getId());
//         stmt.setint(2,Department.getYEAR());
//         stmt.setString(3,Department.getDEPARTMENT_ID ());
//         stmt.setString(4,Department.getFACULTY());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//          public booleannsert EduYear ( EduYear   eduYear ) {
//        String query="DELETE EDU_LEVEL (ID , YEAR, DEPARTMENT_ID ,FACULTY  )" 
//                                      + "VALUES(?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getId());
//         stmt.setint(2,Department.getYEAR());
//         stmt.setString(3,Department.getDEPARTMENT_ID ());
//         stmt.setString(4,Department.getFACULTY());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//   public boolean EduYear ( EduYear   eduYear ) {
//        String query="UPDATE EDU_LEVEL (ID , YEAR, DEPARTMENT_ID ,FACULTY  )" 
//                                      + "VALUES(?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getId());
//         stmt.setint(2,Department.getYEAR());
//         stmt.setString(3,Department.getDEPARTMENT_ID ());
//         stmt.setString(4,Department.getFACULTY());
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//   public boolean DEP_PREREQ(DEPPREREQ dEPPREREQ) {
//        String query="INSERT INTO DEP_PREREQ (DEP_ID , PREREQ_ID )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getDEP_ID());
//         stmt.setint(2,Department.getPREREQ_ID());
//        
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//       public boolean DEP_PREREQ() {
//        String query="DELETE DEP_PREREQ (DEP_ID , PREREQ_ID )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getDEP_ID());
//         stmt.setint(2,Department.getPREREQ_ID());
//        
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//       public boolean DEP_PREREQ() {
//        String query="UPDATE DEP_PREREQ (DEP_ID , PREREQ_ID )" 
//                                      + "VALUES(?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setint(1,Department.getDEP_ID());
//         stmt.setint(2,Department.getPREREQ_ID());
//        
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//   public boolean Preq(Prequistes preq) {
//        String query="INSERT INTO  PREREQUISITE ( SUBJECT , ID, MIN_MARK_SUBJECT , CURRENT_EDU_LEVEL_ID , MIN_MARK_DEP  )" 
//                                      + "VALUES(?,?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setString(1,Department.getSUBJECT());
//         stmt.setint(2,Department.getPREREQ_ID());
//         stmt.setint(3,Department.getMIN_MARK_SUBJECT());
//        stmt.setint(4,Department.getCURRENT_EDU_LEVEL_ID());
//        stmt.setint(5,Department.get MIN_MARK_DEP ());
//       
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//        public boolean Preq(Prequistes preq) {
//        String query="DELETE  PREREQUISITE ( SUBJECT , ID, MIN_MARK_SUBJECT , CURRENT_EDU_LEVEL_ID , MIN_MARK_DEP  )" 
//                                      + "VALUES(?,?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setString(1,Department.getSUBJECT());
//         stmt.setint(2,Department.getPREREQ_ID());
//         stmt.setint(3,Department.getMIN_MARK_SUBJECT());
//        stmt.setint(4,Department.getCURRENT_EDU_LEVEL_ID());
//        stmt.setint(5,Department.get MIN_MARK_DEP ());
//       
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//      public boolean Preq(Prequistes preq) {
//        String query="UPDATE PREREQUISITE ( SUBJECT , ID, MIN_MARK_SUBJECT , CURRENT_EDU_LEVEL_ID , MIN_MARK_DEP  )" 
//                                      + "VALUES(?,?,?,?,?)";
//                 try(connection con = DriverManager.getConnection(url, user, password);
//                       preparedStatement stmt =con.prepareStatement(query);
//){       stmt.setString(1,Department.getSUBJECT());
//         stmt.setint(2,Department.getPREREQ_ID());
//         stmt.setint(3,Department.getMIN_MARK_SUBJECT());
//        stmt.setint(4,Department.getCURRENT_EDU_LEVEL_ID());
//        stmt.setint(5,Department.get MIN_MARK_DEP ());
//       
//
//         stmt.executeUptate();}
//        catch(SQLException ex){
//{        while(ex!=null){
//            System.out.println("SQLSate" + ex.getSQLState());
//            System.out.println("Error Code" + ex.getErrorCode());
//            System.out.println("Message" + ex.get.Message());
//            Throwable t=ex.getcause();
//                while(t!=null){
//                  System.out.println("cause:" + t);
//                  t=t.getcause();
//                  }
//                 ex = ex.getNextExcetion();
//}
//}
//   
//        return false;
//    }
//   