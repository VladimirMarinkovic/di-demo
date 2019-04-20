package vlada.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.printf("Zdravo \n");
        return "foo";
    }

}
