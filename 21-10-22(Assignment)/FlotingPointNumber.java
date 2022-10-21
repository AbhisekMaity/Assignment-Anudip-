package com.Assignment1;


import java.util.Scanner;
public class FlotingPointNumber {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Enter second floating-point number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);   // round of upto 3
        x = x / 1000;

        y = Math.round(y * 1000);  // round of upto 3
        y = y / 1000;

        if (x == y||y==x)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}