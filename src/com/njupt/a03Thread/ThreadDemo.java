package com.njupt.a03Thread;

import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args)
    {
        MyCallable mc = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<Integer>(mc);

        Thread t1 = new Thread(ft);
        t1.start();
        try
        {
            Integer sum = ft.get();
            System.out.println("结果是："+sum);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
