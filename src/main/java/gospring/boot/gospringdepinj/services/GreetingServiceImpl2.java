package gospring.boot.gospringdepinj.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl2 implements  GreetingService {
   static public final String  HI = "hi from greeting service impl - 2";

    @Override
    public String sayGreeting() {
        return  HI;
    }
}
