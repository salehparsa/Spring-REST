package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serverController {
   @RequestMapping("/server")
   public server Server(@RequestParam(value="PersonalInfo", defaultValue="/PersonalInfo") String PersonalInfo, @RequestParam(value="Skills", defaultValue="/Skills")
   String Skills) {
       return new server(PersonalInfo,Skills);
   }
    @RequestMapping("/PersonalInfo")
    public PersonalInfo personalInfo(@RequestParam(value="name", defaultValue="Saleh") String name, @RequestParam(value="family", defaultValue="Parsa") String family) {
        return new PersonalInfo(name,family,"Application Engineer","Kuala Lumpur / Malaysia","18 November 1987", "salehp@gmail.com");
    }
    @RequestMapping("/Skills")
    public Skills skills() {
        boolean java = true;
        boolean git = true;
        return new Skills(java,git);
    }
}
