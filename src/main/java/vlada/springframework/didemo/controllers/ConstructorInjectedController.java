package vlada.springframework.didemo.controllers;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vlada.springframework.didemo.services.GreetingService;
import vlada.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) { this.greetingService = greetingService; }


    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
