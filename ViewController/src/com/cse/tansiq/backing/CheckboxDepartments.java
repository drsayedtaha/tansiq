package view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.annotation.PostConstruct;

import java.sql.*;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

/**
 * Author:
 */

@ManagedBean(name = "radioButtonResults")
@SessionScoped
public class CheckboxDepartments implements Serializable {
    public CheckboxDepartments() {
    }
    private ArrayList<String> titles = new ArrayList<>();
    private Integer eduYear;
    private String choises;
    private Integer id = -1;
    private Integer depID=0;

    @PostConstruct
    public void init() {

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "hr", "hr");
             Statement sttmnt = con.createStatement();
             ResultSet rs =
             sttmnt.executeQuery("SELECT EDU_LEVEL.ID,EDU_LEVEL.FACULTY,EDU_LEVEL.YEAR,EDU_LEVEL.DEPARTMENT_ID,DEPARTMENT.NAME FROM EDU_LEVEL\n" +
                                 "inner JOIN DEPARTMENT ON EDU_LEVEL.DEPARTMENT_ID=DEPARTMENT.ID ORDER BY EDU_LEVEL.ID\n" +
                                 ""))
        //HOTFIX
        /*
            sttmnt.executeQuery("SELECT * FROM YEARS ORDER BY YEARS.ID");)*/
        {
            while (rs.next()) {
                titles.add("Faculty: " + rs.getString("FACULTY") + " DEPARTMENT " + rs.getString("NAME") + " YEAR " +
                           rs.getInt("YEAR"));
                //HOTFIX
                // titles.add("Year: " + rs.getString("NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
    
        return id;
    }


    public String getChoises() {
        return choises;
    }


    public void setChoises(String choises) {
        this.choises = choises;
    }


    private Integer getId(String input) {

        for (int i = 0; i < titles.size(); i++) {
            if (input.equals(titles.get(i))) {
                id = i + 1;
            }
        }

        return id;
    }


    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

    public Integer getEduYear() {
        return eduYear;
    }

    public void setRduYear(Integer eduYear) {
        this.eduYear = eduYear;
    }

    public String send() {
        //Testing
        System.out.println("clicked");
        //Testing
        try {
            eduYear = getId(choises);
            FacesContext.getCurrentInstance()
                        .getExternalContext()
                        .getSessionMap()
                        .put("choise", id);
        } catch (NullPointerException e) {
            System.out.println(e);
            error();
            return null;
        }
        printContent();
        return "result";
    }

    public void printContent() {
        System.out.println(eduYear);
    }

    public void error() {
        FacesContext.getCurrentInstance()
            .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Empty input"));
    }

}


