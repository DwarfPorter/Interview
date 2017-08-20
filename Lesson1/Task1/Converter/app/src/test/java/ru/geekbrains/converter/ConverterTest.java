package ru.geekbrains.converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by vmoro on 18.08.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ConverterTest {

    @Test
    public void ConvertTest() throws Exception{
        ConvertTo convertTo = mock(ConvertTo.class);
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        converter.Convert(convertTo);
        verify(convertTo).Do(22);
    }

    @Test
    public void GetResultTest() throws Exception{
        ConvertTo convertTo = mock(ConvertTo.class);
        float sourceValue = 22;
        Converter converter = new Converter(sourceValue);
        float actual = converter.GetResult();
        assertThat(actual, is(0f));
    }

    @Test
    public void IntegrationTest() throws Exception{
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
}
