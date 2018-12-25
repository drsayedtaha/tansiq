/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.tansik.BAL;

import com.cse.tansik.DTO.User;

/**
 *
 * @author ZAS
 */
public interface LoginBao {
    
   

    /**
     *
     * @param info
     * @return
     */
    
    public User login(String userName,String password);
}
