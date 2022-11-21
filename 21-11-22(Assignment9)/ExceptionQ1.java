package com.Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQ1 {
	public void display() throws Exception {
		throw new MyException("My Excepion[pallabi]");
	}
   public static void main(String[] args) {
	   int a = 0;
	   int b = 2;
	   try {
		   int c=b/a;
	   }
	   catch(ArithmeticException e) {
		   System.out.println("Invalid division");
	   }
	   
	   try {
	  int num=Integer.parseInt("abc");
      }
      catch(NumberFormatException  fm) {
	  System.out.println("Format mishmatch");
      }

	   String str="Abhisek";
	   try {
		   int strind=str.charAt(10);
	   }
	   catch(StringIndexOutOfBoundsException e) {
		   System.out.println("String index is invalid");
	   }
	   int arr[]= {12,45,67,89};
	   try {
		   int arrindx=arr[20];
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Array index is invalid");
	   }
	   
	   
	}
}
