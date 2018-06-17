package gospring.boot.gospringdepinj;

import gospring.boot.gospringdepinj.controllers.CtorInjectedController;
import gospring.boot.gospringdepinj.controllers.MyController;
import gospring.boot.gospringdepinj.controllers.SetterInjectedController;
import gospring.boot.gospringdepinj.services.GreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication {

	public static void main(String[] args) {
		System.out.println("* setup application context");
		ApplicationContext ctx = SpringApplication.run(DIApplication.class, args);
		System.out.println("* get bean my controller");
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();
		System.out.println("* ctor injector");
		System.out.println(ctx.getBean(CtorInjectedController.class).sayHello());
		System.out.println("* setter injection");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		//setterInjectedController.setGreetingService(new GreetingServiceImpl());
		System.out.println(setterInjectedController.sayHello());
	}
}
