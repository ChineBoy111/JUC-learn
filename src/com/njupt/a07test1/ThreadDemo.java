package com.njupt.a07test1;

import com.njupt.a04threadmethod.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.start();
        mt2.start();

    }
}
