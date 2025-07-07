package com.njupt.a05waitandnotify;

public class Desk {
    //是否有食物在桌子上  0 没有 1 有
    public static int foodFlag = 0;
    //总个数
    public static int count = 10;
    //锁对象
    public static Object lock = new Object();
}
