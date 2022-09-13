package coms309;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to your document repository take a look around";
    }
}
