package com.cse.tansik.DAL;

public class ManageGeneric<T> {
    
    private T t;
    public void add (T t){
        this.t=t;
  }
    public T get(){
        return this.t;
    }
    
    
    
    
    
    
    
}
