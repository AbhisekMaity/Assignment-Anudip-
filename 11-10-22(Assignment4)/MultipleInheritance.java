package com.Assignment1;
/*
 * Problem 2 :

Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)
 */
class A{
	void dis1() {
		System.out.println("Class A");
	}
}
class B extends A{
	void dis2() {
		System.out.println("Class B");
	}
}
class C extends B{
	void dis3() {
		System.out.println("Class C");
	}
}

public class MultilevelInheritance {
  public static void main(String[] args) {
	C obj = new C();  
	// here we just create the object for class C and this object called all the method 
	// which are present in the difference class this is nothing but multilevel inheritance.
 obj.dis1();
 obj.dis2();
 obj.dis3();
 
	
}
}
