package com.Assignment1;
/*
 * 1.write a java program to print sum of odd numbers upto N?
 */
import java.util.Scanner;

public class SumOfOddUptoN {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the value of n: ");
	int n=sc.nextInt();
	int count=0;
	for(int i=0;i<=n;i++) {
		if(i%2==1) {
			
			count=count+i;
		}
	}
	System.out.println("The sum of n odd number is "+count);
	
	
}
}
