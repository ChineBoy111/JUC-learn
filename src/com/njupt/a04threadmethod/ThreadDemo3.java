package com.njupt.a04threadmethod;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println("t1线程："+i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println("t2线程："+i);
                }
            }
        });
        t2.setDaemon( true);
        t1.start();
        t2.start();
    }
}
