package com.Assignment1;

public class ThreadExmple2 extends Thread {
  @Override
public void run() {
	  for(int i=0;i<5;i++) {
	  try {
		  Thread.sleep(500);  // sleeping the thread for 800 milisecond 
	  }
	  catch(InterruptedException e) {
		  System.out.println(e);
	  }
	  System.out.println(i);
	  }
}
  public static void main(String[] args) {
	  ThreadExmple2 t1=new ThreadExmple2();
	  ThreadExmple2 t2=new ThreadExmple2();

	  ThreadExmple2 t3=new ThreadExmple2();
//	  t1.start();
//	  t2.run();
//	  t3.run();
	  
	  t1.start();
	  try {
		  t1.join();
		  
	  }
	  catch(InterruptedException e) {
		  System.out.println(e);
	  }
	  t2.start();
	  try {
		  t2.join();
		  
	  }
	  catch(InterruptedException e) {
		  System.out.println(e);
	  }
	  
	  t3.start();


	  
}
}
