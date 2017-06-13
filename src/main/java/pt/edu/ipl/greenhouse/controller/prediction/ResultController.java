/**
 * Package: pt.edu.ipl.greenhouse.controller.prediction
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 21:45
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
package pt.edu.ipl.greenhouse.controller.prediction;

import org.springframework.web.bind.annotation.*;
import pt.edu.ipl.greenhouse.containers.Measurement;
import pt.edu.ipl.greenhouse.containers.MeasurementAll;
import pt.edu.ipl.greenhouse.controller.instances.SmoregInstance;
import pt.edu.ipl.greenhouse.enums.ModelType;
import pt.edu.ipl.greenhouse.model.SMOregModel;

@CrossOrigin
@RestController
@RequestMapping ("/prediction")
public class ResultController {

    public ResultController () throws Exception {
    }

    @RequestMapping (value = "/empty", method = RequestMethod.POST)
    public MeasurementAll empty() {
        return new MeasurementAll();
    }

    @RequestMapping (value = "/temperature", method = RequestMethod.POST)
    public Measurement temperature(@RequestBody double [] instances) throws Exception {
        SMOregModel smOregModel = new SMOregModel(ModelType.TEMPERATURE);
        SmoregInstance sm = new SmoregInstance(instances);
        return new Measurement(smOregModel.getSmoreg().classifyInstance(sm.getInstance()));
    }

    @RequestMapping (value = "/luminosity", method = RequestMethod.POST)
    public Measurement luminosity(@RequestBody double [] instances) throws Exception {
        SMOregModel smOregModel = new SMOregModel(ModelType.LUMINOSITY);
        SmoregInstance sm = new SmoregInstance(instances);
        return new Measurement(smOregModel.getSmoreg().classifyInstance(sm.getInstance()));
    }

    @RequestMapping (value = "/sm", method = RequestMethod.POST)
    public Measurement soilMoisture(@RequestBody double [] instances) throws Exception {
        SMOregModel smOregModel = new SMOregModel(ModelType.SOIL_MOISTURE);
        SmoregInstance sm = new SmoregInstance(instances);
        return new Measurement(smOregModel.getSmoreg().classifyInstance(sm.getInstance()));
    }

    @RequestMapping (value = "/eh", method = RequestMethod.POST)
    public Measurement environmentHumidity(@RequestBody double [] instances) throws Exception {
        SMOregModel smOregModel = new SMOregModel(ModelType.ENVIRONMENT_HUMIDITY);
        SmoregInstance sm = new SmoregInstance(instances);
        return new Measurement(smOregModel.getSmoreg().classifyInstance(sm.getInstance()));
    }

    @RequestMapping (value = "/all", method = RequestMethod.POST)
    public MeasurementAll all(@RequestBody double [] temperatures,
                              @RequestBody double [] luminosities,
                              @RequestBody double [] soilMoistures,
                              @RequestBody double [] envHumidity) throws Exception {
        Measurement temperature = temperature(temperatures);
        Measurement luminosity = luminosity(luminosities);
        Measurement soilMoisture = soilMoisture(soilMoistures);
        Measurement environmentHumidity = environmentHumidity(envHumidity);
        return new MeasurementAll(temperature, environmentHumidity, soilMoisture, luminosity);
    }

}
