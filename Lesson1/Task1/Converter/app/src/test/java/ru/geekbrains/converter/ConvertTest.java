package ru.geekbrains.converter;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by vmoro on 19.08.2017.
 */
public class ConvertTest {

    @Test
    public void ToCelsiumDoTest() throws Exception{
        Convert convert = new ConvertToCelsius();
        float actual = convert.Do(5);
        assertThat(actual, is(-15f));
    }

    @Test
    public void ToFhrenheitDoTest() throws Exception{
        Convert convert = new ConvertToFahrenheit();
        float actual = convert.Do(-15);
        assertThat(actual, is(5f));
    }

    @Test
    public void ToMileDoTest() throws Exception{
        Convert convert = new ConvertToMile();
        float actual = convert.Do(2);
        assertThat(actual, is(1.24274f));
    }

}
