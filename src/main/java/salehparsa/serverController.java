package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serverController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/server")
    public server server(@RequestParam(value="name", defaultValue="World") String name) {
        return new server(counter.incrementAndGet(),
                String.format(template, name));
    }
}
