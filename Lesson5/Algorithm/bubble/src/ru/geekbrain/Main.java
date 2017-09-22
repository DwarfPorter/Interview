package ru.geekbrain;

import java.util.Arrays;

public class Main {

    public static void sortBubble(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
	    int[] array = {2,5,3,1,6,3};
        sortBubble(array);
        Arrays.stream(array).forEach(a -> System.out.print(a));
    }
}
