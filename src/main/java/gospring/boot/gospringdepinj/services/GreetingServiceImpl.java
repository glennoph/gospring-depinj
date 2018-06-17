package gospring.boot.gospringdepinj.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements  GreetingService {
   static public final String  HI = "hi from greeting service impl";

    @Override
    public String sayGreeting() {
        return  HI;
    }
}
