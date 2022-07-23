package com.tom;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.height = 1.8f;
        p.weight = 87.87f;
        System.out.println(p.bmi());
    }
}
