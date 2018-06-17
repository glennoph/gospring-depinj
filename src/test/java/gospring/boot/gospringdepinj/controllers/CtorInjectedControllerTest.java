package gospring.boot.gospringdepinj.controllers;

import gospring.boot.gospringdepinj.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CtorInjectedControllerTest {
    private  CtorInjectedController ctorInjectedController;
    private  GreetingServiceImpl greetingServiceImpl;

    @Before
    public void setUp() throws Exception {
        ctorInjectedController = new CtorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        System.out.println("testSayHello");
        assertEquals(GreetingServiceImpl.HI, ctorInjectedController.sayHello());
    }
}