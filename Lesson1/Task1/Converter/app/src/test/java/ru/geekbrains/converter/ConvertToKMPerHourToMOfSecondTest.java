package ru.geekbrains.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ConvertToKMPerHourToMOfSecondTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList (new Object[][]{
			{1.0f, 0.27f},
			{2.0f, 0.55f},
			{5.0f, 1.38f},
			{10.0f, 2.77f},
			{50.0f, 13.88f},
			{72.0f, 20.0f},
			{83.0f, 23.05f},
			{910.0f, 252.77f},
		});
	}

	private static final float DELTA = 0.01f;
	private float in;
	private float out;

	public ConvertToKMPerHourToMOfSecondTest(float in, float out){
		this.in = in;
		this.out = out;
	}

	@Test
	public void ConvertToKMPerHourToMOfSecond_IntegrationTest() {
		Converter converter = new Converter(in);
		float actual = converter.convert(new ConvertToKMPerHourToMOfSecond()).GetResult();
		Assert.assertEquals(out, actual, DELTA);
	}

	@Test
	public void ConvertToKMPerHourToMOfSecond_Do_UnitTest(){
		ConvertTo convertTo = new ConvertToKMPerHourToMOfSecond();
		Assert.assertEquals(out, convertTo.Do(in), DELTA);
	}
}
