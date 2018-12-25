package com.cse.tansik;

import com.cse.tansik.BAL.LoginBao;
import com.cse.tansik.BAL.LoginBaoImp;
import com.cse.tansik.DAL.LoginDao;
import com.cse.tansik.DTO.User;

public class Maintest {

    public static void main(String[] args) {
        LoginBao loginbao =new LoginBaoImp();
        LoginDao logindao =new LoginDao();
        User user2=logindao.login("1546");
        User user= loginbao.login("1546", "****"); 
        System.out.print(user);
        System.out.print(user2);

    }
}
