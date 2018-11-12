package com.cse.tansik.dto;

public class User {

    private String userName;
    private String firstName, secondName, lastName;
    private String password;
    private String email;
    private University University;
    private EduYear faculty;
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

    public void setUniversity(University University) {
        this.University = University;
    }

    public University getUniversity() {
        return University;
    }

    public void setFaculty(EduYear faculty) {
        this.faculty = faculty;
    }

    public EduYear getFaculty() {
        return faculty;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId1() {
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
        return (this.id + " " + " " + this.userName + " " + this.email);
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
