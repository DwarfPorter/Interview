package algorithms;

import algorithms.fibonacci.FibonacciSequence;
import algorithms.sort.Sort;

public class main {
    public static void main(String[] args) {
        System.out.println("Сортировка методом вставки:");
        checkSortAlgorithm();

        System.out.println("Последовательность фибоначи:");
        checkFibonacciSequenceAlgorithm();

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
