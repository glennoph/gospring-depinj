package gospring.boot.gospringdepinj.controllers;

import gospring.boot.gospringdepinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CtorInjectedController {
    private GreetingService greetingService;

    @Autowired // nb this is optional for ctor injected
    public CtorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
