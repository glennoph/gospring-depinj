package gospring.boot.gospringdepinj.controllers;

import gospring.boot.gospringdepinj.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
