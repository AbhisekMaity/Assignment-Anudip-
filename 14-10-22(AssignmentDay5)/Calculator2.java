package com.loop.java;
/*
 * 2.Write a java program to illustrate Calculator
 *  class with addition, subtraction,
 multiplication methods that can take any number
  of parameters to perform the operation,
without using method/constructor overloading
 */
public class Calculator2 { 
  public int addition(int...add) { // using varargs
	  int sum=0;
	  for(int i:add) {   // we use foreach loop here
		  sum=sum+i;
		 }
	  return sum;
	  
  }
  public int substraction(int...sub) {  // using varargs
	  int x=0;
	  for(int i:sub) {   // we use foreach loop here
		  x=i-x;
		 }
	  return x;
	  
  }
  public int multiplication(int...mul) {  // using varargs
	  int multiply=1;
	  for(int i:mul) {   // we use foreach loop here 
		  multiply=multiply*i;
		 }
	  return multiply;
	  
  }
  public static void main(String[] args) {
	  Calculator2 obj = new Calculator2();
	  int result1=obj.addition(12,45,67,89);
	  int result2=obj.multiplication(4,2);
	  int result3=obj.substraction(12,34);
	  System.out.println("Addition " + result1);
	  System.out.println("Multiplication " + result2);
	  System.out.println("substration " + result3);

	  
}
}
