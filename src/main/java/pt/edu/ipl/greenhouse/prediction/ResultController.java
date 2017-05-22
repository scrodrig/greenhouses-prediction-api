package pt.edu.ipl.greenhouse.prediction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: pt.edu.ipl.greenhouse.prediction
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 21:45
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */

@RestController
public class ResultController {

    @RequestMapping ("/prediction")
    public Result greeting() {
        return new Result();

    }
}
