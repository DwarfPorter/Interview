package ru.geekbrains.converter;

// Реализация интерфейса ConvertTo.
// Перевод в Мили из КМ.
class ConvertToMile implements ConvertTo {
    @Override
    public float Do(float sourceValue){
        return (float)(sourceValue * 0.62137); // Вычисление миль
    }
}
