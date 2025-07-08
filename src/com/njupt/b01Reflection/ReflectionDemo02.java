package com.njupt.b01Reflection;

public class ReflectionDemo02 {
    public static void main(String[] args) throws Exception{
        // 1. 第一种方式
        Class clazz1 = Class.forName("com.njupt.b01Reflection.Person");
        // 2.第二种方式
        Class clazz2 = Person.class;
        // 3.第三种方式
        Person person = new Person();
        Class clazz3 = person.getClass();
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    }
}
