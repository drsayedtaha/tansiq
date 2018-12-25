package com.cse.tansiq.backing;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import java.util.LinkedHashMap;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class RequestBean {
    private String department;
   private Map<String , String> items;
   
    @PostConstruct
    
    public void init() {
        items = new LinkedHashMap<String , String>();
        items.put("Electrical Engineering-Communication And Technology" , "Electrical Engineering-Communication And Technology");
        items.put("Electrical Engineering-Computer Science Engineering" , "Electrical Engineering-Computer Science Engineering");
        items.put("Electrical Engineering-Power Engineering" , "Electrical Engineering-Power Engineering");
        items.put("Civil Engineering" , "Civil Engineering");
        items.put("Mechanical Engineering" , "Mechanical Engineering");
        items.put("Architectural Engineering" , "Architectural Engineering");
}

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }

    public Map<String, String> getItems() {
        return items;
     }
}
