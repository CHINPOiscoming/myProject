package com.tom;

public class Person {
    String name;
    float weight;
    float height;
    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }
}
