package com.entity;

public class Person2 {
    private String name;
    private StringBuilder address;
    private int age;

    public Person2(String name,StringBuilder address,int age){
        this.name = name;
        this.address = new StringBuilder(address);
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public StringBuilder getAddress(){
        return address;
    }
    public void setAddress(){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String toString(){
        return "Person2{ name = "+name+",address = "+address+"age = "+age+"}";
    }
}
