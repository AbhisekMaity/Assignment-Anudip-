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
		System.out.println("The rate of interest on SBI is 8%");
	}
}
class ICCI extends Bank{   //this is child class of parent class Bank
	public void show() {
		System.out.println("The rate of interest on ICCI is 7%");
	}
}
class AXIS extends Bank{ // this is child class of parent class Bank
	public void show() {
		System.out.println("The rate of interest on AXIS is 9%");
	}
}
public class MainBank {
	public static void main(String[] args) {
		SBI obj1=new SBI();
		ICCI obj2=new ICCI();
		AXIS obj3=new AXIS();
		obj1.show();
		obj2.show();
		obj3.show();
	}
	
	
}
