package com.njupt.a08test2;

public class MyThread extends  Thread{

    static int count = 3;
    static double a = 10.0;
    @Override
    public void run()
    {
        synchronized (MyThread.class){
                if(count == 0){
                    System.out.println(getName()+"没抢到");

                }else{
                    count--;
                    System.out.println(getName() + "抢到了"+a+"元");
                }
            }
        }

}
