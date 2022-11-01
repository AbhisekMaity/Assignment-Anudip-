package com.Assignment1;
// Write a java program to find the duplicate values of an array of integer values 
public class ArrayDuplicateValue {
  public static void findDupicate(int arr[]) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {  // here we can use nested for loop 
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]==arr[j]) {  // here checking the duplicate values 
				  count++;
				  System.out.println(arr[i]);
				  break;
			  }
		  }
	  }
	  if(count==0)
	  System.out.println("The array does not contain any duplicate values ");
  }
  public static void main(String[] args) {
		int arr[]= {12,45,90,78,67,90,12,45};  // dec and inc an array 
		findDupicate(arr);

  }
}
