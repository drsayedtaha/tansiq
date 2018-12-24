package DAL;
import oracle.jdbc.*;
import java.util.*;
import util.ConnectionDB;
/**
Author:mohammed ayman
*/
public class DAlWeb {
    
    public void Insert(int Role ,String wepSite){
        ConnectionDB.setUsername("hr");
        ConnectionDB.setPassword("hr");
        ConnectionDB.setService("ORCL00");
        ConnectionDB.setPort("1523");
        String Query = "INSERT INTO USER_WEBSITE (Role,wepSite )" +
"VALUES ("+Role+",'"+wepSite+"')";
        ConnectionDB.setQuery(Query);
        ConnectionDB.connect();
    }
    public void Update(int Role,String wepSite){
        ConnectionDB.setUsername("hr");
        ConnectionDB.setPassword("hr");
        ConnectionDB.setService("ORCL00");
        ConnectionDB.setPort("1523");
         String Query= "DELETE FROM USER_WEBSITE WHERE Role ="+Role+"";
        ConnectionDB.setQuery(Query);
        ConnectionDB.connect();
}
 public void Delete(int Role,String wepSite){
        ConnectionDB.setUsername("hr");
        ConnectionDB.setPassword("hr");
        ConnectionDB.setService("ORCL00");
        ConnectionDB.setPort("1523");
            String Query= "UPDATE USER_WEBSITE\n" +
"SET wepSite ="+wepSite+"\n" +
"WHERE Role ="+Role+"";
        ConnectionDB.setQuery(Query);
        ConnectionDB.connect();
}
}