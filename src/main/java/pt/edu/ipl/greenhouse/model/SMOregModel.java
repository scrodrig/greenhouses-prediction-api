/**
 * Package: pt.edu.ipl.greenhouse.model
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 6/11/17 at 12:34
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
package pt.edu.ipl.greenhouse.model;
import org.apache.commons.io.IOUtils;
import pt.edu.ipl.greenhouse.enums.ModelType;
import weka.classifiers.functions.SMOreg;
import weka.core.SerializationHelper;
import java.io.InputStream;

public class SMOregModel {

    private InputStream inputStream;
    private SMOreg smoreg;

    public SMOregModel (ModelType model) throws Exception {
        inputStream = IOUtils.toBufferedInputStream(this.getClass().getClassLoader().getResourceAsStream(model.toString()));
        smoreg = (SMOreg) SerializationHelper.read(inputStream);
    }

    public SMOreg getSmoreg () {
        return smoreg;
    }

}
