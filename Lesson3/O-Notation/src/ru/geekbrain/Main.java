package ru.geekbrain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(9);
        array.add(8);
        array.add(77);
        array.add(6);
        array.add(54);
        array.add(40);

        Searcher<Integer> searcher = new Searcher<>(array);
        int index6 = searcher.Find(6);
        System.out.println(index6);
        int index54 = searcher.FindOpt(54);
        System.out.println(index54);
    }
}
