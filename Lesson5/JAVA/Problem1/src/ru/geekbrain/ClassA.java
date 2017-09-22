package ru.geekbrain;

public class ClassA {
    ClassA A = new ClassA();

    public void print(){
        System.out.println(String.format("Hello, Geekbrains! %d", show()));
    }

    private int show(){
        return true ? null : 0;
    }
}
