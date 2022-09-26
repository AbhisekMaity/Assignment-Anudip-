// write a program to find the no is Armstrong or not 

import java.util.Scanner;
public class AmstrontNo {
	public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of n ");
  int n=sc.nextInt();
  int temp=n;
  int rem,sum=0;
  while(n!=0) {
	  rem=n%10;  // Find the remainder or we can say find the last digit of the no
	  sum=sum+rem*rem*rem;   
	  n=n/10;  // remove the last digit of the no 
	  
  }
  if(temp==sum) {
	  System.out.println("Yes " +temp+ " is Armstrong number");

    }
  else {
	  System.out.println(temp+ " is not Armstrong number");
	  

  }
  }
}