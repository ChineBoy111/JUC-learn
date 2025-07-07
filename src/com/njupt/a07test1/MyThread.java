package com.njupt.a07test1;

public class MyThread extends  Thread{
    static int count = 1000;
    public static Object lock = new Object();
    @Override
    public void run()
    {
        while(true){
            synchronized (lock){
                if(count == 0){
                    break;
                }else{
                    try {
                        Thread.sleep(3000);
                        count--;
                        System.out.println("剩余票数"+count);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
