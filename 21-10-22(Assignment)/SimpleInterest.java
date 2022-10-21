package com.Assignment1;
/*
 * Q.3..Write a Java method to compute the future investment 
value at a given interest rate for a specified number 
of years. 

Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Outpu
Expected Output:

Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31
 */
import java.lang.*;
import java.util.Scanner;
public class SimpleInterest {
  public static void simpleInterest(double amount,double rateOfinterest,int year) {
	  
	  double FutureValue= (amount*Math.pow((1+rateOfinterest/100), year));   // here we find the compound interest 
	 
	  System.out.println("The feature value is " +FutureValue);

	  
	  
  }
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);  
	  System.out.println("Enter amount ");
	  double amount=sc.nextDouble();
	  System.out.println("Enter ROI ");
	  double roi=sc.nextDouble();
	  System.out.println("Enter Year ");
	  int year=sc.nextInt();
	  simpleInterest(amount,roi,year);
}
}
