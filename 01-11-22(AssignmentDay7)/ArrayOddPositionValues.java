package com.Assignment1;
// we need to print the element of the array which are present in odd position 
public class ArrayOddPositionValues {
   public static void oddPosition(int arr[]) {
	   System.out.println("The odd position values are ");
	   for(int i=0;i<arr.length;i+=2) {  // using for loop for traverse an array and also find odd position
		   System.out.println(arr[i]);
	   }
   }
   public static void main(String[] args) {
	int arr[]= {12,45,67,89,32,45,87};  // array inc and dec
	oddPosition(arr);
  }
}
