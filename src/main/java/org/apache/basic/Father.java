package org.apache.basic;

public class Father extends AbstractFatherConfig{
    public Father() {
        System.out.println("I am father");
    }

    @Override
    void print() {
        System.out.println("Hi Father");
    }
}
