package ru.geekbrain;

public class Main {
    public static void main(String[] args) {
	    for(int i=1; i<=100; i++){
            printNumber(i);
        }
    }

    private static void printNumber(int number){
        if (!printFizzBuzz(number)){
            System.out.print(number);
        }
        System.out.println();
    }

    private static boolean printFizzBuzz(int number){
        return printFizz(number) | printBuzz(number);
    }

    private static boolean printFizz(int number){
        if (number%3 != 0) return false;
        System.out.print("Fizz");
        return true;
    }

    private static boolean printBuzz(int number){
        if (number%5 != 0) return false;
        System.out.print("Buzz");
        return true;
    }
}
