package ru.geekbrains.converter;

// Реализация интерфейса ConvertTo.
// Перевод км/ч в м/c.
public class ConvertToMetersPerSecond implements ConvertTo {
    @Override
    public float Do(float sourceValue) {
        return sourceValue * 1000f / 3600f;
    }
}
