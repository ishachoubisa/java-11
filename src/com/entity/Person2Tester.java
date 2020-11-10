package com.entity;

public class Person2Tester {
    public static void main(String[] args) {
        StringBuilder address = new StringBuilder("2234 Maple Ave, Ralphtown, PA, 19000");
        int age = 45;
        String name = "Ralph";

        Person2 p = new Person2(name, address, age);

        address.append("-0005");
        name = "Ralph's Wife";
        age = 40;

        Person2 p2 = new Person2(name, address, age);
        System.out.println(p);
        System.out.println(p2);
    }
}
