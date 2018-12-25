package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import javax.annotation.PostConstruct;

import javax.faces.context.FacesContext;


@ManagedBean(name = "result")
@SessionScoped
public class Result {
    private Integer test;
    private Integer result;
    private Integer depID;
    private String depName;
    private ArrayList<String> students;
    
    public Result() {}

    @PostConstruct
    public void init() {
        students.add("test1");
        students.add("test1");
        students.add("test1");
        students.add("test1");
        students.add("test1");
        students.add("test1");

       result= (Integer)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("choise");
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "hr", "hr");
             Statement sttmnt = con.createStatement();
             ResultSet rs =
             sttmnt.executeQuery("SELECT DEPARTMENT_ID FROM EDU_LEVEL WHERE ID"+result);)
        
        {
            while (rs.next()) {
                depID=rs.getInt("DEPARTMENT_ID");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //DEP name
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "hr", "hr");
             Statement sttmnt = con.createStatement();
             ResultSet rs =
             sttmnt.executeQuery("SELECT NAME FROM DEPARTMENT WHERE ID"+depID);)
        
        {
            while (rs.next()) {
                depName=rs.getString("DEPARTMENT_ID");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public Integer getDepID() {
        return depID;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getStudents() {
        return students;
    }
}
