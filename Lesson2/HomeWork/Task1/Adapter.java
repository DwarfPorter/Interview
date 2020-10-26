package task1sensors;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor  {
    ST500Info sensor;

    public Adapter(ST500Info sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.getData().identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensor.getData().temperature();
    }

    @Override
    public Float getHumidity() {
        return 0f;
    }

    @Override
    public Float getPressure() {
        return 0f;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
