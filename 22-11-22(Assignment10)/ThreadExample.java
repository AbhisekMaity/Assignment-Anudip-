package com.Assignment1;
class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("I am a thread... now thread is running");
    }

    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
//        ThreadExample obj1=new ThreadExample();
//        obj.run();
        obj.start();
//        obj1.start();
        System.out.println("Main");
        obj.setName("Abhisek");
       String s=obj.getName();
        System.out.println(s);
    }
}
