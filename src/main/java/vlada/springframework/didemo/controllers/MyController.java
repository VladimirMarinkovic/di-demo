package vlada.springframework.didemo.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import vlada.springframework.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }



    public String hello() {
        System.out.printf("Zdravo \n");
        return greetingService.sayGreeting();
    }

}
