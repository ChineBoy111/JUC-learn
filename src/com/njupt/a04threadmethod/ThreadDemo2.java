package com.njupt.a04threadmethod;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++){
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
        t1.setPriority(8);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
