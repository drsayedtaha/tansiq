package com.cse.tansik.DTO;

public class User {

    private String userName;
    private String firstName, secondName, lastName;
    private String password;
    private String email;

    /*
     * university now included in edu year no need for it
     */

    /**
     * private University University; removed as this info already included in
     * edu_year
     */

    // abdelrahman ragab 4/12
    // eduyear name to eduyear more logical name was faculty
    private EduYear eduyear;

    public void setEduyear(EduYear eduyear) {
        this.eduyear = eduyear;
    }

    public EduYear getEduyear() {
        return eduyear;
    }

    private int role;
    private int id;

    private String Password;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

//    public void setUniversity(University University) {
//        this.University = University;
//    }
//
//    public University getUniversity() {
//        return University;
//    }

   


    public void setRole(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        User user2 = (User) o;
        if (this.id == user2.id && this.userName.equals(user2.userName))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return id+"   -- " +firstName+" "+secondName+" "+lastName+"--/"+eduyear.getFaculty()+"--/"+eduyear.getYear()+"---/ "+email;
//        return (this.id + " " + " " + this.userName + " " + this.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword1(String Password) {
        this.Password = Password;
    }

    public String getPassword1() {
        return Password;
    }
}
