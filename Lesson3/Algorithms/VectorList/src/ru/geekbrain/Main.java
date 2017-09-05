package ru.geekbrain;
public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(1);
        vectorList.add(4);
        vectorList.add(6);
        vectorList.add(4);
        for(Integer item : vectorList){
            System.out.println(item);
        }
    }
}
