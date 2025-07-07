package com.njupt.a04threadmethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends  Thread{
    // static表示这个类的所有对象  都共享这个ticket数据
    static int ticket = 0;
    // 锁对象， 一定要是唯一的
    static Object obj = new Object();

//    @Override
//    public void run()
//    {
//        while (true)
//        {
//            synchronized (obj)
//            {
//                if (ticket < 100)
//                {
//                    ticket++;
//                    System.out.println(getName() + "正在卖第" + ticket + "张票");
//                }
//                else
//                {
//                    break;
//                }
//            }
//
//        }
//    }

    static Lock lock = new ReentrantLock();
    @Override
    public void run(){
        while (true){
            lock.lock();
            try {
                if (ticket < 100){
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
                else{
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
