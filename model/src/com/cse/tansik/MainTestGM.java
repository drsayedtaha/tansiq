package com.cse.tansik;

import com.cse.tansik.BAL.BAOfactory;
import com.cse.tansik.BAL.GMBAO;
import com.cse.tansik.DAL.AdminDAO;
import com.cse.tansik.DAL.DAOfactory;

public class MainTestGM {

    public static void main(String[] args) {
        AdminDAO admindao =DAOfactory.createAdminDAO();
        String path = "newdata.csv";
        admindao.addstudentsDataBase("das", 2);
                       

    
    
    }
    
}
