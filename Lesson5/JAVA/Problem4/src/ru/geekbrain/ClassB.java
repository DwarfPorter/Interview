package ru.geekbrain;

public class ClassB {
    private ClassA a= new ClassA();

    public void print(){
        System.out.println(String.format("Value is %d", a.getValue()));
    }
}
