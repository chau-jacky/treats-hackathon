package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RestfulController {
    
    @RequestMapping("/rest")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
