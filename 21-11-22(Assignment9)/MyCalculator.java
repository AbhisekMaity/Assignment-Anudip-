package com.Assignment1;

public class MyCalculator {
 long power(int n,int p) throws Exception{
	 if(n<0 || p <0) {
		 throw new Exception("N and p shoud not be negative");
	 }
	 else if(n==0 &&p==0) {
		 throw new Exception("n and p should no be zero");
	 }
	 else {
	 return (long) Math.pow(n, p);
	 }
 }
 public static void main(String[] args) throws Exception {
	 MyCalculator obj = new MyCalculator();
	 long result=obj.power(67, -10);
	 System.out.println("Result is " +result);
  }
}
