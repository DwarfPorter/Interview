package ru.geekbrains.converter;

/**
 * Created by vmoro on 18.08.2017.
 */

public class Converter {
    private float _sourceValue;
    private float _destValue;

    public Converter(float sourceValue){
        _sourceValue = sourceValue;
    }

    public Converter Convert(Convert convert){
        _destValue = convert.Do(_sourceValue);
        return  this;
    }

    public float GetResult(){
        return _destValue;
    }
}
