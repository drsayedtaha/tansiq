package view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.annotation.PostConstruct;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
/**
 * Author: 
 */

@ManagedBean(name = "checkboxResults")
@RequestScoped
public class CheckboxDepartments implements Serializable {
    public CheckboxDepartments() {
    }
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<Integer> eduYearIds = new ArrayList<>();
    private List<String> choises;

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
                titles.add("Year: " + rs.getString("NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<String> getChoises() {
        return choises;
    }


    public void setChoises(List<String> choises) {
        this.choises = choises;
    }


    private ArrayList<Integer> getId(List<String> input) {
        ArrayList<Integer> id = new ArrayList<>();
        int indexForInput = 0;
        for (int i = 0; i < titles.size(); i++) {
            if (input.get(indexForInput).equals(titles.get(i))) {
                id.add(i + 1);
                if (indexForInput < input.size() - 1)
                    indexForInput++;
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

    public ArrayList<Integer> getEduYearIds() {
        return eduYearIds;
    }

    public void setEduYearIds(ArrayList<Integer> eduYearIds) {
        this.eduYearIds = eduYearIds;
    }

    public String send() {
        //Testing
        System.out.println("clicked");
        //Testing
        System.out.println("number of choises =  " + choises.size());
        if (choises.size() != 0)
            eduYearIds = getId(choises);
        else {
            System.out.println("null input");
            error();
            return null;
        }
        printContent();
        return "next";
    }

    public void printContent() {
        for (int i = 0; i < eduYearIds.size(); i++) {
            //Testing
            System.out.println("inside printing content");
            System.out.println(eduYearIds.get(i));
        }
    }
    public void error() {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Empty input"));
        }

}


