package com.njupt.a05waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        cook.setName("cook");
        foodie.setName("foodie");
        cook.start();
        foodie.start();
    }
}
