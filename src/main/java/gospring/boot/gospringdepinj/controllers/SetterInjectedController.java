package gospring.boot.gospringdepinj.controllers;

import gospring.boot.gospringdepinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Setter Dependency Injection example
 */

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

@Autowired // auto wired is required for DI
@Qualifier("greetingServiceImpl2")
    public void setGreetingService(
            // use qualifier to select service  impl 2
            //@Qualifier("greetingServiceImpl2")
                    GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
