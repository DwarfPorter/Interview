package ru.geekbrain;
public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(1);
        vectorList.add(4);
        vectorList.add(6);
        vectorList.add(4);
        System.out.println(vectorList.get(0));
        System.out.println(vectorList.get(1));
        System.out.println(vectorList.get(2));
        System.out.println(vectorList.get(3));
        System.out.println(vectorList.getLast(0));
        System.out.println(vectorList.getLast(1));
        System.out.println(vectorList.getLast(2));
        System.out.println(vectorList.getLast(3));
        System.out.println(vectorList.getBack(0));
        System.out.println(vectorList.getBack(1));
        System.out.println(vectorList.getBack(2));
        System.out.println(vectorList.getBack(3));
    }
}
