package com.njupt.a05waitandnotify;

public class Foodie extends Thread{
    @Override
    public void run()
    {
        while (true){
            synchronized (Desk.lock)
            {
                //如果食物数目已经为0
                if(Desk.count == 0){
                    break;
                }
                //如果桌子上没有食物
                if(Desk.foodFlag == 0){
                    try{
                        Desk.lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else{
                    //如果有食物 食物数--
                    Desk.count--;
                    System.out.println("吃货正在吃第"+Desk.count+"个食物");
                    //修改桌子状态
                    Desk.foodFlag = 0;
                    //吃完唤醒厨师，让厨师继续往桌子上放食物
                    Desk.lock.notifyAll();
                }
            }
        }
    }

}
