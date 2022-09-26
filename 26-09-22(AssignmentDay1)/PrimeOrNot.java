// write a java program please find out the number is prime or not  

import java.util.Scanner;

public class PrimeOrNot {
	   public static void main(String args[]) {

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value of n ");
	 int n=sc.nextInt();
	 int flag=0;
	 if(n==0||n==1) {
		 System.out.println(n+ " is not a prime no also not a composite no ");

	 }
	 else {
	 
	 for(int i=2;i<n;i++) {
		 if(n%i==0) {
			 flag=1;
			 break;
		 }
	   }
	 
	 if(flag==0) {
		 System.out.println(n+ " is a prime no");

	 }
	 
	 else {
		 System.out.println(n+ " is not a prime no");

	   }
	 
	 }
   }
} 
