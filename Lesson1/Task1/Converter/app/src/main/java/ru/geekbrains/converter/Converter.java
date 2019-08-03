package ru.geekbrains.converter;

// Класс Converter отвечает за различные преобразования
// и является связующим звеном между Activity и самими преобразованиями.
// Таким образом, чтобы сделать какое-либо новое преобразование, достаточно
// реализовать интерфейс ConvertTo.
class Converter {
    private float _sourceValue; // Значение, которое надо сконвертировать
    private float _destValue;   // Сконвертированное значение

    // Конструктор, в качестве параметра передаем исходное значение
    Converter(float sourceValue){
        _sourceValue = sourceValue;
    }

    // Метод конвертирует значения
    // ConvertTo - конвертирующий значения интерфейс
    Converter convert(ConvertTo convertTo){
        // Передаем в интерфейс исходное значение, получаем сконвертированное
        _destValue = convertTo.Do(_sourceValue);

        // Здесь класс возвращает сам себя, для удобства работы.
        return  this;
    }

    // Метод возвращает результат
    float GetResult(){
        return _destValue;
    }
}
