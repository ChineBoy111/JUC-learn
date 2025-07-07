package com.njupt.a09Pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomDemo {
    public static void main(String[] args) {
        // 1️⃣ 自定义线程池参数
        int corePoolSize = 2;      // 核心线程数：线程池中始终保留的线程数量，即使空闲也不会回收
        int maxPoolSize = 5;       // 最大线程数：线程池允许创建的最大线程数（含核心线程）
        long keepAliveTime = 10;   // 非核心线程空闲存活时间：超过此时间将被销毁
        int queueCapacity = 3;     // 任务队列容量：最多能同时排队的任务数

        // 2️⃣ 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                corePoolSize,                              // 核心线程数
                maxPoolSize,                               // 最大线程数
                keepAliveTime,                             // 非核心线程最大空闲时间
                TimeUnit.SECONDS,                          // 时间单位为“秒”
                new ArrayBlockingQueue<>(queueCapacity),   // 阻塞队列：固定大小为3的任务等待队列
                Executors.defaultThreadFactory(),          // 默认线程工厂：用于创建线程
                new ThreadPoolExecutor.CallerRunsPolicy()  // 拒绝策略：由调用线程执行任务（不会抛异常）
        );

        // 3️⃣ 提交任务（共提交10个任务）
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;  // 每个任务的编号
            pool.execute(() -> {
                // 打印当前线程名称和任务编号
                System.out.println(Thread.currentThread().getName() + " 正在执行任务 " + taskId);
                try {
                    Thread.sleep(2000); // 模拟任务耗时（2秒）
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // 4️⃣ 关闭线程池（执行完已有任务后关闭）
        pool.shutdown();
    }
}
