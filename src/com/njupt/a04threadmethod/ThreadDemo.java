package com.njupt.a04threadmethod;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        Thread.sleep(1000);
        System.out.println(t1.getName());
    }
}
