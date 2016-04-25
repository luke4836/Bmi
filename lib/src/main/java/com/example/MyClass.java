package com.example;

public class MyClass {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        float w  = 70.5f;
//        float h = 1.7f;
//        float bmi = w/(h*h);
//        System.out.println(bmi);

        Person p = new Person();
        p.weight = 70.5f;
        p.height = 1.7f;
        System.out.println(p.proBmi());
    }


}
