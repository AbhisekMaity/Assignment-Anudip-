package com.Assignment1;
/*
 * 3. Write a Java program to find the second smallest element in an array.
 */
public class SecondSmallestElement {
  public static void secSmallest(int arr[]) {
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {   // it is nothing but bubble sort technique 
			  if(arr[i]>arr[j]) {   // he we sort the array element 
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  System.out.println("The second smallest element is "+arr[1]);  // after sorting we print the 2nd index of an array 
  }
  public static void main(String[] args) {
	  int arr[]= {23,67,89,-12,-47,-91,46};  // inc and dec the array
	  secSmallest(arr);
}
}
