package com.cse.tansik;

import com.cse.tansik.DAL.AdminAerDAOImp;
import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.EduYear;

public class Main_admin_test {

    public static void main(String[] args) {
        AdminAerDAOImp admindao = new AdminAerDAOImp();
        
        EduYear eduYear =new EduYear();
        eduYear.setId(10);
        eduYear.setFaculty("power");
        eduYear.setYear(1);
        eduYear.setDepartment("e3dady");
        eduYear.setUniversity("fayoum");
        
        
        Admin admin =new Admin();
        admin.setId(7);
        admin.setEmail("mas@dsa");
        admin.setUserName("mas@dsa");

        admin.setEduyear(eduYear);
        admin.setFirstName("dr");
        admin.setSecondName("ali");
        admin.setPassword("1234");
        admin.setRole(1);
        admin.setLastName("mo");
        
        
        
        
        System.out.println(admindao.save(admin));
    }
}
