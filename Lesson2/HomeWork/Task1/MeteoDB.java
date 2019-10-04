class MeteoDB implements MeteoStore{
	// сохранение данных в базу
	boolean save(MeteoSensor meteoSensor){
		System.out.format("Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r", meteoSensor.getId(), meteoSensor.getDateTime(), meteoSensor.getTemperature(), meteoSensor.getHumidity(), meteoSensor.getPressure());
		return true;
	}
}