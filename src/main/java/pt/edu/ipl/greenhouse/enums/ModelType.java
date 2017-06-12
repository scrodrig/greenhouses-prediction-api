package pt.edu.ipl.greenhouse.enums;

/**
 * Package: pt.edu.ipl.greenhouse.enums
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 6/11/17 at 20:03
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public enum ModelType {
    TEMPERATURE ("model/smoreg-weka-temp.model"),
    LUMINOSITY ("model/smoreg-weka-lum.model"),
    SOIL_MOISTURE ("model/smoreg-weka-sm.model"),
    ENVIRONMENT_HUMIDITY ("model/smoreg-weka-eh.model");

    private final String name;

    private ModelType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
