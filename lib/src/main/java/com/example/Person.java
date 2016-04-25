package com.example;

/**
 * Created by kenya on 2016/4/13.
 */
public class Person {
    float weight;
    float height;

    public float proBmi(){
        float bmi = weight/(height*height);
        return  bmi;
    }
}
