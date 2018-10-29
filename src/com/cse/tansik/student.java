package com.cse.tansik;

public abstract class student extends user {
	 subject[] subjects;
	 branch[] branches;
	 String nationalID;
         float degree;
         int year;
public abstract void SelectBranche (String name );
public abstract void deSelectBranche (String name);
}
