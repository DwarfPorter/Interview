import java.time.*;

class ST500Info implements MeteoSensor{
	public SensorTemperature getData(){
		return new SensorTemperature(){
				public int identifier(){
					return 1;
				}
				public double temperature(){
					return 22.0;
				}
				public int year(){
					return LocalDateTime.now().getYear();
				}
				public int day(){
					return LocalDateTime.now().getDayOfYear();
				}
				public int second(){
					LocalDateTime now = LocalDateTime.now();
					return now.getHour()*3600 + now.getMinute()*60 + now.getSecond();
				}
		};
	}

	@Override
	public int getId() {
		return getData().identifier();
	}

	@Override
	public Float getTemperature() {
		double temperature = getData().temperature();
		return (float) temperature;
	}

	@Override
	public Float getHumidity() {
		return null;
	}

	@Override
	public Float getPressure() {
		return null;
	}

	@Override
	public LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}
}