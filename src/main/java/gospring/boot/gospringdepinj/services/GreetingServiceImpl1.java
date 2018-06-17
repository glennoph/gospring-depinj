package gospring.boot.gospringdepinj.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl1 implements  GreetingService {
   static public final String  HI = "hi from greeting service impl - 1";

    @Override
    public String sayGreeting() {
        return  HI;
    }
}
