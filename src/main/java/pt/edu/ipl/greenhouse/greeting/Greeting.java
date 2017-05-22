package pt.edu.ipl.greenhouse.greeting;

/**
 * Package: pt.edu.ipl.greenhouse.greeting
 * For the project Prediction
 * Created by SchubertDavidRodriguez on 5/21/17 at 20:55
 *
 * @author SchubertDavidRodriguez
 * @version 1.0
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
