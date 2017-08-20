package ru.geekbrains.converter;

// Реализация интерфейса ConvertTo.
// Перевод в Фаренгейт из Цельсия.
class ConvertToFahrenheit implements ConvertTo {

    @Override
    public float Do(float sourceValue) {
        return (float)(sourceValue*1.8+32); // Вычисление Фаренгейт
    }
}
