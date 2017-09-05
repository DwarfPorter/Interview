package ru.geekbrain;
import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Integer[] array = {9, 6, 5, 3, 4, 8, 1};
        List<Integer> list = Arrays.asList(array);
        Sorting<Integer> sorting = new Sorting<>(list);
        for(Integer element: sorting.bubble((e1, e2) -> e1 > e2)){
            System.out.println(element);
        }
    }
}
