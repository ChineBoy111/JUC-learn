package com.njupt.b01Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionDemo04 {
    public static void main(String[] args) throws Exception
    {
        Class aClass = Class.forName("com.njupt.b01Reflection.Person");

        Method[] method = aClass.getMethods();
        for (Method m : method) {
            System.out.println(m);
        }
        System.out.println("------------------------------------------------");
        Method[] method1 = aClass.getDeclaredMethods();
        for (Method m : method1) {
            System.out.println(m);
        }
        Method eat = aClass.getMethod("eat", String.class);
        System.out.println( eat);
        //获取方法的修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);
        //获取方法的名字
        String name = eat.getName();
        System.out.println(name);
        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter p : parameters) {
            System.out.println(p);
        }
        //获取方法的异常
        Class[] exceptionTypes = eat.getExceptionTypes();
        for (Class c : exceptionTypes) {
            System.out.println(c);
        }
        //方法运行
        Person person = new Person();
        eat.invoke(person, "fish");
        //获取方法的返回值




    }
}
