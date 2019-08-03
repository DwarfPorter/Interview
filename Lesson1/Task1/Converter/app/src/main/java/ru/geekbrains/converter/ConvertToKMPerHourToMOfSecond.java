package ru.geekbrains.converter;

public class ConvertToKMPerHourToMOfSecond implements ConvertTo{

	private static final float CONVERSION_RATE = 3.6f;

	@Override
	public float Do(float sourceValue) {
		return sourceValue / CONVERSION_RATE;
	}
}
