public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoDB;
		
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);

		meteoDb.save(new MeteoSensorAdapter(new ST500Info.getData()));
		
		// Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
	}
}