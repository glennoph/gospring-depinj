package gospring.boot.gospringdepinj.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("hi from my controller");
        return "hi";
    }

}
