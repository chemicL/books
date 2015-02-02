package books.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @RequestMapping("/")
    public String index() {
        return "This is the Books REST Api";
    }
}
