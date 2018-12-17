package com.cse.tansik.BAL;

public class BAOfactory {
    
    public GMBAO createGMBAO(){
        return new GMBAOImpl();
    }
    
    
}
