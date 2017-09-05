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
                if(compare.apply(array.get(j), array.get(j+1))){
                }
            }
        }
        return array;
    }
    private void exchangeElements(int j){
        T tempElement = array.get(j);
        array.set(j, array.get(j+1));
        array.set(j+1, tempElement);
    }
}
