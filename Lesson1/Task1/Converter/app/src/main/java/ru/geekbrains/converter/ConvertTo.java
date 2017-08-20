package ru.geekbrains.converter;

// Интерфейс преобразования значений
// Чтобы сделать новый перевод, достаточно реализовать этот интерфейс
interface ConvertTo {
    float Do(float sourceValue);    // Преобразовать
}
