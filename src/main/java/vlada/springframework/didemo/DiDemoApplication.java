package vlada.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vlada.springframework.didemo.controllers.ConstructorInjectedController;
import vlada.springframework.didemo.controllers.MyController;
import vlada.springframework.didemo.controllers.PropertyInjectedController;
import vlada.springframework.didemo.controllers.SetterInjectedController;


@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.printf(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.printf(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.printf(ctx.getBean(ConstructorInjectedController.class).sayHello());



    }

}
