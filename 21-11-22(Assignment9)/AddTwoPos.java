package com.Assignment1;

import java.util.Scanner;

/*
* Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 


 */
public class AddTwoPos {
  public void addTwoPositive(int a, int b) throws ArithmeticException{
	  if(a < 0|| b<0) {
		  throw new ArithmeticException("Non-positive integer sent.");  // throw an exception 
	  }
	  else {
		  System.out.println("The sum of two number is "+(a+b));
	  
	 }
	  
  }
  public static void main(String[] args) {
	AddTwoPos obj = new AddTwoPos();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a and b ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	obj.addTwoPositive(a, b);
}
}
