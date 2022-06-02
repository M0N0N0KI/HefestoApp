package com.hapi.hapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HapiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception{
		String ENV_PORT = System.getenv().get("PORT");
    	String ENV_DYNO = System.getenv().get("DYNO");
    	if(ENV_PORT != null && ENV_DYNO != null) {
        	System.getProperties().put("server.port", ENV_PORT);
    	}
		SpringApplication.run(HapiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder aplicacao)
	{
		return aplicacao.sources(HapiApplication.class);
	}

}
