package com.Assignment1;

public class WithOutRunnable implements Runnable {
	public void run() {
		System.out.println("I am not a thread a thread method i am a normal method ");
   }
	public static void main(String[] args) {
		WithOutRunnable obj = new WithOutRunnable();
		Thread t=new Thread(obj,"Abhisek");
		t.start();
		String s=t.getName();
		System.out.println(s);
		
	}
}
