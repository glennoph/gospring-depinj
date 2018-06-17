package gospring.boot.gospringdepinj.controllers;

import gospring.boot.gospringdepinj.services.GreetingService;
import gospring.boot.gospringdepinj.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;


    @Before
    public void setUp() throws Exception {
        setterInjectedController = new SetterInjectedController(); // ctor setter injected controller
        setterInjectedController.setGreetingService(new GreetingServiceImpl() ); // set service in controller
    }
    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HI, setterInjectedController.sayHello()); // test setter injector
    }
}