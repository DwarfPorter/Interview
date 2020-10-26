package lesson3;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        // Задача №1
        int[] unsorted = {9,3,6,8,4,2,3,9,56,3,2,67,9,4};
        AlghoritmUtils.insertSort(unsorted);
        System.out.println(Arrays.toString(unsorted));

        // Задача №2
        AlghoritmUtils.findFibonachi(20);

    }

}

class AlghoritmUtils {

    static void insertSort(int[] array){
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]){
                    swapElements(array, j, i);
                }
            }
        }
    }

    private static void swapElements(int[] array, int j, int i) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    // без сохранения, только вывод данныхб сложность ~O(n)
    static void findFibonachi(int toNum){
        int prev = 0;
        int curr = 1;
        System.out.println(prev);
        System.out.println(curr);

        int i = 2;
        while (i <= toNum){
            int next = prev + curr;
            System.out.println(next);
            prev = curr;
            curr = next;
            i++;
        }
    }
}
