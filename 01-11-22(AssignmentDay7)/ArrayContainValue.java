package com.Assignment1;
//write a java program to test if an array contains a specific value.
import java.util.Scanner;

class ArrayContainValue {
public static void findVal(int arr[],int terget) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {  // using for loop for terverse array 
		  if(arr[i]==terget) {   // here check the target value 
			  count++;
			  break;
		  }
	  }
	  if(count==1) {
		  System.out.println(terget+ " Yes this value is contain on array" );
	  }
	  else {
		  System.out.println("Opps this value is not contain on array.");
	  }
}
public static void main(String[] args) {
		int arr[]= {12,45,78,90,34};  // dec and inc an array 

	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter the terget value ");
	  int target=sc.nextInt();
	findVal(arr,target);
}
}
