﻿public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoStore();
		
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);

		MeteoSensor st500 = new ST500Info();
		meteoDb.save(st500);
		
	}
}