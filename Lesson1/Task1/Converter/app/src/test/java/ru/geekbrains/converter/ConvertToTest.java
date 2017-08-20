package ru.geekbrains.converter;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConvertToTest {

    @Test
    public void ToCelsiusDoTest() throws Exception{
        ConvertTo convertTo = new ConvertToCelsius();
        float actual = convertTo.Do(5);
        assertThat(actual, is(-15f));
    }

    @Test
    public void ToFahrenheitDoTest() throws Exception{
        ConvertTo convertTo = new ConvertToFahrenheit();
        float actual = convertTo.Do(-15);
        assertThat(actual, is(5f));
    }

    @Test
    public void ToMileDoTest() throws Exception{
        ConvertTo convertTo = new ConvertToMile();
        float actual = convertTo.Do(2);
        assertThat(actual, is(1.24274f));
    }

}
