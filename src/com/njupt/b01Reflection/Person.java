package com.njupt.b01Reflection;

public class Person {
    public String name ;
    private int age;
    public  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {

    }
    public Person(String name){

    }
    protected Person( int age){

    }
    private Person(String name, int age){

    }
    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void sayHello() {
        System.out.println("Hello, I’m " + name);
    }
    public void eat(String food){
        System.out.println( " eat " + food);
    }
}