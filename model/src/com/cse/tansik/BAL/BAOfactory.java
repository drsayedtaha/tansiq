package com.cse.tansik.BAL;

public class BAOfactory {
    
    public static GMBAO createGMBAO(){
        return new GMBAOImpl();
    }
    
    
}
