package com.cse.tansik.DTO;

public class AdminServer extends User {

    Admin admins[];
    University university;

    public void setAdmins(Admin[] admins) {
        this.admins = admins;
    }

    public Admin[] getAdmins() {
        return admins;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }
}
