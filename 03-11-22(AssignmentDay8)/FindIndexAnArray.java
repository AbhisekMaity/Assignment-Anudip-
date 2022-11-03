package com.Assignment1;
/*
 * 1. Write a Java program to find the index of an array element
 */
import java.util.Scanner;

public class FindIndexAnArray {
  public static void findIndex(int arr[],int n) {
	  boolean b=false;  
	  for(int i=0;i<arr.length;i++) {  // using for loop for traversing an array 
		  if(arr[i]==n) {
			  b=true;
			  System.out.println("The index of this array element is "+i);
			  break;
		  }
		  
	  }
	  if(b==false) {
		  System.out.println("Opps this element is not present is not present in side the array");
	  }
  }
  public static void main(String[] args) {
	int arr[]= {23,67,89,12,47,91,46};  // array inc and dec 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element whose index you want to find");
	int n=sc.nextInt();
	findIndex(arr,n);
}
}
