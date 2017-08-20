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

    @Test
    public void Converter_Convert_UnitTest() throws Exception{
        ConvertTo convertTo = mock(ConvertTo.class);
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        converter.Convert(convertTo);
        verify(convertTo).Do(22);
    }

    @Test
    public void Converter_GetResult_UnitTest() throws Exception{
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        float actual = converter.GetResult();
        assertThat(actual, is(0f));
    }

    @Test
    public void Converter_IntegrationTest() throws Exception{
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        float actual = converter.Convert(new ConvertTo() {
            @Override
            public float Do(float sourceValue) {
                return 33;
            }
        }).GetResult();
        assertThat(actual, is(33f));
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
