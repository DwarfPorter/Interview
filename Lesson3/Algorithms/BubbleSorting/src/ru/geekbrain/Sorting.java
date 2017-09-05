package ru.geekbrain;
import java.util.*;
import java.util.function.*;
public class Sorting<T> {
    private List<T> array;
    public Sorting(List<T> array){
        this.array = array;
    }
    public List<T> bubble(BiFunction<T, T, Boolean> compare){
        for(int i=0; i < array.size(); i++){
            for(int j=0; j < array.size()-i-1; j++){
                sortElements(j, j+1, compare);
            }
        }
        return array;
    }
    private void sortElements(int index1, int index2, BiFunction<T, T, Boolean> compare){
        if(compare.apply(array.get(index1), array.get(index2))){
            exchangeElements(index1, index2);
        }
    }
    private void exchangeElements(int index1, int index2){
        T tempElement = array.get(index2);
        array.set(index2, array.get(index1));
        array.set(index1, tempElement);
    }
}
