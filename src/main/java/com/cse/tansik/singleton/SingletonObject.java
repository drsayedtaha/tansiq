package com.cse.tansik.singleton;


/**
 * @Author: Abdullah khaled kamal
 * created on: 11/27/2018
 * last updated on: 11/27/2018
 */

public class SingletonObject {
    private SingletonObject(){}
    private static final SingletonObject singleton_object = new SingletonObject();


    public static SingletonObject getSingletonStudent() {
        return singleton_object;
    }
}
