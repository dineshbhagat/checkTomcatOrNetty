package com.example.checktomcatornetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckTomcatOrNettyApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(CheckTomcatOrNettyApplication.class)
//				.web(WebApplicationType.REACTIVE) // .REACTIVE, .SERVLET
//				.run(args);
		SpringApplication.run(CheckTomcatOrNettyApplication.class, args);
	}

}
