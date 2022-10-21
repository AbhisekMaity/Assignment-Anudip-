package com.Assignment1;
// Q.2..Write a program in Java to display the cube of the number
//upto given an integer..

import java.util.Scanner;

public class QubeOfAnumber {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter the number ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {   // upto n 
		System.out.println("The qube of " +i+ " is "+i*i*i);  // here we find the cube
	}
   }
}
