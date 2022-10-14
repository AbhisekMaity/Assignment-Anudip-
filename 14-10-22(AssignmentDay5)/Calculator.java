package com.Assignment1;
/*
 * 2.Write a java program to illustrate Calculator
 *  class with addition, subtraction,
 multiplication methods that can take any number
  of parameters to perform the operation,
without using method/constructor overloading
 */
import java.util.Scanner;


public class Calculator {
	public static void main(String args[]) {
		double a;
		double b;
		int n;
		do {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		System.out.println("Enter the operators + for addition, - for Substraction, * for multiplication  ");
		String opr=sc.next();

		
		switch(opr) {
		case "+":
			System.out.println("The addition of two number is " +(a+b));
			break;
		case "-":
			System.out.println("The Substration of two number is " +(a-b));
			break;
		case "*":
			System.out.println("The Multiplication of two number is " +(a*b));
			break;
		
		default:
			System.out.println("Invalid input");

		 }
		 
			System.out.println("Enter 1 for continue 0 for exit");
			 n=sc.nextInt();

		}while(n==1);
	  
	 }

}