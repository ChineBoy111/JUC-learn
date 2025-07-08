package com.njupt.b01Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class ReflectionDemo03 {
    public static void main(String[] args) throws Exception
    {
        Class aClass = Class.forName("com.njupt.b01Reflection.Person");
        Constructor[] constructor1 = aClass.getConstructors();
        for (Constructor constructor : constructor1) {
            System.out.println( constructor);
        }
        System.out.println("-------------------------");
        Constructor[] constructor2 = aClass.getDeclaredConstructors();
        for (Constructor constructor : constructor2) {
            System.out.println( constructor);
        }
        System.out.println("-------------------------");
        Constructor constructor3 = aClass.getConstructor(String.class);
        int modifiers = constructor3.getModifiers();
        System.out.println(modifiers);
        System.out.println(constructor3);
        System.out.println("-------------------------");
        Constructor constructor4 = aClass.getDeclaredConstructor(String.class,int.class);
        constructor4.setAccessible(true);
        Person per = (Person) constructor4.newInstance("张三", 18);
        System.out.println(per);
        System.out.println("-------------------------");

        Field[] fields1 = aClass.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("-------------------------");
        Field[] fields2 = aClass.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
        System.out.println("-------------------------");
        Field field3 = aClass.getDeclaredField("sex");
        System.out.println(field3);
        System.out.println("-------------------------");
        //获取成员变量的名字,数据类型
        System.out.println(field3.getName());
        System.out.println(field3.getType());

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true); //如果为public 可省略
        Person p1 = new Person("蔡徐坤", 18, "男");
        String value = (String)name.get(p1);
        System.out.println( value);
        name.set(p1, "王俊凯");
        System.out.println(p1.getName());



    }
}
