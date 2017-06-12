package pt.edu.ipl.greenhouse.containers;

/**
 * Package: pt.edu.ipl.greenhouse.containers
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 6/11/17 at 22:43
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public class Measurement {
    private double value;

    public Measurement (double value) {
        this.value = value;
    }

    public double getValue () {
        return value;
    }

    public void setValue (double value) {
        this.value = value;
    }
}
