package com.Assignment1;

public class RunnableInterface implements Runnable {
  @Override
public void run() {
	// TODO Auto-generated method stub
	  System.out.println("I am a thread thread is running");
	
 }
  public static void main(String[] args) {
	RunnableInterface obj = new RunnableInterface();
	Thread t = new Thread(obj);
	t.start();
}
}
