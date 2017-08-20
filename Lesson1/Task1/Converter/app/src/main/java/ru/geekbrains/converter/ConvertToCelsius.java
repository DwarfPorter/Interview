package ru.geekbrains.converter;

// Реализация интерфейса ConvertTo.
// Перевод в Цельсии из Фаренгейта.
class ConvertToCelsius implements ConvertTo {
    @Override
    public float Do(float sourceValue) {
        return (float)((sourceValue - 32) / 1.8);   // Вычисление Цельсия
    }
}
