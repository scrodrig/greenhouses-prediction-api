package pt.edu.ipl.greenhouse.controller.instances;

import weka.core.DenseInstance;
import weka.core.Instance;

/**
 * Package: pt.edu.ipl.greenhouse.controller.prediction
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 6/11/17 at 16:03
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public class SmoregInstance {
    private Instance instance = new DenseInstance(11);

    public SmoregInstance (double[] instances) {
        for (int i = 0; i < instances.length  ; i++){
            instance.setValue(i, instances[i]);
        }

    }

    public Instance getInstance () {
        return instance;
    }

    public void setInstance (Instance instance) {
        this.instance = instance;
    }
}
