package com.Assignment1;


class DemonThreaddeg extends Thread{
    @Override
    public void run() {
//  try {
      System.out.println("Name :" + Thread.currentThread().getName());
      System.out.println("Demon :" + Thread.currentThread().isDaemon());
      if (Thread.currentThread().isDaemon()) {
          System.out.println("I am a demond thread");
      } else {
          System.out.println("I am user thread");
      }
//  }
//  catch (Exception e){
//      System.out.println("dfl");
//  }
        }


    public static void main(String[] args) {
        DemonThreaddeg t1 = new DemonThreaddeg();
        DemonThreaddeg t2 = new DemonThreaddeg();
//        t1.setDaemon(true);
        t1.start();
        t1.setDaemon(true);
        t2.start();

    }
}