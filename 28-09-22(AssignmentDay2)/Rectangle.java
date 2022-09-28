/*
 * Class assignments :

Problem Code 1:

you will make a class ‘Rectangle’ and declare the variable
length and breadth as private. One Constructor will be used for 
initializing the value of variables. 

When an object is created, the constructor will be called and 
the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an 
object of class Rectangle and assign values of the parameter used 
in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. 
And then read the updated value. 

Sample Output:   

Area = 800

New area = 900
 */
package com.Assignment1;

public class Rectangle {
  private double length;
  private double breadth;
  Rectangle(){
	  length=9;
	  breadth=7;
System.out.println("Area = " +length*breadth);

  }
  Rectangle(double length,double breadth){
	  this.length=length;
	  this.breadth=breadth;
	  System.out.println("New Area = " +this.length*this.breadth);

  }
}
