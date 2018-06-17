package gospring.boot.gospringdepinj;

import gospring.boot.gospringdepinj.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DIApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();
	}
}
