package blaze98.ssiach2ex1.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(Authentication a) {
        return "Hello! " + a.getName();
    }
}
