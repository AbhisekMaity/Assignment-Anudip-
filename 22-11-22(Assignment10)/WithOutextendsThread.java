package com.Assignment1;

public class WithOutextendsThread {
// directly we use thread class without extend
		public void run() {
			System.out.println("Hello World ");
		}
	
    public static void main(String[] args) {
		Thread t = new Thread("Abhisek");
		t.start();
		String s=t.getName();
		System.out.println(s);
	}
}
