package com.Assignment1;


class WithoutextendAndSetname extends Thread{
    public void run(){
        System.out.println("Abhisek");
    }

    public static void main(String[] args) {
        Thread t = new Thread("Maity");
        Thread t1 = new Thread();
        t.start();
        t1.start();
        t1.setName("Anudip");
        System.out.println(t.getName());
        System.out.println(t1.getName());
    }
}
