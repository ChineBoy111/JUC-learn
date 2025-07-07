package com.njupt.a09Pool;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程启动了");
    }
}
