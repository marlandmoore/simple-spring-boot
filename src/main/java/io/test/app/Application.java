package io.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import io.test.app.service.HelloService;
 
@SpringBootApplication
public class Application  {

    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		HelloService service =  context.getBean(HelloService.class);
		System.out.println(service.getProperty());
		context.close();
    }
     

}