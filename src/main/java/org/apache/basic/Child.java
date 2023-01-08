package org.apache.basic;

public class Child extends Father{
    public Child() {
        System.out.println("I am child");
    }

    @Override
    void print() {
        System.out.println("Hi child");
    }
}
