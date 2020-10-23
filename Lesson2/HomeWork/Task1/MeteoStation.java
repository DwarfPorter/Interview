package task1sensors;

public class MeteoStation {
    public static void main(String[] args){
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        ST500Info st500_2 = new ST500Info();

        Adapter adapter = new Adapter(st500_2);

        meteoDb.save(ms200_1);
        meteoDb.save(adapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}
