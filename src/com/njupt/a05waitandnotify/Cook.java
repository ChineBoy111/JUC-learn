package com.njupt.a05waitandnotify;

public class Cook extends  Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //如果食物已经不能再做了
                if(Desk.count == 0){
                    break;
                }else{
                    //如果桌子上有食物 等待
                    if(Desk.foodFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        //如果桌子上没有食物 则开始放食物
                        System.out.println("厨师正在放个食物");
                        //修改桌子的状态
                        Desk.foodFlag = 1;
                        //唤醒吃货
                        Desk.lock.notifyAll();
                    }
                }

            }
        }
    }
}
