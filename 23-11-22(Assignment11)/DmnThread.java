package com.Assignment1;
class DmnThread extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName());
            System.out.println("I am Daemon");

        }
        else {
            System.out.println("I am user Thread ");
        }

    }

 public static void main(String[] args)  {
        DmnThread t1 = new DmnThread();
        DmnThread t2 = new DmnThread();
        DmnThread t3 = new DmnThread();
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
