package com.Assignment1;
/*
 * problem 1:

In this example, you have a base class Teacher and a 
sub class ITTeacher. Since class ITTeacher extends the designation
and college properties and work () method from base class,
we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method 
which are common to all the teachers so we have 
declared them in the base class,this way the child classes 
like Math Teacher, Music Teacher and PhysicsTeacher 
do not need to write this code and can be used directly from base class.
 */

class Teacher2 {
	
	String designation="HOD";
	String college="Haldia Institute of Technology";
	public void work() {
		System.out.println(" || Designation: " +designation+ " || College: " +college);
	}
}
class ITTeacher2 extends Teacher2{
	
	String sub="Java";
	
}
class MathTeacher2 extends Teacher2{
	String sub="LinearAlgebra";

}
class MusicTeacher2 extends Teacher2{
	String sub="RobindraSangit";

}
class PhysicsTeacher2 extends Teacher2{
	String sub="Quantum Physics";

}

public class MainTeacher2 {
	
	public static void main(String[] args) {
		ITTeacher2 it = new ITTeacher2(); 
		System.out.print("Subject: "+it.sub);
		it.work();
		MathTeacher2 mt =new MathTeacher2();
		System.out.print("Subject: "+mt.sub);

		mt.work();
		MusicTeacher2 mct=new MusicTeacher2();
		System.out.print("Subject: "+mct.sub);

		mct.work();
		PhysicsTeacher2 pt = new PhysicsTeacher2();
		System.out.print("Subject: "+pt.sub);

		pt.work();
	}
	

}