package com.njupt.a06waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends  Thread{
    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue)
    {
        this.queue = queue;
    }
    @Override
    public void run()
    {
        while (true)
        {
            try{
                queue.put("cook");
                System.out.println("cook done!");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
