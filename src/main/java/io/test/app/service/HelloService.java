package io.test.app.service;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private Environment env;
	
	public String getProperty(){
		System.out.println("property - "+env.getProperty("some.property"));
		return env.getProperty("some.property");
	}
}