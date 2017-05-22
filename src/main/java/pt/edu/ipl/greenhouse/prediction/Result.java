package pt.edu.ipl.greenhouse.prediction;

/**
 * Package: pt.edu.ipl.greenhouse.prediction
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 21:39
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public class Result {

    private float temperatura;
    private float environmentHumidity;
    private float soilMoisture;
    private float luminosity;
    private int hourDay;

    public Result () {

    }

    public Result (float temperatura, float environmentHumidity, float soilMoisture, float luminosity, int hourDay) {
        this.temperatura = temperatura;
        this.environmentHumidity = environmentHumidity;
        this.soilMoisture = soilMoisture;
        this.luminosity = luminosity;
        this.hourDay = hourDay;
    }

    public float getTemperatura () {
        return temperatura;
    }

    public void setTemperatura (float temperatura) {
        this.temperatura = temperatura;
    }

    public float getEnvironmentHumidity () {
        return environmentHumidity;
    }

    public void setEnvironmentHumidity (float environmentHumidity) {
        this.environmentHumidity = environmentHumidity;
    }

    public float getSoilMoisture () {
        return soilMoisture;
    }

    public void setSoilMoisture (float soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public float getLuminosity () {
        return luminosity;
    }

    public void setLuminosity (float luminosity) {
        this.luminosity = luminosity;
    }

    public int getHourDay () {
        return hourDay;
    }

    public void setHourDay (int hourDay) {
        this.hourDay = hourDay;
    }


    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result input = (Result) o;

        if (Float.compare(input.temperatura, temperatura) != 0) return false;
        if (Float.compare(input.environmentHumidity, environmentHumidity) != 0) return false;
        if (Float.compare(input.soilMoisture, soilMoisture) != 0) return false;
        if (Float.compare(input.luminosity, luminosity) != 0) return false;
        return hourDay == input.hourDay;

    }

    @Override
    public int hashCode () {
        int result = (temperatura != + 0.0f ? Float.floatToIntBits(temperatura) : 0);
        result = 31 * result + (environmentHumidity != + 0.0f ? Float.floatToIntBits(environmentHumidity) : 0);
        result = 31 * result + (soilMoisture != + 0.0f ? Float.floatToIntBits(soilMoisture) : 0);
        result = 31 * result + (luminosity != + 0.0f ? Float.floatToIntBits(luminosity) : 0);
        result = 31 * result + hourDay;
        return result;
    }
}
