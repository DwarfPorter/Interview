package ru.geekbrain;
import java.util.List;

public class Searcher<T> {
    private List<T> array;

    public Searcher(List<T> array){
        this.array = array;
    }

    public int Find(T a){
        int indexA = -1;
        for(int i = 0; i < array.size(); i++){
            if (array.get(i) == a){
                indexA = i;
            }
        }
        return indexA;
    }

    public int FindOpt(T a){
        for(int i = 0; i < array.size(); i++){
            if (array.get(i) == a){
                return i;
            }
        }
        return -1;
    }
}
