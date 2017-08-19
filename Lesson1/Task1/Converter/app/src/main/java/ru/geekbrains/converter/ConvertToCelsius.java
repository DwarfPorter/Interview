package ru.geekbrains.converter;

/**
 * Created by vmoro on 19.08.2017.
 */

public class ConvertToCelsius implements Convert {
    @Override
    public float Do(float sourceValue) {
        return (float)((sourceValue - 32) / 1.8);
    }
}
