package com.cse.tansik.DTO;

public class Page {

    private String url;
    private Integer role;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return role;
    }

    @Override
    public String toString() {
        
        return role+"  --  "+url;
    }
}
