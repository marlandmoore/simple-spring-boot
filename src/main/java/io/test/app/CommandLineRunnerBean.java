package io.test.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

 
@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private Environment env;
	     
	
	@Override
	public void run(String... args) throws Exception {
		RestTemplateBuilder builder = new RestTemplateBuilder();
		RestTemplate restTemplate = builder.build();
        logger.info("ApplicationStartupRunner run method Started !!");
		System.out.println("property - "+env.getProperty("some.property"));
    }
	
	
}