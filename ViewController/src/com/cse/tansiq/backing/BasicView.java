package com.cse.tansiq.backing;

//TODO get edu_level data from database
//TODO use edu level to filter 1

import com.cse.tansik.BAL.BAOfactory;
import com.cse.tansik.BAL.GMBAO;
import com.cse.tansik.DAL.GMDAO;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.User;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean(name="dtBasicView")
@ViewScoped

public class BasicView {
    
    private Integer slectedUserOption ;
    private Integer slectedFacultyOption;
    private Integer slectedYearOption;
    private Integer slectedDepartmentOption;
    
    private EduYear slectedEduYear =new EduYear() ;

    private Map<Integer,String>  reverse(Map <String,Integer> map){
        Map<Integer,String> mapinv = new HashMap<>();

        for (String key : map.keySet()){
            mapinv.put(facultyMap.get(key), key);
        }
        
        return mapinv ;
    }

    private void setSlectedEduYear(){
        //add deparment
        
        
        Map<Integer,String> facultyMapinv = reverse(facultyMap);
                
        //done solve null pointer exeption from map
        System.out.println(facultyMap);
        System.out.println(facultyMapinv);
        
        if(slectedYearOption != null) 
            slectedEduYear.setYear(slectedYearOption);    
        else 
            slectedEduYear.setYear(-1);
        
        slectedEduYear.setFaculty(facultyMapinv.get(slectedFacultyOption));
        System.out.println(slectedEduYear);

    }
    
    private List<User> users;
    private GMBAO gm = BAOfactory.createGMBAO();
    private Map<String, Integer> userMap; 
    private Map<String, Integer> facultyMap; 
    private Map<Integer, Integer> yearMap; 
    private Map<String, Integer> deparmentMap; 
    
    @PostConstruct
    public void init() {

        
        //map for user selection
        userMap = new HashMap<>();
        userMap.put("Student", GMBAO.student_role);
        userMap.put("Admin", GMBAO.admin_role);
        
        //TODO map for faculty sould be dynamic get edu year first
        

        facultyMap = new HashMap<>();
        facultyMap.put("engi",1);
        facultyMap.put("scince",2);
        facultyMap.put("computer",3);

        yearMap = new HashMap<>();
        yearMap.put(1,1);
        yearMap.put(2,2);
        yearMap.put(3,3);
        
        deparmentMap = new HashMap<>();
        deparmentMap.put("e3dady",1);
        deparmentMap.put("three electric",2);
        deparmentMap.put("three mechanics",3);

    }
    
    public String search(){
    //use data layer
        System.out.println(slectedUserOption+"  -  fac: "+slectedFacultyOption+"  -  year: "+slectedYearOption+"   -  "+slectedDepartmentOption);
      
//    if role null => -1
//    if dep null => ""
//    if year null => -1
//    if faculty null => ""
//      if (slectedUserOption == null)
          
        
        
    //select only user 
        //get by role
    //select faculty only 
        //role -1
        //set eduyear to 
        //faculty -> selected
        //year to -1
        //department -> ""
    //select both
        //set eduyear to 
        //faculty -> selected
        //year to -1
        //department -> ""
    //select departmen


        if (slectedUserOption==null && slectedFacultyOption==null)
            users = gm.getUsers();     
        else if (slectedUserOption!=null && slectedFacultyOption==null)
            users = gm.getUsers(slectedUserOption);
        //dep =""     emty true
        //year -1     -1 no year filter
//        else if (slectedUserOption!=null && slectedFacultyOption!=null){
//            gm.getUsers(slectedUserOption, slectedEduYear);
//        }
//        else if(slectedUserOption==null && slectedFacultyOption==null)
////            users = gm.getUsers(slectedUserOption,);            
        return null;
//    
    }
        
        
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
     

//    @ManagedProperty("#{GMBAO}") 
//    public void setService(CarService service) {
//        this.service = service;
//    }
    public void setSlectedUserOption(Integer slectedUserOption) {
        this.slectedUserOption = slectedUserOption;
    }

    public Integer getSlectedUserOption() {
        return slectedUserOption;
    }
    public void setSlectedFacultyOption(Integer slectedFacultyOption) {
        this.slectedFacultyOption = slectedFacultyOption;
        setSlectedEduYear();
    }

    public Integer getSlectedFacultyOption() {
        return slectedFacultyOption;
    }

    public void setSlectedYearOption(Integer slectedYearOption) {
        this.slectedYearOption = slectedYearOption;
        setSlectedEduYear();
    }

    public Integer getSlectedYearOption() {
        return slectedYearOption;
    }


    public void setUserMap(Map<String, Integer> usersMap) {
        this.userMap = usersMap;
    }

    public Map<String, Integer> getUserMap() {
        return userMap;
    }

    public void setFacultyMap(Map<String, Integer> facultyMap) {
        this.facultyMap = facultyMap;
    }

    public Map<String, Integer> getFacultyMap() {
        return facultyMap;
    }

    public void setSlectedDepartmentOption(Integer slectedDepartmentOption) {
        this.slectedDepartmentOption = slectedDepartmentOption;
    }

    public Integer getSlectedDepartmentOption() {
        return slectedDepartmentOption;
    }

    public void setSlectedEduYear(EduYear slectedEduYear) {
        this.slectedEduYear = slectedEduYear;
    }

    public EduYear getSlectedEduYear() {
        return slectedEduYear;
    }

    public void setYearMap(Map<Integer, Integer> yearMap) {
        this.yearMap = yearMap;
    }

    public Map<Integer, Integer> getYearMap() {
        return yearMap;
    }

    public void setDeparmentMap(Map<String, Integer> deparmentMap) {
        this.deparmentMap = deparmentMap;
    }

    public Map<String, Integer> getDeparmentMap() {
        return deparmentMap;
    }

}
