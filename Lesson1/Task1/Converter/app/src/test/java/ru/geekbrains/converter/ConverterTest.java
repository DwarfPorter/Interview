package ru.geekbrains.converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ConverterTest {

    // Тестируем Converter.convert
    @Test
    public void Converter_Convert_UnitTest() throws Exception{

        // Создаем мок-объект по интерфейсу ConvertTo
        ConvertTo convertTo = mock(ConvertTo.class);
        float sourceValue = 22; // Это исходное значение
        Converter converter = new Converter(sourceValue);

        // Подставляем мок-объект в качестве реализации в метод конвертера
        converter.convert(convertTo);

        // Нам интересно то, что метод Do интерфейса ConvertTo был вызван.
        verify(convertTo).Do(22);
    }

    // Тестируем Converter.GetResult
    @Test
    public void Converter_GetResult_UnitTest() throws Exception{
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        float actual = converter.GetResult();   // Получить результат, неважно что вычислили

        // assertThat использует матчеры, is это матчер
        assertThat(actual, is(0f)); // тип float по умолчанию имеет значенрие 0
    }

    // Интеграционный тест, проверяем взаимодействие объекта Converter и ConvertToFahrenheit
    @Test
    public void Converter_IntegrationTest() throws Exception{
        float sourceValue = -15;
        Converter converter = new Converter(sourceValue);
        // Вместо мок-объекта используем реальный объект
        float actual = converter.convert(new ConvertToFahrenheit()).GetResult();
        assertThat(actual, is(5f));
    }

    @Test
    public void ConvertToCelsius_Do_UnitTest() throws Exception{
        ConvertTo convertTo = new ConvertToCelsius();
        float actual = convertTo.Do(5);
        assertThat(actual, is(-15f));
    }

    @Test
    public void ConvertToFahrenheit_Do_UnitTest() throws Exception{
        ConvertTo convertTo = new ConvertToFahrenheit();
        float actual = convertTo.Do(-15);
        assertThat(actual, is(5f));
    }

    @Test
    public void ConvertToMile_Do_UnitTest() throws Exception{
        ConvertTo convertTo = new ConvertToMile();
        float actual = convertTo.Do(2);
        assertThat(actual, is(1.24274f));
    }

}
