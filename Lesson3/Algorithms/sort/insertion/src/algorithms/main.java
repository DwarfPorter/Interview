package algorithms;

import algorithms.fibonacci.FibonacciSequence;
import algorithms.mylinkedlist.twowaylinkedlist.MyTwoWayLinkedList;
import algorithms.mylinkedlist.twowaylinkedlist.MyTwoWayLinkedListImpl;
import algorithms.sort.Sort;

public class main {
    public static void main(String[] args) {
        System.out.println("Сортировка методом вставки:");
        checkSortAlgorithm();

        System.out.println("Последовательность фибоначи:");
        checkFibonacciSequenceAlgorithm();

        TwoSideMyLinkedListImplTest();

    }

    private static void TwoSideMyLinkedListImplTest() {
        MyTwoWayLinkedList<Integer> myLinkedList = new MyTwoWayLinkedListImpl<>();

        myLinkedList.insertFirst(18);
        myLinkedList.insertFirst(457);
        myLinkedList.insertFirst(12);
        myLinkedList.insertFirst(54);
        myLinkedList.insertLast(6);

        myLinkedList.insertLast(584);

        myLinkedList.display();

        System.out.println("Contains 18: " + myLinkedList.contains(18));
        System.out.println("Contains 7: " + myLinkedList.contains(7));
        System.out.println("Contains 457: " + myLinkedList.contains(457));
        System.out.println("Contains 24: " + myLinkedList.contains(24));
        System.out.println("Contains 584: " + myLinkedList.contains(584));

        myLinkedList.display();

        myLinkedList.removeFirst();
        myLinkedList.remove(6);

        myLinkedList.display();
    }

    private static void checkFibonacciSequenceAlgorithm() {
        FibonacciSequence fibonacci = new FibonacciSequence();
        printArray(fibonacci.calculatingFibonacciNumbers(20));
    }

    private static void checkSortAlgorithm() {
        int[] array = new int[10];
        Sort sort = new Sort();
        fillArray(array);
        printArray(array);

        sort.insertionSort(array);
        printArray(array);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
