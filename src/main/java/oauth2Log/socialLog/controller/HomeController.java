package oauth2Log.socialLog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Hello, Welcome Main Page!";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Hello, Security Provided!";
    }
}
