package com.Assignment1;
/*
 * 2. Write a Java program to copy an array by iterating the array.
 */
public class CopyArray {
  public static void copyArray(int arr[]) {
	  int newarr[]=new int[arr.length];  // create a new array for storing copied element
	  for(int i=0;i<arr.length;i++) {  // for loop for traversing an array 
		  newarr[i]=arr[i];
	  }
	  System.out.println("The newarray is  :");
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(newarr[i]);   // here we print the new array 
	  }

  }
  public static void main(String[] args) {
	int arr[]= {23,67,89,12,47,91,46}; // array dec and inc 
	copyArray(arr);
  }
}
