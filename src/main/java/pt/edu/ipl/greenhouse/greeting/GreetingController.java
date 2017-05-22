package pt.edu.ipl.greenhouse.greeting;

/**
 * Package: pt.edu.ipl.greenhouse.greeting
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 20:41
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


}