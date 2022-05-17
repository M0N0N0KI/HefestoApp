package com.hapi.hapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HapiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HapiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder aplicacao)
	{
		return aplicacao.sources(HapiApplication.class);
	}

}
