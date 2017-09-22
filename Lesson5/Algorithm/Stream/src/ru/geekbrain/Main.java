package ru.geekbrain;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,3,2,4,5,6,7};
        Arrays.stream(array).filter(a -> a % 2 ==0).forEach(a -> System.out.print(a));
    }
}
