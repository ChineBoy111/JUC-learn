package com.njupt.b01Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo01 {


    public static void main(String[] args) throws Exception {
        // 1. 获取类对象
        Class<?> clazz = Class.forName("com.njupt.b01Reflection.Person");

        // 2. 创建对象
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 3. 调用方法
        Method method = clazz.getMethod("sayHello");
        method.invoke(obj);  // 输出：Hello, I’m Alice

        // 4. 访问私有字段
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);  // 取消私有访问限制
        field.set(obj, "Bob");

        method.invoke(obj);  // 输出：Hello, I’m Bob
    }
}
