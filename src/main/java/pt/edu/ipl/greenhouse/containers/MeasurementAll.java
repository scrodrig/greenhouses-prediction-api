package pt.edu.ipl.greenhouse.containers;

import pt.edu.ipl.greenhouse.containers.Measurement;

/**
 * Package: pt.edu.ipl.greenhouse.controller.prediction
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 21:39
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public class MeasurementAll {

    private Measurement temperature;
    private Measurement environmentHumidity;
    private Measurement soilMoisture;
    private Measurement luminosity;

    public MeasurementAll () {

    }

    public MeasurementAll (Measurement temperature, Measurement environmentHumidity, Measurement soilMoisture, Measurement luminosity) {
        this.temperature = temperature;
        this.environmentHumidity = environmentHumidity;
        this.soilMoisture = soilMoisture;
        this.luminosity = luminosity;
    }

    public Measurement getTemperature () {
        return temperature;
    }

    public void setTemperature (Measurement temperature) {
        this.temperature = temperature;
    }

    public Measurement getEnvironmentHumidity () {
        return environmentHumidity;
    }

    public void setEnvironmentHumidity (Measurement environmentHumidity) {
        this.environmentHumidity = environmentHumidity;
    }

    public Measurement getSoilMoisture () {
        return soilMoisture;
    }

    public void setSoilMoisture (Measurement soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Measurement getLuminosity () {
        return luminosity;
    }

    public void setLuminosity (Measurement luminosity) {
        this.luminosity = luminosity;
    }
}
