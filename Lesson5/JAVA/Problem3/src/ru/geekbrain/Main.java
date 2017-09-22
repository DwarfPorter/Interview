package ru.geekbrain;

public class Main {

    static int i = 100;
    static{
        i = i-- - --i;
    }

    {
        i = i++ + ++i;
    }

    public static void main(String[] args) {
        System.out.print(i);
    }
}
