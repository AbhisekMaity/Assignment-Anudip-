package com.Assignment1;
/*
 * Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.
 */
class Bank{
	
}
class SBI extends Bank{  // this is child class of parent class Bank
	public void show() {
		int interest=8;
		System.out.println("The rate of interest on SBI is "+interest+"%");
	}
}
class ICICI extends Bank{   //this is child class of parent class Bank
	public void show() {
		int interest=7;
		System.out.println("The rate of interest on ICICi is "+interest+"%");
	}
}
class AXIS extends Bank{ // this is child class of parent class Bank
	public void show() {
		int interest=9;
		System.out.println("The rate of interest on AXIS is "+interest+"%");
	}
}
public class MainBank {
	public static void main(String[] args) {
		SBI obj1=new SBI();
		ICICI obj2=new ICICI();
		AXIS obj3=new AXIS();
		obj1.show();
		obj2.show();
		obj3.show();
	}
	
	
}
