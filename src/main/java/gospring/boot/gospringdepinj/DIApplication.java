package gospring.boot.gospringdepinj;

import gospring.boot.gospringdepinj.controllers.CtorInjectedController;
import gospring.boot.gospringdepinj.controllers.MyController;
import gospring.boot.gospringdepinj.controllers.SetterInjectedController;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.apache.commons.logging.Log;

@SpringBootApplication
public class DIApplication {

	public static void main(String[] args) {
		log.info("* setup application context");
		ApplicationContext ctx = SpringApplication.run(DIApplication.class, args);
        log.info("* get bean my controller");
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();
        log.info("* ctor injector");
        // constructor dependency injection
        CtorInjectedController ctorInjectedController = ctx.getBean(CtorInjectedController.class);
        log.info(ctorInjectedController.sayHello());
        log.info("* setter injection");
        // setter dependency injection
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
        log.info(setterInjectedController.sayHello());
	}

	static Log log = LogFactory.getLog(DIApplication.class.getName());
}
